package main.visitor;

import main.ast.nodes.SourceUnit;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.*;

import main.ast.nodes.expression.modifier.*;
import main.ast.nodes.expression.primary.*;
import main.ast.nodes.declaration.utility.*;
import main.ast.nodes.statement.Block;
import main.ast.nodes.statement.Statement;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.*;

public class DependencyDetector extends Visitor<Void> {
    // bayad az tooye iterate kardane symbolTable be masterMember beresam va type ro evaluate konam
//    TypeEvaluator typeEvaluator = new TypeEvaluator(SymbolTable.top);
//    Type type = typeEvaluator.visit(accessExpression);
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
        if (functionCallSymbolTableItem.getFunctionName() instanceof AccessExpression) {
//            AccessExpression functionName = (AccessExpression) functionCallSymbolTableItem.getFunctionName();
//            TypeEvaluator typeEvaluator = new TypeEvaluator(functionCallSymbolTableItem.getCurrentSymbolTable());
//            Type type = typeEvaluator.visit(functionName);
        }

        Expression functionName = functionCallSymbolTableItem.getFunctionName();
        TypeEvaluator typeEvaluator = new TypeEvaluator(functionCallSymbolTableItem.getCurrentSymbolTable());
        Type type = null;

        if (functionName instanceof AccessExpression) {
            type = typeEvaluator.visit((AccessExpression) functionName);
        } else if (functionName instanceof BinaryExpression) {
            type = typeEvaluator.visit((BinaryExpression) functionName);
        } else if (functionName instanceof FunctionCallExpression) {
            type = typeEvaluator.visit((FunctionCallExpression) functionName);
        } else if (functionName instanceof ObjectCreation) {
            type = typeEvaluator.visit((ObjectCreation) functionName);
        } else if (functionName instanceof StructInitializationExpression) {
            type = typeEvaluator.visit((StructInitializationExpression) functionName);
        } else if (functionName instanceof UnaryExpression) {
            type = typeEvaluator.visit((UnaryExpression) functionName);
        } else if (functionName instanceof Modifier) {
            type = typeEvaluator.visit((Modifier) functionName);
        } else if (functionName instanceof TernaryOperatorExpression) {
            type = typeEvaluator.visit((TernaryOperatorExpression) functionName);
        } else if (functionName instanceof RequireExpression) {
            type = typeEvaluator.visit((RequireExpression) functionName);
        } else if (functionName instanceof TupleExpression) {
            type = typeEvaluator.visit((TupleExpression) functionName);
        } else if (functionName instanceof ParenthesizedExpression) {
            type = typeEvaluator.visit((ParenthesizedExpression) functionName);
        } else if (functionName instanceof NumberLiteral) {
            type = typeEvaluator.visit((NumberLiteral) functionName);
        } else if (functionName instanceof StringLiteral) {
            type = typeEvaluator.visit((StringLiteral) functionName);
        } else if (functionName instanceof Identifier) {
            type = typeEvaluator.visit((Identifier) functionName);
        } else {
            System.out.println("Unknown Expression Type: " + functionName.getClass().getSimpleName());
        }

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
//        TypeEvaluator typeEvaluator = new TypeEvaluator(SymbolTable.top);
//        Type type = typeEvaluator.visit(accessExpression);

        SymbolTable functionDefinitionSymbolTable = functionDefinitionSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : functionDefinitionSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }
}
