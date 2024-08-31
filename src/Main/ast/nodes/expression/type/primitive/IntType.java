package main.ast.nodes.expression.type.primitive;

import main.visitor.IVisitor;

public class IntType extends ElementaryTypeName {
    private String numberOfBits;
    public IntType(String fullTypeName) {
        this.numberOfBits = fullTypeName.replaceAll("\\D+", "");
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getNumberOfBits() {
        return numberOfBits;
    }

    public void setNumberOfBits(String numberOfBits) {
        this.numberOfBits = numberOfBits;
    }
}
