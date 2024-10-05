package main.symbolTable.items;

import main.ast.nodes.expression.value.EnumValue;
import main.visitor.IVisitor;

public class EnumValueSymbolTableItem extends SymbolTableItem {
    private String enumValueName;
    private int enumIndex;
    private EnumValue enumValue;


    public EnumValueSymbolTableItem(String enumValueName, int enumIndex, EnumValue enumValue) {
        this.enumValueName = enumValueName;
        this.enumIndex = enumIndex;
        this.enumValue = enumValue;
        this.setLine(enumValue.getLine());
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
