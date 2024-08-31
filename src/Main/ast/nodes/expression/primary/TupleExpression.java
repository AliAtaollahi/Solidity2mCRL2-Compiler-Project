package main.ast.nodes.expression.primary;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.PrimaryExpression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class TupleExpression extends PrimaryExpression {
    ArrayList<Expression> expressions = new ArrayList<>();

    public TupleExpression() {
    }

    public void addExpression(Expression expression) {
        this.expressions.add(expression);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }
}
