package Main.AST.Node.expression.values;

import Main.AST.Type.primitiveType.AddressType;
import Main.visitor.IVisitor;

public class AddressValue extends Value {
    private AddressType constant;

    public AddressValue(AddressType constant) {
        this.constant = constant;
    }

    public AddressType getConstant() {
        return constant;
    }

    public void setConstant(AddressType constant) {
        this.constant = constant;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
