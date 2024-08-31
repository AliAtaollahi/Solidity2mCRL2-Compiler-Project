package main.ast.nodes.expression;

import main.ast.nodes.expression.operators.UnaryOperator;
import main.visitor.IVisitor;

public class ParenthesizedExpression extends Expression {
    Expression expression;

    public ParenthesizedExpression(Expression expression) {
        this.expression = expression;
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
}
