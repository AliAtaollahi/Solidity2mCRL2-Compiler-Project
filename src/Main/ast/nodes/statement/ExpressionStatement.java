package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.StringLiteral;
import main.visitor.IVisitor;

public class ExpressionStatement extends SimpleStatement {
    Expression expression;

    public ExpressionStatement(Expression expression) {
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
