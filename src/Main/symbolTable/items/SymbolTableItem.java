package main.symbolTable.items;

public abstract class SymbolTableItem {

    protected String name;

    public abstract String getKey();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
