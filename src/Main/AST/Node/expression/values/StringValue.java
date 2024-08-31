package Main.AST.Node.expression.values;

import Main.AST.Type.Type;
import Main.visitor.IVisitor;
import Main.visitor.Visitor;

public class StringValue extends Value {
    private String constant;

    public StringValue(String constant) {
        this.constant = constant;
    }

    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
