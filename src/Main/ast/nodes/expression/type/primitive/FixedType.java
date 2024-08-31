package main.ast.nodes.expression.type.primitive;

import main.visitor.IVisitor;

public class FixedType extends ElementaryTypeName {
    private String numberOfBits;
    public FixedType(String fullTypeName) {
        this.numberOfBits = fullTypeName.replaceAll("^[a-zA-Z]+", "");
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}