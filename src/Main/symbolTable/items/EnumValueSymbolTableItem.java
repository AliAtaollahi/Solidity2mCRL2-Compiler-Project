package main.symbolTable.items;

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
}
