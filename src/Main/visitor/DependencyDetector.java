package main.visitor;

import main.ast.nodes.SourceUnit;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.type.primitive.AddressType;
import main.ast.nodes.expression.type.primitive.BoolType;
import main.ast.nodes.expression.type.primitive.ByteUpperCaseType;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.*;

import main.ast.nodes.expression.modifier.*;
import main.ast.nodes.expression.primary.*;
import main.ast.nodes.declaration.utility.*;
import main.ast.nodes.statement.Block;
import main.ast.nodes.statement.Statement;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.items.*;
import main.utils.DependencyNode;
import main.utils.DependencyTree;

import java.util.*;

public class DependencyDetector extends Visitor<Void> {
    private DependencyTree dependencyTree = new DependencyTree();
    private Set<DependencyNode> initNodes = new HashSet<>();
    private FunctionDefinitionSymbolTableItem currentFunctionDefinition;
    private StructDefinitionSymbolTableItem currentStructDefinition;
    private DependencyNode currentFunctionDefinitionNode;
    private ExpressionAnalyzer expressionAnalyzer = new ExpressionAnalyzer();

    @Override
    public Void visit(SourceUnit sourceUnit) {
        // Start with the root symbol table
        SymbolTable symbolTable = SymbolTable.root;
        for (SymbolTableItem item : symbolTable.items.values()) {
            item.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ContractDefinitionSymbolTableItem contractDefinitionSymbolTableItem) {
        SymbolTable contractDefinitionSymbolTable = contractDefinitionSymbolTableItem.getContractSymbolTable();
        for (SymbolTableItem item : contractDefinitionSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(CustomErrorSymbolTableItem customErrorSymbolTableItem) {
        SymbolTable customErrorSymbolTable = customErrorSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : customErrorSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(EnumDefinitionSymbolTableItem enumDefinitionSymbolTableItem) {
        SymbolTable enumDefinitionSymbolTable = enumDefinitionSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : enumDefinitionSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(EnumValueSymbolTableItem enumValueSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(FileLevelConstantSymbolTableItem fileLevelConstantSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(FunctionCallSymbolTableItem functionCallSymbolTableItem) {
        Expression functionName = functionCallSymbolTableItem.getFunctionName();
        TypeEvaluator typeEvaluator = new TypeEvaluator(functionCallSymbolTableItem.getCurrentSymbolTable());
        Type type = typeEvaluator.visit(functionCallSymbolTableItem.getFunctionCallExpression());
        SymbolTableItem item = typeEvaluator.getCurrentItemFoundFromSymbolTable();

        if (item instanceof FunctionDefinitionSymbolTableItem calledFunctionData) {
            DependencyNode calledFunction = new DependencyNode(item, calledFunctionData.getContractDefinitionContainer());
            this.dependencyTree.addDependency(this.currentFunctionDefinitionNode, calledFunction);
        } else if (item instanceof StructDefinitionSymbolTableItem calledStructData) {
            DependencyNode calledStruct = new DependencyNode(item, calledStructData.getContractDefinition());
            this.dependencyTree.addDependency(this.currentFunctionDefinitionNode, calledStruct);
        }
//        if (functionName instanceof AccessExpression) {
//            type = typeEvaluator.visit((AccessExpression) functionName);
//        } else if (functionName instanceof BinaryExpression) {
//            type = typeEvaluator.visit((BinaryExpression) functionName);
//        } else if (functionName instanceof FunctionCallExpression) {
//            type = typeEvaluator.visit((FunctionCallExpression) functionName);
//        } else if (functionName instanceof ObjectCreation) {
//            type = typeEvaluator.visit((ObjectCreation) functionName);
//        } else if (functionName instanceof StructInitializationExpression) {
//            type = typeEvaluator.visit((StructInitializationExpression) functionName);
//        } else if (functionName instanceof UnaryExpression) {
//            type = typeEvaluator.visit((UnaryExpression) functionName);
//        } else if (functionName instanceof Modifier) {
//            type = typeEvaluator.visit((Modifier) functionName);
//        } else if (functionName instanceof TernaryOperatorExpression) {
//            type = typeEvaluator.visit((TernaryOperatorExpression) functionName);
//        } else if (functionName instanceof RequireExpression) {
//            type = typeEvaluator.visit((RequireExpression) functionName);
//        } else if (functionName instanceof TupleExpression) {
//            type = typeEvaluator.visit((TupleExpression) functionName);
//        } else if (functionName instanceof ParenthesizedExpression) {
//            type = typeEvaluator.visit((ParenthesizedExpression) functionName);
//        } else if (functionName instanceof NumberLiteral) {
//            type = typeEvaluator.visit((NumberLiteral) functionName);
//        } else if (functionName instanceof StringLiteral) {
//            type = typeEvaluator.visit((StringLiteral) functionName);
//        } else if (functionName instanceof Identifier) {
//            type = typeEvaluator.visit((Identifier) functionName);
//        } else {
//            System.out.println("Unknown Expression Type: " + functionName.getClass().getSimpleName());
//        }

        return null;
    }

    @Override
    public Void visit(VariantTypeVariableDeclarationSymbolTableItem variantTypeVariableDeclarationSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(VariableDeclarationSymbolTableItem variableDeclarationSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(UsingForSymbolTableItem usingForSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(StructDefinitionSymbolTableItem structDefinitionSymbolTableItem) {
        this.currentStructDefinition = structDefinitionSymbolTableItem;
        SymbolTable structDefinitionSymbolTable = structDefinitionSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : structDefinitionSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(StateVariableSymbolTableItem stateVariableSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(PrimaryExpressionSymbolTableItem primaryExpressionSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(ParameterSymbolTableItem parameterSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(ModifierDefinitionSymbolTableItem modifierDefinitionSymbolTableItem) {
        SymbolTable modifierDefinitionSymbolTable = modifierDefinitionSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : modifierDefinitionSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem) {
        this.currentFunctionDefinition = functionDefinitionSymbolTableItem;
        this.currentFunctionDefinitionNode = new DependencyNode(this.currentFunctionDefinition, this.currentFunctionDefinition.getContractDefinitionContainer());

        // Create a list of items from the symbol table
        List<SymbolTableItem> sortedItems = new ArrayList<>(functionDefinitionSymbolTableItem.getSymbolTable().items.values());

        // Sort the items based on their line number (if available)
        sortedItems.sort(Comparator.comparingInt(this::getItemLineNumber));

        // Visit each item in the sorted order
        for (SymbolTableItem item : sortedItems) {
            item.accept(this);
        }

        if(functionDefinitionSymbolTableItem.getScope() != null) {
            if (this.expressionAnalyzer.findItem("delegatecall", functionDefinitionSymbolTableItem.getScope())) {
                this.initNodes.add(this.currentFunctionDefinitionNode);
            } else if (this.expressionAnalyzer.findAccessExpression("tx", "origin", functionDefinitionSymbolTableItem.getScope())) {
                this.initNodes.add(this.currentFunctionDefinitionNode);
            }
        }

        return null;
    }

    private int getItemLineNumber(SymbolTableItem item) {
        try {
            return ((FunctionCallSymbolTableItem)item).getFunctionName().getLine();
        } catch (Exception e) {
            return Integer.MAX_VALUE;
        }
    }

    public void addBuiltInFunctions() {
//        SymbolTable symbolTable = SymbolTable.root;
//        for (SymbolTableItem item : symbolTable.items.values()) {
//            if (item instanceof ContractDefinitionSymbolTableItem) {
//                Identifier functionDescriptor = new Identifier("delegatecall");
//
//                ParameterList parameterList = new ParameterList();
//                Type type0 = new AddressType();
//                Identifier identifier0 = new Identifier("Target");
//                Parameter parameter0 = new Parameter(type0, "");
//                parameter0.setIdentifier(identifier0);
//                parameterList.addParameter(parameter0);
//                Type type1 = new ByteUpperCaseType("");
//                Identifier identifier1 = new Identifier("functionAddress");
//                Parameter parameter1 = new Parameter(type1, "memory");
//                parameter0.setIdentifier(identifier1);
//                parameterList.addParameter(parameter1);
//
//                ModifierList modifierList = new ModifierList();
//                OtherModifers otherModifers = new OtherModifers("public");
//
//                ParameterList returnParameterList = new ParameterList();
//                Type type3 = new BoolType();
//                Parameter parameter3 = new Parameter(type3, "");
//                returnParameterList.addParameter(parameter3);
//                Type type4 = new ByteUpperCaseType("");
//                Parameter parameter4 = new Parameter(type4, "memory");
//                returnParameterList.addParameter(parameter4);
//
//                FunctionDefinition functionDefinition = new FunctionDefinition(functionDescriptor, parameterList, modifierList);
//                ((ContractDefinitionSymbolTableItem) item).getContractDefinition().addContractPart(functionDefinition);
//                FunctionDefinitionSymbolTableItem functionDefinitionSymbolTableItem = new FunctionDefinitionSymbolTableItem("delegatecall_builtIn", functionDefinition, ((ContractDefinitionSymbolTableItem) item).getContractDefinition());
//                functionDefinitionSymbolTableItem.setSymbolTable(((ContractDefinitionSymbolTableItem) item).getContractSymbolTable());
//                functionDefinitionSymbolTableItem.setContractDefinitionContainer(((ContractDefinitionSymbolTableItem) item).getContractDefinition());
//                try {
//                    ((ContractDefinitionSymbolTableItem)item).getContractSymbolTable().put(functionDefinitionSymbolTableItem);
//                } catch (ItemAlreadyExistsException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
    }
}
