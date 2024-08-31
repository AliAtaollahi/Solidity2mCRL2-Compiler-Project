package Main.AST.Node.expression.values;

import Main.visitor.IVisitor;

public class MappingValue<M> extends Value{
    private M constant;
    public MappingValue(M constant) {
        this.constant = constant;
    }

    public M getConstant() {
        return constant;
    }

    public void setConstant(M constant) {
        this.constant = constant;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
