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
}

