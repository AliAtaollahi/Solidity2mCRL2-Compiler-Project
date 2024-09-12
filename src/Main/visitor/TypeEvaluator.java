package main.visitor;

import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.utility.FunctionCallArguments;
import main.ast.nodes.declaration.utility.Parameter;
import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.modifier.Modifier;
import main.ast.nodes.expression.modifier.ModifierInvocation;
import main.ast.nodes.expression.modifier.OtherModifers;
import main.ast.nodes.expression.modifier.OverrideSpecifier;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.primary.*;
import main.ast.nodes.expression.type.*;
import main.ast.nodes.expression.type.primitive.BoolType;
import main.ast.nodes.expression.type.primitive.ListType;
import main.ast.nodes.expression.type.primitive.StringType;
import main.ast.nodes.expression.type.primitive.UintType;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.*;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.ast.nodes.expression.value.EnumValue;
import main.ast.nodes.expression.value.ImportPath;
import main.ast.nodes.expression.value.StorageLocation;

import java.util.ArrayList;

import static main.ast.nodes.expression.operators.UnaryOperator.*;
import static main.ast.nodes.expression.operators.UserDefinableOperator.*;

public class TypeEvaluator extends Visitor<Type> {

    private SymbolTable symbolTable;

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
        Type operandType = unaryExpression.getExpression().accept(this);

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
        // First, resolve the type of the function being called (functionName)
        Expression functionName = functionCallExpression.getFunctionName();
        FunctionCallArguments args = functionCallExpression.getArgs();

        // Use the symbol table to get the matching function based on name and argument types
        try {
            SymbolTableItem functionItem = this.symbolTable.getFunctionItem(functionName, args, this);
            if (functionItem instanceof FunctionSymbolTableItem) {
                // Get the return type of the function from the function definition
                FunctionSymbolTableItem functionSymbolItem = (FunctionSymbolTableItem) functionItem;
                ParameterList returnParams = functionSymbolItem.getReturnParameterList();
                if (returnParams != null && !returnParams.getParameters().isEmpty()) {
                    return returnParams.getParameters().get(0).getType();  // Assuming single return type for simplicity
                }
            }
        } catch (ItemNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return null; // Return null if the type cannot be inferred.
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

    // AccessExpression Type Inference (e.g., struct.member or contract.function())
    @Override
    public Type visit(AccessExpression accessExpression) {
//        Type masterType = accessExpression.getMaster().accept(this);
//        // Infer type of the member (could be a struct field or contract method return type)
//        return resolveTypeFromIdentifier(accessExpression.getMember());
        // Step 1: Get the type of the master expression (could be another AccessExpression, contract, struct, etc.)
        Type masterType = accessExpression.getMaster().accept(this);

        // Step 2: Check if the master is a contract or a struct
        if (masterType instanceof UserDefinedTypeName) {
            // Master is a user-defined type, so it could be a contract or struct.
            return resolveMemberFromContractOrStruct((UserDefinedTypeName) masterType, accessExpression.getMember());
        } else if (masterType instanceof TupleType) {
            // Handle TupleType member access
            return resolveTupleMember((TupleType) masterType, accessExpression.getMember());
        } else {
            System.err.println("Unsupported master type in access expression: " + masterType);
            return null;
        }
    }

    private Type resolveMemberFromContractOrStruct(UserDefinedTypeName masterType, Identifier member) {
        String typeName = masterType.getTypeChain().get(0).getName(); // Get the contract or struct name

        try {
            // Look for the contract or struct in the symbol table
            SymbolTableItem item = this.symbolTable.getItem(typeName, true);

            if (item instanceof ContractSymbolTableItem) {
                // If it's a contract, resolve the member (could be a variable or function)
                ContractSymbolTableItem contractItem = (ContractSymbolTableItem) item;
                SymbolTable contractSymbolTable = contractItem.getContractSymbolTable();
                return resolveMemberFromSymbolTable(contractSymbolTable, member);
            } else if (item instanceof StructSymbolTableItem) {
                // If it's a struct, resolve the member as a struct field
                StructSymbolTableItem structItem = (StructSymbolTableItem) item;
                SymbolTable structSymbolTable = structItem.getSymbolTable();
                return resolveMemberFromSymbolTable(structSymbolTable, member);
            }
        } catch (ItemNotFoundException e) {
            System.err.println("Contract or struct " + typeName + " not found in symbol table.");
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
            SymbolTableItem memberItem = symbolTable.getItem(member.getName(), true);

            if (memberItem instanceof VariableDeclarationSymbolTableItem) {
                return ((VariableDeclarationSymbolTableItem) memberItem).getType();  // Return the type of the variable
            } else if (memberItem instanceof FunctionSymbolTableItem) {
                return getFunctionReturnType((FunctionSymbolTableItem) memberItem);  // Get and return the function's return type
            } else {
                System.err.println("Unsupported member type for " + member.getName());
            }
        } catch (ItemNotFoundException e) {
            System.err.println("Member " + member.getName() + " not found in symbol table.");
        }
        return null;
    }

    private Type getFunctionReturnType(FunctionSymbolTableItem functionItem) {
        ParameterList returnParams = functionItem.getReturnParameterList();

        // Check if the function has return parameters
        if (returnParams == null || returnParams.getParameters().isEmpty()) {
            System.err.println("Function has no return parameters.");
            return null;  // No return value
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
            if (item instanceof VariableDeclarationSymbolTableItem) {
                return ((VariableDeclarationSymbolTableItem) item).getType();
            }
        } catch (ItemNotFoundException e) {
            // Handle item not found case.
            System.err.println("Error: " + e.getMessage());
        }
        return null; // Return null if the type cannot be inferred.
    }
}
