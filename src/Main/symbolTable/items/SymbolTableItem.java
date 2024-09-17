package main.symbolTable.items;

import main.visitor.IVisitor;

public abstract class SymbolTableItem {

    protected String name;

    public abstract String getKey();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract <T> T accept(IVisitor<T> visitor);
}
