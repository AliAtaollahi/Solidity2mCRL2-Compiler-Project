package main.symbolTable.items.statement;

import main.symbolTable.items.SymbolTableItem;
import main.visitor.IVisitor;

public abstract class StatementSymbolTableItem extends SymbolTableItem {

    private int line = 0;

    public void setLine(int line){this.line = line;}
    public int getLine(){return this.line;}

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
