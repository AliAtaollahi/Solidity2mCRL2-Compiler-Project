package main.ast.nodes.expression.value;

import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class EnumValue extends Type {
    private Identifier value;

    public EnumValue(Identifier value) {
        this.value = value;
    }


    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
