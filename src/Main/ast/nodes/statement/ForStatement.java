package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class ForStatement extends Statement {
    private SimpleStatement initial;
    private ExpressionStatement condition;
    private Expression iteration;
    private Statement scope;
    public ForStatement() {}

    public void setScope(Statement scope) {
        this.scope = scope;
    }

    public void setCondition(ExpressionStatement condition) {
        this.condition = condition;
    }

    public void setInitial(SimpleStatement initial) {
        this.initial = initial;
    }

    public void setIteration(Expression iteration) {
        this.iteration = iteration;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public SimpleStatement getInitial() {
        return initial;
    }

    public ExpressionStatement getCondition() {
        return condition;
    }

    public Expression getIteration() {
        return iteration;
    }

    public Statement getScope() {
        return scope;
    }
}
