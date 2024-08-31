package main.ast.nodes.expression.type.primitive;

import main.visitor.IVisitor;

public class BoolType extends ElementaryTypeName {
    public BoolType() {}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
