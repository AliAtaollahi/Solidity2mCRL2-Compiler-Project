package main.ast.nodes.expression.type.primitive;

import main.visitor.IVisitor;

public class AddressType extends ElementaryTypeName {
    public AddressType() {}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
