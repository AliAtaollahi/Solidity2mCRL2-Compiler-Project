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

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public StringLiteral getMessage() {
        return message;
    }

    public void setMessage(StringLiteral message) {
        this.message = message;
    }
}
