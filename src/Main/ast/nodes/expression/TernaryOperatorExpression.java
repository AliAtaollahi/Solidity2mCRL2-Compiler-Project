package main.ast.nodes.expression;

import main.ast.nodes.declaration.utility.NameValueList;
import main.visitor.IVisitor;

public class TernaryOperatorExpression extends Expression{
    private Expression condition;
    private Expression trueResult;
    private Expression falseResult;

    public TernaryOperatorExpression(Expression condition, Expression trueResult, Expression falseResult) {
        this.condition = condition;
        this.trueResult = trueResult;
        this.falseResult = falseResult;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
