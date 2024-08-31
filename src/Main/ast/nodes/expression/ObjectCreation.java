package main.ast.nodes.expression;

import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class ObjectCreation extends Expression{
    Type type;

    public ObjectCreation(Type type) {
        this.type = type;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
