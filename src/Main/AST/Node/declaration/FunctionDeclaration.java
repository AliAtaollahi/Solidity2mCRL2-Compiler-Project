package Main.AST.Node.declaration;

import Main.AST.Node.expression.Identifier;
import Main.AST.Node.Statement.Statement;
import Main.AST.Type.Type;
import Main.visitor.IVisitor;

import java.util.ArrayList;

public class FunctionDeclaration extends Declaration {
    private Type returnType;
    private Identifier name;
    private ArrayList<VarDeclaration> args = new ArrayList<>();
    private ArrayList<Statement> body = new ArrayList<>();
    private ArrayList<Statement> modifier = new ArrayList<>();

    public ArrayList<Statement> getModifier() {
        return modifier;
    }

    public void setModifier(ArrayList<Statement> modifier) {
        this.modifier = modifier;
    }

    public FunctionDeclaration() {
    }


    public Identifier getName() {
        return name;
    }

    public Type getReturnType() {
        return returnType;
    }

    public ArrayList<VarDeclaration> getArgs() {
        return args;
    }

    public void setArgs(ArrayList<VarDeclaration> args) {
        this.args = args;
    }

    public ArrayList<Statement> getBody() {
        return body;
    }

    public void setBody(ArrayList<Statement> body) {
        this.body = body;
    }

    public void addStatement(Statement statement) {
        this.body.add(statement);
    }

    public void addArg(VarDeclaration arg) { this.args.add(arg); }

    public void setName(Identifier name) { this.name = name; }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
