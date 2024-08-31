package Main.AST.Node.expression.values;

import Main.AST.Type.Type;
import Main.visitor.IVisitor;
import Main.visitor.Visitor;

public class IntValue extends Value {
    private int constant;

    public IntValue(int constant) {
        this.constant = constant;
    }

    public int getConstant() {
        return constant;
    }

    public void setConstant(int constant) {
        this.constant = constant;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
