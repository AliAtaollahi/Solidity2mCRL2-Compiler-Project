package main.ast.nodes.expression;

import main.ast.nodes.declaration.utility.FunctionCallArguments;
import main.ast.nodes.declaration.utility.NameValueList;
import main.visitor.IVisitor;

public class StructInitializationExpression extends Expression{
    private Expression name;
    private NameValueList nameValueList;

    public StructInitializationExpression(Expression name, NameValueList nameValueList) {
        this.name = name;
        this.nameValueList = nameValueList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
