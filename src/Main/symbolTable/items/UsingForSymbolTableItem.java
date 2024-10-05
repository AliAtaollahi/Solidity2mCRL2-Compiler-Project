package main.symbolTable.items;

import main.ast.nodes.declaration.UsingForObject;
import main.visitor.IVisitor;

public class UsingForSymbolTableItem extends SymbolTableItem {
    private UsingForObject usingForObject;
    private String targetType;
    private boolean isGlobal;

    public UsingForSymbolTableItem(UsingForObject usingForObject, String targetType, boolean isGlobal) {
        this.usingForObject = usingForObject;
        this.targetType = targetType;
        this.isGlobal = isGlobal;
        this.setLine(usingForObject.getLine());
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

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
