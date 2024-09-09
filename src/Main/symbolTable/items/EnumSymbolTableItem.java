package main.symbolTable.items;

import main.symbolTable.SymbolTable;

public class EnumSymbolTableItem extends SymbolTableItem {
    private String enumName;
    private SymbolTable symbolTable;

    public EnumSymbolTableItem(String enumName) {
        this.enumName = enumName;
    }

    @Override
    public String getKey() {
        return enumName;
    }

    public String getEnumName() {
        return enumName;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
}
