package main.ast.nodes.expression;

import main.ast.nodes.expression.operators.BinaryOperator;
import main.visitor.IVisitor;

public class BinaryExpression extends Expression{
    private Expression firstOperand;
    private Expression secondOperand;
    private BinaryOperator binaryOperator;
    public BinaryExpression(Expression firstOperand, Expression secondOperand,
                            BinaryOperator binaryOperator){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.binaryOperator = binaryOperator;

    }

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
