package main.symbolTable.items;

import main.ast.nodes.declaration.UsingForObject;

public class UsingForSymbolTableItem extends SymbolTableItem {
    private UsingForObject usingForObject;
    private String targetType;
    private boolean isGlobal;

    public UsingForSymbolTableItem(UsingForObject usingForObject, String targetType, boolean isGlobal) {
        this.usingForObject = usingForObject;
        this.targetType = targetType;
        this.isGlobal = isGlobal;
    }

    @Override
    public String getKey() {
        return "UsingFor-" + targetType + (isGlobal ? "-global" : "");
    }

    public UsingForObject getUsingForObject() {
        return usingForObject;
    }

    public String getTargetType() {
        return targetType;
    }

    public boolean isGlobal() {
        return isGlobal;
    }
}
