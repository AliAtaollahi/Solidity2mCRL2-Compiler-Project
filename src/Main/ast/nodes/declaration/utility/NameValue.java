package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

public class NameValue extends Declaration {
    private Identifier key;
    private Expression value;

    public NameValue(Identifier key, Expression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Identifier getKey() {
        return key;
    }

    public void setKey(Identifier key) {
        this.key = key;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }
}
