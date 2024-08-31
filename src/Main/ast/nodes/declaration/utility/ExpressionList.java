package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ExpressionList extends FunctionCallArguments {
    private ArrayList<Expression> expressionList = new ArrayList<>();

    public ExpressionList() {
    }

    public void addExpression(Expression expression) {
        this.expressionList.add(expression);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
