package Main.AST.Node.expression;

import Main.AST.Node.expression.operators.UnaryOperator;
import Main.visitor.IVisitor;
import Main.visitor.Visitor;

public class UnaryExpression extends Expression {

    private UnaryOperator unaryOperator;
    private Expression operand;

    public UnaryExpression(UnaryOperator unaryOperator, Expression operand) {
        this.unaryOperator = unaryOperator;
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }

    public UnaryOperator getUnaryOperator() {
        return unaryOperator;
    }

    public void setUnaryOperator(UnaryOperator unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
