package main.symbolTable.items;

import main.symbolTable.SymbolTable;

public class StructSymbolTableItem extends SymbolTableItem {

    public StructSymbolTableItem(String name) {
        this.name = name;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    private SymbolTable symbolTable;

    @Override
    public String getKey() {
        // Return a unique key for the variable, using its name
        return "Struct_" + name;
    }

}
