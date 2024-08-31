package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class IfStatement extends Statement {
    private Expression condition;
    private Statement trueResult;
    private Statement falseResult;

    public IfStatement(Expression condition, Statement trueResult) {
        this.condition = condition;
        this.trueResult = trueResult;
    }

    public void setFalseResult(Statement falseResult) {
        this.falseResult = falseResult;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getTrueResult() {
        return trueResult;
    }

    public void setTrueResult(Statement trueResult) {
        this.trueResult = trueResult;
    }

    public Statement getFalseResult() {
        return falseResult;
    }
}
