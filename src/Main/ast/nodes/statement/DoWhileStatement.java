package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class DoWhileStatement extends Statement {
    private Statement scope;
    private Expression condition;

    public DoWhileStatement(Statement scope, Expression condition) {
        this.scope = scope;
        this.condition = condition;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Statement getScope() {
        return scope;
    }

    public void setScope(Statement scope) {
        this.scope = scope;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }
}
