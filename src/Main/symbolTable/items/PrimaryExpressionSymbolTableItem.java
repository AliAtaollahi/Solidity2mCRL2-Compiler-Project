package main.symbolTable.items;

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
}
