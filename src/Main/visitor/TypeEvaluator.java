package main.visitor;

import main.ast.nodes.declaration.ContractDefinition;
import main.ast.nodes.declaration.FunctionDefinition;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.utility.ExpressionList;
import main.ast.nodes.declaration.utility.FunctionCallArguments;
import main.ast.nodes.declaration.utility.Parameter;
import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.modifier.ModifierInvocation;
import main.ast.nodes.expression.modifier.OtherModifers;
import main.ast.nodes.expression.modifier.OverrideSpecifier;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.type.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.primary.*;
import main.ast.nodes.expression.type.*;
import main.ast.nodes.expression.type.primitive.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.*;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.ast.nodes.expression.value.EnumValue;
import main.ast.nodes.expression.value.ImportPath;
import main.ast.nodes.expression.value.StorageLocation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static main.ast.nodes.expression.operators.UnaryOperator.*;
import static main.ast.nodes.expression.operators.UserDefinableOperator.*;

public class TypeEvaluator extends Visitor<Type> {

    private SymbolTable symbolTable;
    private SymbolTableItem currentItemFoundFromSymbolTable;
    private boolean checkDelegatecall = false;
    private ArrayList<SymbolTableItem> currentDelegatecallFunctionsFound = new ArrayList<>();
    private StructDefinitionSymbolTableItem currentStructDefinitionSymbolTableItem;

    public TypeEvaluator(SymbolTable symbolTable_) {
        this.symbolTable = symbolTable_;
    }

    // BinaryExpression Type Inference
    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Type leftType = binaryExpression.getFirstOperand().accept(this);
        Type rightType = binaryExpression.getSecondOperand().accept(this);
        BinaryOperator operator = binaryExpression.getBinaryOperator();

        // Arithmetic operations: assume both operands are of the same type.
        if (operator.isArithmeticOperator()) {
            return leftType;
        }
        // Logical operations always return bool.
        else if (operator.isLogicalOperator()) {
            return new BoolType();
        }
        // Comparisons return bool.
        else if (operator.isComparisonOperator()) {
            return new BoolType();
        }
        // Bitwise operations maintain operand types.
        else if (operator.isBitwiseOperator()) {
            return leftType;
        }
        // Assignment operators return the left operand type.
        else if (operator == BinaryOperator.ASSIGNMENT ||
                operator == BinaryOperator.ADDITION_ASSIGNMENT ||
                operator == BinaryOperator.SUBTRACTION_ASSIGNMENT ||
                operator == BinaryOperator.MULTIPLICATION_ASSIGNMENT ||
                operator == BinaryOperator.DIVISION_ASSIGNMENT ||
                operator == BinaryOperator.MODULUS_ASSIGNMENT ||
                operator == BinaryOperator.BITWISE_OR_ASSIGNMENT ||
                operator == BinaryOperator.BITWISE_XOR_ASSIGNMENT ||
                operator == BinaryOperator.BITWISE_AND_ASSIGNMENT ||
                operator == BinaryOperator.LEFT_SHIFT_ASSIGNMENT ||
                operator == BinaryOperator.RIGHT_SHIFT_ASSIGNMENT) {
            return leftType;  // Assignment operators return the left-hand side type
        }
        // Ternary operator returns the type of trueResult or falseResult if they match.
        else if (operator == BinaryOperator.TERNARY_OPERATOR) {
            if (leftType.equals(rightType)) {
                return leftType;
            } else {
                // Handle more complex cases as needed.
                return null;
            }
        }
        // Indexing and slicing should return the type of the element being accessed.
        else if (operator == BinaryOperator.INDEXING ||
                operator == BinaryOperator.SLICING ||
                operator == BinaryOperator.SLICING_RANGE) {
            return leftType;
        }
        // Handle any other cases if necessary
        else {
            // Return a default or error type if the operator is not recognized.
            return null;
        }
    }

    // Helper method to infer the type of an element in an array or collection.
    private Type inferElementType(Type collectionType) {
        // This can be extended to handle more complex type inference logic for collections/arrays.
        if (collectionType instanceof ListType) {
            return ((ListType) collectionType).getType();
        }
        return null;
    }


    // UnaryExpression Type Inference
    @Override
    public Type visit(UnaryExpression unaryExpression) {
        if (unaryExpression.getExpression() instanceof ParenthesizedExpression parenthesizedExpression) {
            unaryExpression.setExpression(parenthesizedExpression.getExpression());
        }
        Type operandType = unaryExpression.getExpression().accept(this);

        if(unaryExpression.getOp().equals(NOT)) {
            return new BoolType();
        }

        // Ensure the operand type is not null before proceeding.
        if (operandType == null) {
            throw new RuntimeException("Error: Unable to resolve type for unary expression operand.");
        }

        switch (unaryExpression.getOp()) {
            case NOT:
                // Logical NOT should return a boolean type.
                if (!(operandType instanceof BoolType)) {
                    throw new RuntimeException("Error: Logical NOT can only be applied to boolean expressions.");
                }
                return new BoolType();

            case PRE_INCREMENT:
            case POST_INCREMENT:
            case PRE_DECREMENT:
            case POST_DECREMENT:
            case PLUS:
            case MINUS:
                // These operations generally apply to numeric types.
                if (!(operandType instanceof UintType)) {
                    throw new RuntimeException("Error: Arithmetic operations can only be applied to numeric types.");
                }
                return operandType;

            case TILDE:
                // Bitwise NOT (~) should only be applied to integer types.
                if (!(operandType instanceof UintType)) {
                    throw new RuntimeException("Error: Bitwise NOT can only be applied to integer types.");
                }
                return operandType;

            default:
                throw new RuntimeException("Error: Unsupported unary operator.");
        }
    }

    // FunctionCallExpression Type Inference
    @Override
    public Type visit(FunctionCallExpression functionCallExpression) {
        if(functionCallExpression.getFunctionName() instanceof Identifier && ((Identifier) functionCallExpression.getFunctionName()).getName().equals("address")) {
            return new AddressType();
        }

        Expression functionName = functionCallExpression.getFunctionName();
        FunctionCallArguments args = functionCallExpression.getArgs();

        if (functionName instanceof AccessExpression ) {
            String methodName = ((AccessExpression) functionName).getMember().getName();
            if (methodName.equals("transfer") || methodName.equals("send")) {
                Type type = (((AccessExpression) functionName).getMaster()).accept(this);
                if (type instanceof AddressPayable)
                    return new AddressType();
            }
        }

        if (functionCallExpression.getFunctionName() instanceof Identifier && ((Identifier) functionCallExpression.getFunctionName()).getName().equals("address")
         && functionCallExpression.getArgs() instanceof ExpressionList && ((ExpressionList) functionCallExpression.getArgs()).getExpressionList().size() == 1
        && ((ExpressionList) functionCallExpression.getArgs()).getExpressionList().get(0) instanceof Identifier &&
        ((Identifier) ((ExpressionList) functionCallExpression.getArgs()).getExpressionList().get(0)).getName().equals("this"))
            return new AddressType();

        // Use the symbol table to get the matching function based on name and argument types
        try {
            if (functionName instanceof Identifier) {
                try {
                    SymbolTableItem functionItem = this.symbolTable.getFunctionItem(functionName, args, this);
                    this.currentItemFoundFromSymbolTable = functionItem;
                    if (functionItem instanceof FunctionDefinitionSymbolTableItem) {
                        // Get the return type of the function from the function definition
                        FunctionDefinitionSymbolTableItem functionSymbolItem = (FunctionDefinitionSymbolTableItem) functionItem;
                        ParameterList returnParams = functionSymbolItem.getReturnParameterList();
                        if (returnParams != null && !returnParams.getParameters().isEmpty()) {
                            return returnParams.getParameters().get(0).getType();  // Assuming single return type for simplicity
                        }
                    }
                }
                catch (ItemNotFoundException e) {
                    SymbolTableItem structItem = this.symbolTable.getItem(StructInitializationExpression.START_KEY + ((Identifier)functionName).getName(), true);
                    this.currentItemFoundFromSymbolTable = structItem;
                    UserDefinedTypeName type = new UserDefinedTypeName();
                    type.addChainRing(structItem.getName());
                    return type;
                }
            }
            else if (functionName instanceof ObjectCreation objectCreation) {
                try {
                    if (objectCreation.getType() instanceof ByteUpperCaseType)
                        return new ByteUpperCaseType("");
                    if (objectCreation.getType() instanceof StringType)
                        return new StringType();
                    String contractName = ((UserDefinedTypeName)((ObjectCreation) functionName).getType()).getTypeChain().get(0).getName();
                    ContractDefinitionSymbolTableItem contractItem = ((ContractDefinitionSymbolTableItem)this.symbolTable.getItem(ContractDefinitionSymbolTableItem.START_KEY + contractName, true));
                    this.currentItemFoundFromSymbolTable = contractItem.getContractSymbolTable().getConstrcutorItem(args, this);
                    return new NoType();
                } catch (ItemNotFoundException e) {

                }
            }
            else if (functionName instanceof AccessExpression) {
                Type type = ((AccessExpression) functionName).getMaster().accept(this);
                if (type instanceof AddressType) {
                    checkIsDelegatecallAndHandle((AccessExpression) functionName, (ExpressionList) args);
                    return new AddressType();
                }
                // for Math
                String methodName = ((AccessExpression) functionName).getMember().getName();
                if (methodName.equals("add") || methodName.equals("min") ||  methodName.equals("sqrt") || methodName.equals("mul") || methodName.equals("div") || methodName.equals("sub"))
                    return type;
                if (methodName.equals("balanceOf") || methodName.equals("uqdiv") || methodName.equals("encode") || methodName.equals("take") || methodName.equals("mint") || methodName.equals("getConfigValue"))
                    return new UintType();
                if (methodName.equals("dev"))
                    return new AddressType();
                if (((AccessExpression) functionName).getMaster() instanceof Identifier identifier) {
                    if (identifier.getName().equals("TransferHelper")) {
                        UserDefinedTypeName temp = new UserDefinedTypeName();
                        temp.addChainRing("TransferHelper");
                        type = temp;
                    }
                }
                if (methodName.equals("demaxCall") || methodName.equals("transferFrom") || methodName.equals("transfer"))
                    return new NoType();
                if (methodName.equals("encodeWithSelector"))
                    return new AddressType();
                if (methodName.equals("decode") || methodName.equals("value"))
                    return new BoolType();

                String contractName = ((UserDefinedTypeName)type).getTypeChain().get(0).getName();
                ContractDefinitionSymbolTableItem contractItem = ((ContractDefinitionSymbolTableItem)this.symbolTable.getItem(ContractDefinitionSymbolTableItem.START_KEY + contractName, true));
                SymbolTableItem functionItem = contractItem.getContractSymbolTable().getFunctionItem(((AccessExpression) functionName).getMember(), args, this);
                this.currentItemFoundFromSymbolTable = functionItem;
                if (functionItem instanceof FunctionDefinitionSymbolTableItem) {
                    // Get the return type of the function from the function definition
                    FunctionDefinitionSymbolTableItem functionSymbolItem = (FunctionDefinitionSymbolTableItem) functionItem;
                    ParameterList returnParams = functionSymbolItem.getReturnParameterList();
                    if (returnParams != null && !returnParams.getParameters().isEmpty()) {
                        return returnParams.getParameters().get(0).getType();  // Assuming single return type for simplicity
                    }
                }
            }
        } catch (ItemNotFoundException e) {
//            System.err.println("Error: " + e.getMessage());
        }

        return null; // Return null if the type cannot be inferred.
    }

    private void checkIsDelegatecallAndHandle(AccessExpression functionName, ExpressionList args) {
        if (functionName.getMember().getName().equals("delegatecall")) {
            if (args.getExpressionList().get(0) instanceof AccessExpression accessExpression) {
                if (accessExpression.getMember().getName().equals("data")) {
                    // meow
                    return;
                }
            }
            String calledFunctionName = ((StringLiteral)((ExpressionList)((FunctionCallExpression) args.getExpressionList().getFirst()).getArgs()).getExpressionList().getFirst()).getValue();
            for (SymbolTableItem item : SymbolTable.root.items.values()) {
                if (item instanceof ContractDefinitionSymbolTableItem) {
                    for (SymbolTableItem item1 : ((ContractDefinitionSymbolTableItem)item).getContractSymbolTable().items.values()) {
                        if (item1 instanceof FunctionDefinitionSymbolTableItem && ((FunctionDefinitionSymbolTableItem)item1).getFunctionName().equals(calledFunctionName.substring(1, calledFunctionName.indexOf('(')))) {
                            FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem = (FunctionDefinitionSymbolTableItem) item1;
                            ArrayList<Parameter> parameters = functionDefinitionSymbolTableItem.getFunctionDefinitionPointer().getParameterList().getParameters();

                            String paramTypes = calledFunctionName.substring(calledFunctionName.indexOf('(') + 1, calledFunctionName.indexOf(')'));

                            String[] extractedTypes = paramTypes.split(",\\s*");

                            if (extractedTypes.length != parameters.size()) {
                                continue;
                            }

                            for (int i = 0; i < extractedTypes.length; i++) {
                                Type paramType = parameters.get(i).getType();
                                String extractedType = extractedTypes[i];

                                // Assuming you have a method `isTypeCompatible` to match string representation of types with actual types
                                if (!isTypeCompatible(extractedType, paramType)) {
                                    continue;
                                }
                            }

                            this.currentDelegatecallFunctionsFound.add(item1);
                        }
                    }
                }
            }
        }
    }

    private static boolean isTypeCompatible(String extractedType, Type paramType) {
        // Handle uint types of any size
        if (paramType instanceof UintType && extractedType.startsWith("uint")) {
            UintType uintType = (UintType) paramType;
            String expectedBits = uintType.getNumberOfBits();
            String extractedBits = extractedType.replaceAll("\\D+", ""); // Extract digits from the type
            return expectedBits.isEmpty() || extractedBits.equals(expectedBits); // Handle default "uint" and specific "uint256"
        }

        // Handle int types of any size
        if (paramType instanceof IntType && extractedType.startsWith("int")) {
            IntType intType = (IntType) paramType;
            String expectedBits = intType.getNumberOfBits();
            String extractedBits = extractedType.replaceAll("\\D+", ""); // Extract digits from the type
            return expectedBits.isEmpty() || extractedBits.equals(expectedBits); // Handle default "int" and specific "int256"
        }

        // Handle address type
        if (paramType instanceof AddressType && extractedType.equals("address")) {
            return true;
        }

        // Handle payable address type
        if (paramType instanceof AddressPayable && extractedType.equals("address")) {
            return true;
        }

        // Handle bool type
        if (paramType instanceof BoolType && extractedType.equals("bool")) {
            return true;
        }

        // Handle string type
        if (paramType instanceof StringType && extractedType.equals("string")) {
            return true;
        }

        // Handle fixed-point types
        if (paramType instanceof FixedType && extractedType.startsWith("fixed")) {
            FixedType fixedType = (FixedType) paramType;
            String expectedBits = fixedType.getNumberOfBits();
            String extractedBits = extractedType.replaceAll("\\D+", ""); // Extract digits from the type
            return extractedBits.equals(expectedBits);
        }

        // Handle ufixed-point types
        if (paramType instanceof UfixedType && extractedType.startsWith("ufixed")) {
            UfixedType ufixedType = (UfixedType) paramType;
            String expectedBits = ufixedType.getNumberOfBits();
            String extractedBits = extractedType.replaceAll("\\D+", ""); // Extract digits from the type
            return extractedBits.equals(expectedBits);
        }

        // Handle list type (dynamic and fixed arrays)
        if (paramType instanceof ListType && extractedType.endsWith("[]")) {
            String baseType = extractedType.substring(0, extractedType.length() - 2); // remove "[]"
            ListType listType = (ListType) paramType;
            return isTypeCompatible(baseType, listType.getType()); // Recursively check base type
        }

        // Handle fixed-size array (e.g., uint256[10])
        if (paramType instanceof ListType && extractedType.matches(".*\\[\\d+\\]")) {
            // Extract the base type (e.g., "uint256" from "uint256[10]")
            String baseType = extractedType.substring(0, extractedType.indexOf('['));
            ListType listType = (ListType) paramType;
            return isTypeCompatible(baseType, listType.getType()); // Recursively check base type
        }

        // Handle tuple types
        if (paramType instanceof TupleType) {
            TupleType tupleType = (TupleType) paramType;
            String[] extractedTupleTypes = extractedType
                    .substring(1, extractedType.length() - 1) // Remove parentheses ()
                    .split(",\\s*"); // Split by comma and remove any extra spaces
            if (tupleType.getElementTypes().size() != extractedTupleTypes.length) {
                return false;
            }
            for (int i = 0; i < extractedTupleTypes.length; i++) {
                if (!isTypeCompatible(extractedTupleTypes[i], tupleType.getElementTypes().get(i))) {
                    return false;
                }
            }
            return true;
        }

        // Handle user-defined types (structs, contracts)
        if (paramType instanceof UserDefinedTypeName) {
            UserDefinedTypeName userType = (UserDefinedTypeName) paramType;
            String typeNameFromChain = userType.getTypeChain().get(userType.getTypeChain().size() - 1).getName(); // Get the last element in the type chain
            return extractedType.equals(typeNameFromChain);
        }

        // Default fallback: return false for unmatched types
        return false;
    }


    // TernaryOperatorExpression Type Inference
    @Override
    public Type visit(TernaryOperatorExpression ternaryOperatorExpression) {
        Type trueType = ternaryOperatorExpression.getTrueResult().accept(this);
        Type falseType = ternaryOperatorExpression.getFalseResult().accept(this);

        // If both types match, return that type, otherwise we might have a more complex resolution.
        if (trueType.equals(falseType)) {
            return trueType;
        }
        return null; // In a real-world scenario, you'd handle this case more robustly.
    }

    // RequireExpression Type Inference
    @Override
    public Type visit(RequireExpression requireExpression) {
        return new BoolType(); // Require expressions always expect a boolean condition.
    }

    @Override
    public Type visit(AccessExpression accessExpression) {
        if (accessExpression == null) {
            System.err.println("Error: Master expression is null in access expression.");
            return null;
        }

        // for built-in variables
        if (accessExpression.getMaster() instanceof Identifier && ((Identifier) accessExpression.getMaster()).getName().equals("msg")) {
            if (accessExpression.getMember().getName().equals("sender")) {
                return new AddressType();
            }
            else if (accessExpression.getMember().getName().equals("value")) {
                return new UintType("");
            }
        }

        if (accessExpression.getMember().getName().equals("balance") &&
            accessExpression.getMaster() instanceof FunctionCallExpression &&
            FunctionDefinition.extractName(((FunctionCallExpression) accessExpression.getMaster()).getFunctionName()).equals("address") &&
            ((FunctionCallExpression) accessExpression.getMaster()).getArgs() instanceof ExpressionList &&
                ((ExpressionList) ((FunctionCallExpression) accessExpression.getMaster()).getArgs()).getExpressionList().size() == 1 &&
                ((ExpressionList) ((FunctionCallExpression) accessExpression.getMaster()).getArgs()).getExpressionList().get(0) instanceof Identifier &&
                ((Identifier) ((ExpressionList) ((FunctionCallExpression) accessExpression.getMaster()).getArgs()).getExpressionList().get(0)).getName().equals("this")) {

            return new UintType("");
        }

        ContractDefinitionSymbolTableItem contractDefinitionSymbolTableItem = null;
        try {
            contractDefinitionSymbolTableItem = symbolTable.findFirstContractDefinition(accessExpression, this.symbolTable.pre);
            UserDefinedTypeName userDefinedTypeName = new UserDefinedTypeName();
            userDefinedTypeName.addChainRing(contractDefinitionSymbolTableItem.getContractName());
            return userDefinedTypeName;
        } catch (Exception e) {
//            System.out.println("Maybe fallback");
        }



        // Check if the master is a contract by looking it up in the symbol table
        try {
            if (contractDefinitionSymbolTableItem != null) {
                SymbolTable contractSymbolTable = contractDefinitionSymbolTableItem.getContractSymbolTable();

                // Now we need to look up the member in this contract's symbol table
                String memberName = accessExpression.getMember().getName();
                SymbolTableItem memberItem = contractSymbolTable.getItem(FunctionDefinition.START_KEY + memberName, true);
                this.currentItemFoundFromSymbolTable = memberItem;

                // If the member is found, return its type
                if (memberItem instanceof VariableDeclarationSymbolTableItem) {
                    return ((VariableDeclarationSymbolTableItem) memberItem).getType();
                } else if (memberItem instanceof FunctionDefinitionSymbolTableItem) {
                    try {
                        return getFunctionReturnType((FunctionDefinitionSymbolTableItem) memberItem);
                    } catch (ItemNotFoundException e) {
                        Type noType = new NoType();
                        noType.setLine(accessExpression.getLine());
                        return new NoType();
                    }
                } else {
                    System.err.println("Unsupported member type for '" + memberName + "' in contract ");
                    return null;
                }
            }
        } catch (ItemNotFoundException e) {
            System.err.println("Error: Contract definition not found.");
            return null;
        }

        if (accessExpression.getMaster() instanceof BinaryExpression && ((BinaryExpression) accessExpression.getMaster()).getBinaryOperator().equals(BinaryOperator.INDEXING)){
            UserDefinedTypeName userDefinedTypeName = new UserDefinedTypeName();
            userDefinedTypeName.addChainRing(((Identifier)((BinaryExpression) accessExpression.getMaster()).getFirstOperand()).getName());
            return resolveMemberFromContractOrStruct(userDefinedTypeName, accessExpression.getMember());
        }

        Type masterType = accessExpression.getMaster().accept(this);

        // Handle other types, such as tuples or structs
        if (accessExpression.getMember().getName().equals("length"))
            return new UintType();

        if (accessExpression.getMaster() instanceof Identifier && ((Identifier) accessExpression.getMaster()).getName().equals("block"))
            return new UintType();

        if (accessExpression.getMember().getName().equals("call"))
            return new AddressType();

        if (masterType instanceof UserDefinedTypeName) {
            return resolveMemberFromContractOrStruct((UserDefinedTypeName) masterType, accessExpression.getMember());
        } else if (masterType instanceof TupleType) {
            return resolveTupleMember((TupleType) masterType, accessExpression.getMember());
        } else if (masterType instanceof Mapping mapping) {
            return mapping.getMappingValue();
        } else {
            System.err.println("Unsupported master type in access expression: " + masterType);
            return null;
        }
    }


    private Type resolveMemberFromContractOrStruct(UserDefinedTypeName masterType, Identifier member) {
        String typeName = masterType.getTypeChain().get(0).getName(); // Get the contract or struct name

        try {
            SymbolTableItem structItem = this.symbolTable.getItem(StructInitializationExpression.START_KEY + typeName, true);
            this.currentItemFoundFromSymbolTable = structItem;
            return resolveMemberFromSymbolTable(((StructDefinitionSymbolTableItem)structItem).getSymbolTable(), member);
        } catch (ItemNotFoundException e) {
            try {
                SymbolTableItem item = this.symbolTable.getItem(ContractDefinitionSymbolTableItem.START_KEY + typeName, true);
                this.currentItemFoundFromSymbolTable = item;
                return resolveMemberFromSymbolTable(((ContractDefinitionSymbolTableItem)item).getContractSymbolTable(), member);
            } catch (ItemNotFoundException e1) {

            }
        }

        return null; // Return null if not found
    }

    private Type resolveTupleMember(TupleType tupleType, Identifier member) {
        try {
            int index = Integer.parseInt(member.getName());
            return tupleType.getElementTypes().get(index);  // Fetch the type at the tuple index
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.err.println("Invalid tuple access: " + member.getName());
        }
        return null;
    }

    private Type resolveMemberFromSymbolTable(SymbolTable symbolTable, Identifier member) {
        try {
            VariableDeclarationSymbolTableItem item = (VariableDeclarationSymbolTableItem) this.symbolTable.getItem(VariableDeclarationSymbolTableItem.START_KEY + member.getName(), true);
            this.currentItemFoundFromSymbolTable = item;
            return item.getType();
        } catch (ItemNotFoundException e) {

        }

        try {
            FunctionDefinitionSymbolTableItem item = (FunctionDefinitionSymbolTableItem) this.symbolTable.getItem(FunctionDefinition.START_KEY + member.getName(), true);
            this.currentItemFoundFromSymbolTable = item;
            return getFunctionReturnType(item);
        } catch (ItemNotFoundException e) {

        }

        return null;
    }

    private Type getFunctionReturnType(FunctionDefinitionSymbolTableItem functionItem) throws ItemNotFoundException {
        ParameterList returnParams = functionItem.getReturnParameterList();

        // Check if the function has return parameters
        if (returnParams == null || returnParams.getParameters().isEmpty()) {
            throw new ItemNotFoundException();
        }

        // For now, we return the first return type if multiple return types exist (can be adjusted if needed)
        Parameter firstReturnParam = returnParams.getParameters().get(0);
        return firstReturnParam.getType();  // Return the type of the first return parameter
    }


    // ObjectCreation Type Inference
    @Override
    public Type visit(ObjectCreation objectCreation) {
        return objectCreation.getType(); // Return the type of the object being created.
    }

    // ParenthesizedExpression Type Inference
    @Override
    public Type visit(ParenthesizedExpression parenthesizedExpression) {
        return parenthesizedExpression.getExpression().accept(this); // Return the type of the inner expression.
    }

    // TupleExpression Type Inference
    @Override
    public Type visit(TupleExpression tupleExpression) {
        // List to store the types of individual expressions in the tuple
        ArrayList<Type> types = new ArrayList<>();

        // Visit each expression in the tuple and get its type
        for (Expression expr : tupleExpression.getExpressions()) {
            Type exprType = expr.accept(this);  // Visit each expression to infer its type
            types.add(exprType);  // Add the inferred type to the types list
        }

        // Return a TupleType consisting of the inferred types
        return new TupleType(types);
    }


    // StructInitializationExpression Type Inference
    @Override
    public Type visit(StructInitializationExpression structInitializationExpression) {
        return structInitializationExpression.getName().accept(this); // Return the struct type.
    }

    // Literal Inference (Number, Boolean, String)
    @Override
    public Type visit(NumberLiteral numberLiteral) {
        return new UintType(); // By default, assume literals are uint.
    }

    @Override
    public Type visit(BoolType boolType) {
        return new BoolType(); // Boolean literals are always bool.
    }

    @Override
    public Type visit(StringLiteral stringLiteral) {
        return new StringType(); // String literals are always strings.
    }

    // Handle function arguments
    @Override
    public Type visit(FunctionCallArguments functionCallArguments) {
        return null; // This can be implemented if needed.
    }

    // Identifier resolution to infer the type from the symbol table
    @Override
    public Type visit(Identifier identifier) {
        return resolveTypeFromIdentifier(identifier);
    }

    // Helper to resolve type from the symbol table using an identifier
    private Type resolveTypeFromIdentifier(Identifier identifier) {
        try {
            SymbolTableItem item = this.symbolTable.getItem(VariableDeclarationSymbolTableItem.START_KEY + identifier.getName(), true);
            this.currentItemFoundFromSymbolTable = item;
            if (item instanceof VariableDeclarationSymbolTableItem) {
                return ((VariableDeclarationSymbolTableItem) item).getType();
            }
        } catch (ItemNotFoundException e) {
            try {
                SymbolTableItem item = this.symbolTable.getItem(identifier.getName(), true);
                this.currentItemFoundFromSymbolTable = item;
                if (item instanceof ParameterSymbolTableItem) {
                    return ((ParameterSymbolTableItem) item).getParameterType();
                }
            } catch (ItemNotFoundException e2) {
                try {
                    SymbolTableItem item = this.symbolTable.getItem(FunctionDefinition.START_KEY + identifier.getName(), true);
                    this.currentItemFoundFromSymbolTable = item;
                    // TODO -> bayad ReturnParameterList barresi besheh
                    if (item != null && item instanceof FunctionDefinitionSymbolTableItem) {
                        return ((FunctionDefinitionSymbolTableItem) item).getReturnParameterList().getParameters().get(0).getType();
                    }
                } catch (ItemNotFoundException e1) {
                }
                try {
                    SymbolTableItem item = this.symbolTable.getItem(StructInitializationExpression.START_KEY + identifier.getName(), true);
                    this.currentItemFoundFromSymbolTable = item;
                    if (item != null && item instanceof StructDefinitionSymbolTableItem) {
                        return ((StructDefinitionSymbolTableItem) item).getType();
                    }
                } catch (ItemNotFoundException e1) {
                }
                try {
                    SymbolTableItem item = this.symbolTable.getItem(StateVariableSymbolTableItem.START_KEY + identifier.getName(), true);
                    this.currentItemFoundFromSymbolTable = item;
                    if (item != null && item instanceof StateVariableSymbolTableItem) {
                        return ((StateVariableSymbolTableItem) item).getType();
                    }
                } catch (ItemNotFoundException e1) {
                }
                try {
                    SymbolTableItem item = this.symbolTable.getItem(ContractDefinitionSymbolTableItem.START_KEY + identifier.getName(), true);
                    this.currentItemFoundFromSymbolTable = item;
                    if (item != null && item instanceof ContractDefinitionSymbolTableItem) {
                        return ((ContractDefinitionSymbolTableItem) item).getType();
                    }
                } catch (ItemNotFoundException e1) {
                }
            }
        }

        return new NoType();
    }

    @Override
    public Type visit(Expression expression) {
        if (expression instanceof AccessExpression) {
            return this.visit((AccessExpression) expression);
        } else if (expression instanceof BinaryExpression) {
            return this.visit((BinaryExpression) expression);
        } else if (expression instanceof FunctionCallExpression) {
            return this.visit((FunctionCallExpression) expression);
        } else if (expression instanceof ObjectCreation) {
            return this.visit((ObjectCreation) expression);
        } else if (expression instanceof StructInitializationExpression) {
            return this.visit((StructInitializationExpression) expression);
        } else if (expression instanceof UnaryExpression) {
            return this.visit((UnaryExpression) expression);
        } else if (expression instanceof Modifier) {
            return this.visit((Modifier) expression);
        } else if (expression instanceof TernaryOperatorExpression) {
            return this.visit((TernaryOperatorExpression) expression);
        } else if (expression instanceof RequireExpression) {
            return this.visit((RequireExpression) expression);
        } else if (expression instanceof TupleExpression) {
            return this.visit((TupleExpression) expression);
        } else if (expression instanceof ParenthesizedExpression) {
            return this.visit((ParenthesizedExpression) expression);
        } else if (expression instanceof NumberLiteral) {
            return this.visit((NumberLiteral) expression);
        } else if (expression instanceof StringLiteral) {
            return this.visit((StringLiteral) expression);
        } else if (expression instanceof Identifier) {
            return this.visit((Identifier) expression);
        } else {
            System.out.println("Unknown Expression Type: " + expression.getClass().getSimpleName());
        }

        return null;
    }

    public SymbolTableItem getCurrentItemFoundFromSymbolTable() {
        return currentItemFoundFromSymbolTable;
    }

    public void setCurrentItemFoundFromSymbolTable(SymbolTableItem currentItemFoundFromSymbolTable) {
        this.currentItemFoundFromSymbolTable = currentItemFoundFromSymbolTable;
    }

    public boolean isCheckDelegatecall() {
        return checkDelegatecall;
    }

    public void setCheckDelegatecall(boolean checkDelegatecall) {
        this.checkDelegatecall = checkDelegatecall;
    }

    public ArrayList<SymbolTableItem> getCurrentDelegatecallFunctionsFound() {
        return currentDelegatecallFunctionsFound;
    }

    public void setCurrentDelegatecallFunctionsFound(ArrayList<SymbolTableItem> currentDelegatecallFunctionsFound) {
        this.currentDelegatecallFunctionsFound = currentDelegatecallFunctionsFound;
    }

    public StructDefinitionSymbolTableItem getCurrentStructDefinitionSymbolTableItem() {
        return currentStructDefinitionSymbolTableItem;
    }

    public void setCurrentStructDefinitionSymbolTableItem(StructDefinitionSymbolTableItem currentStructDefinitionSymbolTableItem) {
        this.currentStructDefinitionSymbolTableItem = currentStructDefinitionSymbolTableItem;
    }
}
