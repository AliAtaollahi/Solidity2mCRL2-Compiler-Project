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
}
