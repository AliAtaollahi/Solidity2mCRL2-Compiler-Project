package main.symbolTable.items;

import main.visitor.IVisitor;

public class PrimaryExpressionSymbolTableItem extends SymbolTableItem {
    private String name;

    public PrimaryExpressionSymbolTableItem(String name) {
        this.name = name;
    }

    @Override
    public String getKey() {
        return "primaryExpression_" + name;
    }

    public String getName() {
        return name;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
