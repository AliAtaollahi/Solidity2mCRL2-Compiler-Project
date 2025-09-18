package main.visitor;

import main.ast.nodes.SourceUnit;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.*;
import main.symbolTable.items.statement.DoWhileStatementSymbolTableItem;
import main.symbolTable.items.statement.ForStatementSymbolTableItem;
import main.symbolTable.items.statement.IfStatementSymbolTableItem;
import main.symbolTable.items.statement.WhileStatementSymbolTableItem;

import java.util.*;

public class VariableDeclarationCollector extends Visitor<Void> {
    private List<VariableDeclarationSymbolTableItem> variableDeclarationSymbolTableItems = new ArrayList<>();

    List<VariableDeclarationSymbolTableItem> collectVariableDeclarations(SymbolTableItem symbolTableItem) {
        variableDeclarationSymbolTableItems = new ArrayList<>();
        symbolTableItem.accept(this);
        return this.variableDeclarationSymbolTableItems;
    }

    @Override
    public Void visit(SourceUnit sourceUnit) {
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
    public Void visit(VariantTypeVariableDeclarationSymbolTableItem variantTypeVariableDeclarationSymbolTableItem) {
        return null;
    }

    @Override
    public Void visit(VariableDeclarationSymbolTableItem variableDeclarationSymbolTableItem) {
        this.variableDeclarationSymbolTableItems.add(variableDeclarationSymbolTableItem);
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
        List<SymbolTableItem> sortedItems = new ArrayList<>(functionDefinitionSymbolTableItem.getSymbolTable().items.values());
        sortedItems.sort(Comparator.comparingInt(this::getItemLineNumber));

        for (SymbolTableItem item : sortedItems) {
            item.accept(this);
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

    @Override
    public Void visit(WhileStatementSymbolTableItem whileStatementSymbolTableItem) {
        SymbolTable whileSymbolTable = whileStatementSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : whileSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(IfStatementSymbolTableItem ifStatementSymbolTableItem) {
        SymbolTable ifSymbolTable = ifStatementSymbolTableItem.getIfSymbolTable();
        for (SymbolTableItem item : ifSymbolTable.items.values()) {
            item.accept(this);
        }

        SymbolTable elseSymbolTable = ifStatementSymbolTableItem.getElseSymbolTable();
        if (elseSymbolTable != null) {
            for (SymbolTableItem item : elseSymbolTable.items.values()) {
                item.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(ForStatementSymbolTableItem forStatementSymbolTableItem) {
        SymbolTable forSymbolTable = forStatementSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : forSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(DoWhileStatementSymbolTableItem doWhileStatementSymbolTableItem) {
        SymbolTable doWhileSymbolTable = doWhileStatementSymbolTableItem.getSymbolTable();
        for (SymbolTableItem item : doWhileSymbolTable.items.values()) {
            item.accept(this);
        }
        return null;
    }

}
