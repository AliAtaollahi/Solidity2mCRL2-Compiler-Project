package main.ast.nodes.expression.type.primitive;

import main.visitor.IVisitor;

public class ByteUpperCaseType extends ElementaryTypeName {
    private String numberOfBits;
    public ByteUpperCaseType(String fullTypeName) {
        this.numberOfBits = fullTypeName.replaceAll("\\D+", "");
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
