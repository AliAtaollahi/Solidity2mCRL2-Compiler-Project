package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.value.StorageLocation;
import main.visitor.IVisitor;

public class FunctionCall extends Declaration {
    private Expression function;
    private FunctionCallArguments args;

    public FunctionCall(Expression function, FunctionCallArguments args) {
        this.function = function;
        this.args = args;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
