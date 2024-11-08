package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class WhileStatement extends Statement {
    private Expression condition;
    private Statement scope;

    public WhileStatement(Expression condition, Statement scope) {
        this.condition = condition;
        this.scope = scope;
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

    public Statement getScope() {
        return scope;
    }

    public void setScope(Statement scope) {
        this.scope = scope;
    }
}
