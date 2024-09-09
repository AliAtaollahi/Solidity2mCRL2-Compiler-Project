package main.symbolTable.items;

import main.symbolTable.SymbolTable;

public class CustomErrorSymbolTableItem extends SymbolTableItem {
    private String customErrorName;
    private SymbolTable symbolTable;

    public CustomErrorSymbolTableItem(String customErrorName) {
        this.customErrorName = customErrorName;
    }

    @Override
    public String getKey() {
        return customErrorName;
    }

    public String getCustomErrorName() {
        return customErrorName;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
}
