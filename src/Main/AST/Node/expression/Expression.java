package Main.AST.Node.expression;

import Main.AST.Type.Type;
import Main.AST.Node.Node;
import Main.AST.Node.Statement.Statement;

public abstract class Expression extends Node{
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}