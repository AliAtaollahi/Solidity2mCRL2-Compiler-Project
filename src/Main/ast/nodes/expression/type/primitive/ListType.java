package main.ast.nodes.expression.type.primitive;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class ListType extends Type {
    private Type type;
    private Expression size;

    public ListType(Type type) {
        this.type = type;
    }

    public ListType(Type type, Expression size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
