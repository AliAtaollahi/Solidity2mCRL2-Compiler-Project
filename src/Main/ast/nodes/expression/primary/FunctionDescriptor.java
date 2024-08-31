package main.ast.nodes.expression.primary;

import main.ast.nodes.expression.PrimaryExpression;
import main.visitor.IVisitor;

public class FunctionDescriptor extends PrimaryExpression {
    private Identifier name;

    public FunctionDescriptor() {
    }

    public FunctionDescriptor(Identifier name) {
        this.name = name;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
