package main.ast.nodes.expression;

import main.ast.nodes.declaration.utility.FunctionCallArguments;
import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

public class FunctionCallExpression extends Expression{
    private Expression functionName;
    private FunctionCallArguments args;

    public FunctionCallExpression(Expression functionName, FunctionCallArguments args) {
        this.functionName = functionName;
        this.args = args;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}

    public Expression getFunctionName() {
        return functionName;
    }

    public void setFunctionName(Expression functionName) {
        this.functionName = functionName;
    }

    public FunctionCallArguments getArgs() {
        return args;
    }

    public void setArgs(FunctionCallArguments args) {
        this.args = args;
    }
}
