package test.visitor;

import main.ast.nodes.declaration.FunctionDefinition;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.utility.ExpressionList;
import main.ast.nodes.declaration.utility.FunctionCallArguments;
import main.ast.nodes.declaration.utility.Parameter;
import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.primary.*;
import main.ast.nodes.expression.type.TupleType;
import main.ast.nodes.expression.type.UserDefinedTypeName;
import main.ast.nodes.expression.type.primitive.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.VariableDeclarationSymbolTableItem;
import main.visitor.TypeEvaluator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeEvaluatorTest {

    private SymbolTable symbolTable;
    private TypeEvaluator typeEvaluator;

    @BeforeEach
    void setUp() {
        symbolTable = new SymbolTable();
        typeEvaluator = new TypeEvaluator(symbolTable);

        // Add some sample variables with types to the symbol table
        addVariableToSymbolTable("variableA", new UintType());
        addVariableToSymbolTable("variableB", new UintType());
        addVariableToSymbolTable("variableC", new UintType());
        addVariableToSymbolTable("variableD", new UintType());
        addVariableToSymbolTable("variableE", new UintType());
        addVariableToSymbolTable("variableF", new UintType());
        addVariableToSymbolTable("variableG", new UintType());
        addVariableToSymbolTable("variableH", new BoolType());
        addVariableToSymbolTable("variableI", new UintType());


        addVariableToSymbolTable("myArray", new UintType());
        addVariableToSymbolTable("index", new UintType());

        // Adding a struct or contract type
        UserDefinedTypeName myContractType = new UserDefinedTypeName();
        myContractType.addChainRing("MyContract");
        addVariableToSymbolTable("newContract", myContractType);

        UserDefinedTypeName myStructType = new UserDefinedTypeName();
        myStructType.addChainRing("MyStruct");
        addVariableToSymbolTable("myStruct", myStructType);
    }

    private void addVariableToSymbolTable(String name, Type type) {
        // Create a new VariableDeclaration object and set its name and type.
        VariableDeclaration varDeclaration = new VariableDeclaration();
        varDeclaration.setVariableName(new Identifier(name));  // Set the name as an identifier
        varDeclaration.setVariableType(type);  // Set the type

        // Create a new symbol table item for the variable
        VariableDeclarationSymbolTableItem variableItem = new VariableDeclarationSymbolTableItem(varDeclaration);

        try {
            // Add the variable to the symbol table
            symbolTable.put(variableItem);
        } catch (ItemAlreadyExistsException e) {
            // Handle the case where the variable already exists in the symbol table
            throw new RuntimeException("Variable already exists in the symbol table: " + name, e);
        }
    }

    @Test
    void testPostIncrementDecrement() {
        // Test variableA++ (post-increment)
        UnaryExpression postIncrement = new UnaryExpression(new Identifier("variableA"), UnaryOperator.POST_INCREMENT);
        assertEquals(UintType.class, postIncrement.accept(typeEvaluator).getClass());

        // Test variableB-- (post-decrement)
        UnaryExpression postDecrement = new UnaryExpression(new Identifier("variableB"), UnaryOperator.POST_DECREMENT);
        assertEquals(UintType.class, postDecrement.accept(typeEvaluator).getClass());
    }


    @Test
    void testUnaryOperations() {
        // Test ++variableC (pre-increment)
        UnaryExpression preIncrement = new UnaryExpression(new Identifier("variableC"), UnaryOperator.PRE_INCREMENT);
        Type preIncrementType = preIncrement.accept(typeEvaluator);
        assertEquals(UintType.class, preIncrementType.getClass());

        // Test --variableD (pre-decrement)
        UnaryExpression preDecrement = new UnaryExpression(new Identifier("variableD"), UnaryOperator.PRE_DECREMENT);
        Type preDecrementType = preDecrement.accept(typeEvaluator);
        assertEquals(UintType.class, preDecrementType.getClass());

        // Test +variableE
        UnaryExpression unaryPlus = new UnaryExpression(new Identifier("variableE"), UnaryOperator.PLUS);
        Type unaryPlusType = unaryPlus.accept(typeEvaluator);
        assertEquals(UintType.class, unaryPlusType.getClass());

        // Test -variableF
        UnaryExpression unaryMinus = new UnaryExpression(new Identifier("variableF"), UnaryOperator.MINUS);
        Type unaryMinusType = unaryMinus.accept(typeEvaluator);
        assertEquals(UintType.class, unaryMinusType.getClass());

        // Test !variableH
        UnaryExpression logicalNot = new UnaryExpression(new Identifier("variableH"), UnaryOperator.NOT);
        Type logicalNotType = logicalNot.accept(typeEvaluator);
        assertEquals(BoolType.class, logicalNotType.getClass());

        // Test ~variableI (bitwise NOT)
        UnaryExpression bitwiseNot = new UnaryExpression(new Identifier("variableI"), UnaryOperator.TILDE);
        Type bitwiseNotType = bitwiseNot.accept(typeEvaluator);
        assertEquals(UintType.class, bitwiseNotType.getClass());
    }

    @Test
    void testObjectCreation() {
        // Object creation of type MyContract
        ObjectCreation objectCreation = new ObjectCreation(new UserDefinedTypeName());
        ((UserDefinedTypeName)objectCreation.getType()).addChainRing( "MyContract");

        assertEquals(UserDefinedTypeName.class, objectCreation.accept(typeEvaluator).getClass());
    }

    @Test
    void testStructInitialization() {
        // Simulate adding MyStruct to the symbol table
        UserDefinedTypeName myStructType = new UserDefinedTypeName();
        myStructType.addChainRing("MyStruct");

        addVariableToSymbolTable("MyStruct", myStructType);

        // Testing struct initialization for MyStruct
        StructInitializationExpression structInit = new StructInitializationExpression(new Identifier("MyStruct"), null);
        Type structInitType = structInit.accept(typeEvaluator);

        // Verify that the correct type (UserDefinedTypeName) is returned
        assertEquals(UserDefinedTypeName.class, structInitType.getClass());
        assertEquals("MyStruct", ((UserDefinedTypeName) structInitType).getTypeChain().get(0).getName());
    }


    @Test
    void testArrayIndexing() {
        // Test array indexing on `myArray` which is of type UintType
        BinaryExpression arrayIndex = new BinaryExpression(new Identifier("myArray"), new Identifier("index"), BinaryOperator.INDEXING);
        assertEquals(UintType.class, arrayIndex.accept(typeEvaluator).getClass());
    }

    @Test
    void testUnaryIncrementDecrement() {
        // Test variableA++
        UnaryExpression postIncrement = new UnaryExpression(new Identifier("variableA"), UnaryOperator.POST_INCREMENT);
        assertEquals(UintType.class, postIncrement.accept(typeEvaluator).getClass());

        // Test variableB--
        UnaryExpression postDecrement = new UnaryExpression(new Identifier("variableB"), UnaryOperator.POST_DECREMENT);
        assertEquals(UintType.class, postDecrement.accept(typeEvaluator).getClass());
    }

    @Test
    void testBinaryArithmeticOperations() {
        // Test variableA * variableB (multiplication)
        BinaryExpression multiplication = new BinaryExpression(new Identifier("variableA"), new Identifier("variableB"), BinaryOperator.MULTIPLICATION);
        assertEquals(UintType.class, multiplication.accept(typeEvaluator).getClass());
    }

    @Test
    void testLogicalOperations() {
        // Test logical AND on two boolean variables
        addVariableToSymbolTable("conditionA", new BoolType());
        addVariableToSymbolTable("conditionB", new BoolType());

        BinaryExpression logicalAnd = new BinaryExpression(new Identifier("conditionA"), new Identifier("conditionB"), BinaryOperator.LOGICAL_AND);
        assertEquals(BoolType.class, logicalAnd.accept(typeEvaluator).getClass());
    }

    @Test
    void testComparisonOperations() {
        // Test variableA < variableB
        BinaryExpression lessThan = new BinaryExpression(new Identifier("variableA"), new Identifier("variableB"), BinaryOperator.LESS_THAN);
        assertEquals(BoolType.class, lessThan.accept(typeEvaluator).getClass());
    }

    @Test
    void testTernaryOperation() {
        // Test condition ? trueValue : falseValue
        TernaryOperatorExpression ternaryExpr = new TernaryOperatorExpression(
                new Identifier("condition"), new Identifier("variableA"), new Identifier("variableB"));
        assertEquals(UintType.class, ternaryExpr.accept(typeEvaluator).getClass());
    }

    @Test
    void testPrimaryExpressions() {
        // Test literal true
        BoolType boolLiteral = new BoolType();
        assertEquals(BoolType.class, boolLiteral.accept(typeEvaluator).getClass());

        // Test literal 123 (UintType)
        NumberLiteral numberLiteral = new NumberLiteral("123");
        assertEquals(UintType.class, numberLiteral.accept(typeEvaluator).getClass());
    }

    @Test
    void testMemberAccess() {
        // Assume `myStruct` has a member `memberVar` of type UintType
        addVariableToSymbolTable("myStruct.memberVar", new UintType());

        AccessExpression memberAccess = new AccessExpression(new Identifier("myStruct"), new Identifier("memberVar"));
        assertEquals(UintType.class, memberAccess.accept(typeEvaluator).getClass());
    }

    @Test
    void testFunctionReturnType() {
        // Assume contractInstance.someFunction() returns UintType
        addVariableToSymbolTable("contractInstance.someFunction", new UintType());

        AccessExpression functionReturn = new AccessExpression(new Identifier("contractInstance"), new Identifier("someFunction"));
        assertEquals(UintType.class, functionReturn.accept(typeEvaluator).getClass());
    }

    @Test
    void testFunctionReturnTypeWithArguments() {
        // Define a function that returns UintType and takes one UintType argument
        ParameterList returnParams = new ParameterList();
        Parameter returnParam = new Parameter(new UintType(), null);  // Return parameter (UintType)
        returnParam.setIdentifier(new Identifier("returnVal"));  // Set identifier for the return value
        returnParams.addParameter(returnParam);

        ParameterList inputParams = new ParameterList();
        Parameter inputParam = new Parameter(new UintType(), null);  // Input parameter (UintType)
        inputParam.setIdentifier(new Identifier("inputArg"));  // Set identifier for the input argument
        inputParams.addParameter(inputParam);

        // Create a FunctionDefinition with input and return parameters
        FunctionDefinition functionDefinition = new FunctionDefinition(new Identifier("someFunction"), inputParams, null);
        functionDefinition.setReturnParameterList(returnParams);

        // Add the function to the symbol table, including its input and return parameters
        FunctionSymbolTableItem functionItem = new FunctionSymbolTableItem("someFunction");
        functionItem.setReturnParameterList(returnParams);  // Set the return parameters for the function
        functionItem.setSymbolTable(new SymbolTable());  // Create a new symbol table for the function's scope

        // Add input parameters to the function's symbol table
        for (Parameter param : inputParams.getParameters()) {
            VariableDeclarationSymbolTableItem varItem = new VariableDeclarationSymbolTableItem(
                    new VariableDeclaration(param.getIdentifier(), param.getType(), null));
            try {
                functionItem.getSymbolTable().put(varItem);
            } catch (ItemAlreadyExistsException e) {
                fail("Parameter already exists in the function scope.");
            }
        }

        try {
            symbolTable.put(functionItem);  // Add the function to the symbol table
        } catch (ItemAlreadyExistsException e) {
            fail("Function already exists in the symbol table.");
        }

        // Create an ExpressionList to hold the function arguments
        ExpressionList functionArgs = new ExpressionList();
        functionArgs.addExpression(new NumberLiteral("123")); // UintType argument

        // Create a FunctionCallExpression for the function call with UintType argument
        FunctionCallExpression functionCall = new FunctionCallExpression(new Identifier("someFunction"), functionArgs);

        // Assert that the type evaluator infers the return type as UintType
        Type resultType = functionCall.accept(typeEvaluator);  // Call the type evaluator
        assertEquals(UintType.class, resultType.getClass());  // Ensure return type is UintType
    }

    @Test
    void testTupleExpressions() {
        // Tuple expression (varA, varB, varC)
        TupleExpression tupleExpr = new TupleExpression();
        tupleExpr.addExpression(new Identifier("variableA"));
        tupleExpr.addExpression(new Identifier("variableB"));
        tupleExpr.addExpression(new Identifier("variableC"));

        Type result = tupleExpr.accept(typeEvaluator);
        assertTrue(result instanceof TupleType);
        TupleType tupleType = (TupleType) result;
        assertEquals(3, tupleType.getElementTypes().size());
    }
}
