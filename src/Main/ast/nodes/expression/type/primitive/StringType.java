package main.ast.nodes.expression.type.primitive;

import main.visitor.IVisitor;

public class StringType extends ElementaryTypeName {
    public StringType() {}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
