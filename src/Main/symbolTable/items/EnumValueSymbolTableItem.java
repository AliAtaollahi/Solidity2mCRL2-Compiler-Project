package main.symbolTable.items;

import main.visitor.IVisitor;

public class EnumValueSymbolTableItem extends SymbolTableItem {
    private String enumValueName;
    private int enumIndex;

    public EnumValueSymbolTableItem(String enumValueName, int enumIndex) {
        this.enumValueName = enumValueName;
        this.enumIndex = enumIndex;
    }

    @Override
    public String getKey() {
        return enumValueName;
    }

    public String getEnumValueName() {
        return enumValueName;
    }

    public int getEnumIndex() {
        return enumIndex;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
