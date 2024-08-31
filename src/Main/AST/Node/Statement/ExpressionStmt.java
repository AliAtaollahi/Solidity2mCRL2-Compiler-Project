package Main.AST.Node.Statement;

import Main.AST.Node.expression.Expression;
import Main.visitor.IVisitor;

public class ExpressionStmt extends Statement{

    private Expression expression;

    public ExpressionStmt(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
