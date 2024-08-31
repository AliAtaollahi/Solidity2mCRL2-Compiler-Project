package main.ast.nodes.expression;

import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

public class AccessExpression extends Expression{
    private Expression master;
    private Identifier member;

    public AccessExpression(Expression master, Identifier member) {
        this.master = master;
        this.member = member;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}

    public Expression getMaster() {
        return master;
    }

    public void setMaster(Expression master) {
        this.master = master;
    }

    public Identifier getMember() {
        return member;
    }

    public void setMember(Identifier member) {
        this.member = member;
    }
}
