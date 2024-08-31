package main.ast.nodes.expression.primary;

import main.ast.nodes.expression.PrimaryExpression;
import main.visitor.IVisitor;

public class OtherFunctionDescriptors extends PrimaryExpression {
    private String name;

    public OtherFunctionDescriptors(String name) {
        this.name = name;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
