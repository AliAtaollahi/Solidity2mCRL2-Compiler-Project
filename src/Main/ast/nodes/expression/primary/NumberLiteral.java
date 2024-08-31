package main.ast.nodes.expression.primary;

import main.ast.nodes.expression.PrimaryExpression;
import main.visitor.IVisitor;

public class NumberLiteral extends PrimaryExpression {
    private String value;
    private String unit;

    public NumberLiteral(String value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
