package Main.AST.Node.expression.values;

import Main.AST.Type.Type;
import Main.AST.Node.expression.Expression;

public abstract class Value extends Expression {
    protected Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}