package main.symbolTable;


import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.utility.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.type.AddressPayable;
import main.ast.nodes.expression.type.TupleType;
import main.ast.nodes.expression.type.UserDefinedTypeName;
import main.ast.nodes.expression.type.primitive.*;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.SymbolTableItem;
import main.symbolTable.utils.stack.Stack;
import main.visitor.TypeEvaluator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class SymbolTable {

    //Start of static members

    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();

    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }

    public static void pop() {
        top = stack.pop();
    }

    //End of static members

    public SymbolTable pre;
    private Map<String, SymbolTableItem> items;

    public SymbolTable() {
        this(null);
    }

    public SymbolTable(SymbolTable pre) {
        this.pre = pre;
        this.items = new HashMap<>();
    }

    public static Stack<SymbolTable> getStack() {
        return stack;
    }

    public void put(SymbolTableItem item) throws ItemAlreadyExistsException {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExistsException();
        items.put(item.getKey(), item);
    }

    public SymbolTableItem getItem(String key, Boolean searchCurrent) throws ItemNotFoundException {
        Set<SymbolTable> visitedSymbolTables = new HashSet<>();
        SymbolTable currentSymbolTable = this;
        if(!searchCurrent) {
            visitedSymbolTables.add(this);
            currentSymbolTable = this.pre;
        }
        while((currentSymbolTable != null) && (!visitedSymbolTables.contains(currentSymbolTable))) {
            visitedSymbolTables.add( currentSymbolTable );
            SymbolTableItem symbolTableItem = currentSymbolTable.items.get(key);
            if( symbolTableItem != null )
                return symbolTableItem;
            currentSymbolTable = currentSymbolTable.pre;
        }
        throw new ItemNotFoundException();
    }

    public int getItemsSize() {
        return this.items.size();
    }


    public SymbolTableItem getFunctionItem(Expression functionName, FunctionCallArguments args, TypeEvaluator typeEvaluator) throws ItemNotFoundException {
        Set<SymbolTable> visitedSymbolTables = new HashSet<>();
        SymbolTable currentSymbolTable = this;

        while (currentSymbolTable != null && !visitedSymbolTables.contains(currentSymbolTable)) {
            visitedSymbolTables.add(currentSymbolTable);

            for (SymbolTableItem item : currentSymbolTable.items.values()) {
                if (item instanceof FunctionSymbolTableItem) {
                    FunctionSymbolTableItem functionItem = (FunctionSymbolTableItem) item;

                    // Check if function name matches
                    if (functionItem.getKey().equals("Function_" + extractName(functionName))) {
                        // Check if argument types match
                        if (areArgumentTypesMatching(functionItem, args, typeEvaluator)) {
                            return functionItem;
                        }
                    }
                }
            }
            currentSymbolTable = currentSymbolTable.pre;
        }

        throw new ItemNotFoundException();
    }

    // Helper method to extract the name from the functionName Expression
    private String extractName(Expression functionName) {
        if (functionName instanceof Identifier) {
            return ((Identifier) functionName).getName();
        } else if (functionName instanceof ObjectCreation) {
            return "ObjectCreation_" + ((ObjectCreation) functionName).getType().toString();
        } else if (functionName instanceof AccessExpression) {
            AccessExpression accessExpr = (AccessExpression) functionName;
            return "MethodCall_" + accessExpr.getMember().getName();
        } else if (functionName instanceof StructInitializationExpression) {
            StructInitializationExpression structInit = (StructInitializationExpression) functionName;
            if (structInit.getName() instanceof Identifier) {
                return "StructInitialization_" + ((Identifier) structInit.getName()).getName();
            } else {
                return "StructInitialization_" + extractName(structInit.getName());
            }
        } else if (functionName instanceof FunctionCallExpression) {
            return extractName(((FunctionCallExpression) functionName).getFunctionName());
        } else {
            return functionName.toString();
        }
    }


    // Helper method to match argument types with function signature
    private boolean areArgumentTypesMatching(FunctionSymbolTableItem functionItem, FunctionCallArguments args, TypeEvaluator typeEvaluator) {
        ParameterList functionParams = functionItem.getReturnParameterList();

        // Handle ExpressionList
        if (args instanceof ExpressionList) {
            ExpressionList expressionList = (ExpressionList) args;

            // If argument count does not match, return false
            if (expressionList.getExpressionList().size() != functionParams.getParameters().size()) {
                return false;
            }

            // Compare each argument type
            for (int i = 0; i < expressionList.getExpressionList().size(); i++) {
                Type argumentType = expressionList.getExpressionList().get(i).accept(typeEvaluator); // Infer type of the argument
                Type functionParamType = functionParams.getParameters().get(i).getType();

                // Check if types are compatible
                if (!areTypesCompatible(argumentType, functionParamType)) {
                    return false;
                }
            }
            return true;
        }

        // Handle NameValueList
        if (args instanceof NameValueList) {
            NameValueList nameValueList = (NameValueList) args;

            // If argument count does not match, return false
            if (nameValueList.getNameValues().size() != functionParams.getParameters().size()) {
                return false;
            }

            // Compare each argument name and type
            for (int i = 0; i < nameValueList.getNameValues().size(); i++) {
                NameValue nameValue = nameValueList.getNameValues().get(i);
                Type argumentType = nameValue.getValue().accept(typeEvaluator); // Infer type of the value
                Identifier argumentName = nameValue.getKey();
                Parameter param = functionParams.getParameters().get(i);

                // Check if names and types match
                if (!argumentName.getName().equals(param.getIdentifier().getName()) ||
                        !areTypesCompatible(argumentType, param.getType())) {
                    return false;
                }
            }
            return true;
        }

        // If we reach here, the arguments format is unsupported
        return false;
    }


    private boolean areTypesCompatible(Type argumentType, Type parameterType) {
        // Handle UintType and IntType compatibility
        if ((argumentType instanceof UintType && parameterType instanceof UintType) ||
                (argumentType instanceof IntType && parameterType instanceof IntType)) {
            return true;
        }

        // Handle fixed-point types (UfixedType and FixedType)
        if ((argumentType instanceof UfixedType && parameterType instanceof UfixedType) ||
                (argumentType instanceof FixedType && parameterType instanceof FixedType)) {
            return true;
        }

        // Handle address types (AddressType and AddressPayable)
        if ((argumentType instanceof AddressType && parameterType instanceof AddressType) ||
                (argumentType instanceof AddressPayable && parameterType instanceof AddressPayable)) {
            return true;
        }

        // Handle boolean types
        if (argumentType instanceof BoolType && parameterType instanceof BoolType) {
            return true;
        }

        // Handle string types
        if (argumentType instanceof StringType && parameterType instanceof StringType) {
            return true;
        }

        // Handle List types
        if (argumentType instanceof ListType && parameterType instanceof ListType) {
            ListType argListType = (ListType) argumentType;
            ListType paramListType = (ListType) parameterType;
            return areTypesCompatible(argListType.getType(), paramListType.getType());
        }

        // Handle user-defined types (check if both are UserDefinedTypeName)
        if (argumentType instanceof UserDefinedTypeName && parameterType instanceof UserDefinedTypeName) {
            UserDefinedTypeName argUDT = (UserDefinedTypeName) argumentType;
            UserDefinedTypeName paramUDT = (UserDefinedTypeName) parameterType;
            // Check if the type chains are equal
            return argUDT.getTypeChain().equals(paramUDT.getTypeChain());
        }

        // Handle tuple types
        if (argumentType instanceof TupleType && parameterType instanceof TupleType) {
            TupleType argTupleType = (TupleType) argumentType;
            TupleType paramTupleType = (TupleType) parameterType;
            if (argTupleType.getElementTypes().size() != paramTupleType.getElementTypes().size()) {
                return false;
            }
            for (int i = 0; i < argTupleType.getElementTypes().size(); i++) {
                if (!areTypesCompatible(argTupleType.getElementTypes().get(i), paramTupleType.getElementTypes().get(i))) {
                    return false;
                }
            }
            return true;
        }

        // If the types are not specifically handled, fall back to comparing their class types
        return argumentType.getClass().equals(parameterType.getClass());
    }


}
