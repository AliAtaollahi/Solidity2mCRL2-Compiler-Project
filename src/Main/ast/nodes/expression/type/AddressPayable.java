package main.ast.nodes.expression.type;

import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class AddressPayable extends Type {
    public AddressPayable() {
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
