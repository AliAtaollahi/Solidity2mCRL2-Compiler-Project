package main.ast.nodes.expression.type.primitive;

import main.visitor.IVisitor;

public class ByteLowerCaseType extends ElementaryTypeName {
    public ByteLowerCaseType() {}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "ByteLowerCaseType";
    }
}
