package main.symbolTable.items;

import main.ast.nodes.declaration.EnumDefinition;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class EnumDefinitionSymbolTableItem extends SymbolTableItem {
    private String enumName;
    private SymbolTable symbolTable;
    private EnumDefinition enumDefinition;

    public EnumDefinitionSymbolTableItem(String enumName, EnumDefinition enumDefinition) {
        this.enumName = enumName;
        this.enumDefinition = enumDefinition;
        this.setLine(enumDefinition.getLine());
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
