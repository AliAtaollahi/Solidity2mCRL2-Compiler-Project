package Main.AST.Node.expression;

import Main.visitor.IVisitor;

import java.util.ArrayList;

public class MethodCall extends Expression {
    private Identifier identifier;
    private Expression instance;
    private Identifier functionName;
    private ArrayList<Expression> args = new ArrayList<>();

    public MethodCall(Expression instance, Identifier functionName) {
        this.instance = instance;
        this.functionName = functionName;
    }

    public MethodCall(){}

    public Expression getInstance() {
        return instance;
    }

    public void setInstance(Expression instance) {
        this.instance = instance;
    }

    public Identifier getFunctionName() {
        return functionName;
    }

    public Identifier getIdentifierName() {
        return identifier;
    }
    public void setFunctionName(Identifier functionName) {
        this.functionName = functionName;
    }

    public void setIdentifierName(Identifier identifier) {
        this.identifier = identifier;
    }
    public void setArgs(ArrayList<Expression> args) {
        this.args = args;
    }

    public ArrayList<Expression> getArgs() {
        return args;
    }

    public void addArg(Expression arg) {
        this.args.add(arg);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
