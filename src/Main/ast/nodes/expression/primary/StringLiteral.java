package main.ast.nodes.expression.primary;

import main.ast.nodes.expression.PrimaryExpression;
import main.visitor.IVisitor;

public class StringLiteral extends PrimaryExpression {
    private String value;
    public StringLiteral(String value) {
        this.value = value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
