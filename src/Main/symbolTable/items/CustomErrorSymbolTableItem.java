package main.symbolTable.items;

import main.ast.nodes.declaration.CustomErrorDefinition;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class CustomErrorSymbolTableItem extends SymbolTableItem {
    private String customErrorName;
    private SymbolTable symbolTable;
    private CustomErrorDefinition customErrorDefinition;

    public CustomErrorSymbolTableItem(String customErrorName, CustomErrorDefinition customErrorDefinition) {
        this.customErrorName = customErrorName;
        this.customErrorDefinition = customErrorDefinition;
        this.setLine(customErrorDefinition.getLine());
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

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
