package main.symbolTable.items;

import main.symbolTable.SymbolTable;
import main.ast.nodes.declaration.utility.ModifierList;

import main.ast.nodes.declaration.utility.ParameterList;
import main.ast.nodes.declaration.utility.ModifierList;

public class FunctionSymbolTableItem extends SymbolTableItem {
    private String functionName;
    private SymbolTable symbolTable;
    private ModifierList modifierList;
    private ParameterList returnParameterList;  // Store return parameters

    public FunctionSymbolTableItem(String functionName) {
        this.functionName = functionName;
    }

    @Override
    public String getKey() {
        return "Function_" + functionName;
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
}

