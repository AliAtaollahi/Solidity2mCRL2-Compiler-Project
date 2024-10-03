package main.ast.nodes.expression.type.primitive;

import main.visitor.IVisitor;

public class VarType extends ElementaryTypeName {
    public VarType() {}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "VarType";
    }
}
