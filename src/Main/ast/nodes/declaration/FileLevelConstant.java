package main.ast.nodes.declaration;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.visitor.IVisitor;

public class FileLevelConstant extends Declaration {
    private Type type;
    private Identifier name;
    private Expression value;

    public FileLevelConstant(Type type, Identifier name, Expression value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    @Override
    public<T>T accept(IVisitor<T> visitor){return visitor.visit(this);}

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }
}

