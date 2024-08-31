package main.ast.nodes.expression;

import main.ast.nodes.expression.primary.StringLiteral;
import main.visitor.IVisitor;

public class RequireExpression extends Expression {
    Expression expression;
    StringLiteral message;

    public RequireExpression(Expression expression, StringLiteral message) {
        this.expression = expression;
        this.message = message;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
