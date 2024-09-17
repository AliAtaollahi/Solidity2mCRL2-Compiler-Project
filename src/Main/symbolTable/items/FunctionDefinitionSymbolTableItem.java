package main.symbolTable.items;

import main.symbolTable.SymbolTable;

import java.sql.Blob;

import main.ast.nodes.declaration.FunctionDefinition;
import main.ast.nodes.declaration.utility.ModifierList;

import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.statement.Block;
import main.ast.nodes.declaration.utility.ModifierList;
import main.visitor.IVisitor;

public class FunctionDefinitionSymbolTableItem extends SymbolTableItem {
    private String functionName;
    private SymbolTable symbolTable;
    private ModifierList modifierList;
    private ParameterList returnParameterList;  // Store return parameters
    private Block scope;

    public FunctionDefinitionSymbolTableItem(String functionName) {
        this.functionName = functionName;
    }

    @Override
    public String getKey() {
        return FunctionDefinition.START_KEY + functionName;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public ModifierList getModifierList() {
        return modifierList;
    }

    public void setModifierList(ModifierList modifierList) {
        this.modifierList = modifierList;
    }

    public ParameterList getReturnParameterList() {
        return returnParameterList;
    }

    public void setReturnParameterList(ParameterList returnParameterList) {
        this.returnParameterList = returnParameterList;
    }

    public Block getScope() {
        return scope;
    }

    public void setScope(Block scope) {
        this.scope = scope;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

