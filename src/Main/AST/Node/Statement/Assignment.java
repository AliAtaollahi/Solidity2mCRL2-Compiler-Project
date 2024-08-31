package Main.AST.Node.Statement;

import Main.AST.Node.expression.Identifier;
import Main.visitor.IVisitor;
import Main.visitor.Visitor;
import Main.AST.Node.expression.Expression;

public class Assignment extends Statement{

    private Expression lValue;
    private Expression rValue;

    public Assignment(Expression lValue, Expression rValue) {
        this.lValue = lValue;
        this.rValue = rValue;
    }

    public Assignment() {}

    public Expression getLValue() {
        return lValue;
    }

    public void setLValue(Expression lValue) {
        this.lValue = lValue;
    }

    public Expression getRValue() {
        return rValue;
    }

    public void setRValue(Expression rValue) {
        this.rValue = rValue;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
