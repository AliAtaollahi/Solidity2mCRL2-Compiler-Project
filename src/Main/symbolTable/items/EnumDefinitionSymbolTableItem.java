package main.symbolTable.items;

import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class EnumDefinitionSymbolTableItem extends SymbolTableItem {
    private String enumName;
    private SymbolTable symbolTable;

    public EnumDefinitionSymbolTableItem(String enumName) {
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

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
