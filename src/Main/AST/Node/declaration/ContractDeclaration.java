package Main.AST.Node.declaration;

import java.util.ArrayList;

import Main.AST.Node.Statement.Statement;
import Main.visitor.IVisitor;

public class ContractDeclaration extends Declaration {
    private ArrayList<VarDeclaration> Variables = new ArrayList<>();
    private ArrayList<FunctionDeclaration> body = new ArrayList<>();

    public ContractDeclaration(){
    }

    public ArrayList<VarDeclaration> getVariables(){
        return this.Variables;
    }

    public void setVariables(ArrayList<VarDeclaration> Variables) {
        this.Variables = Variables;
    }

    public void addActorInstantiation(VarDeclaration variableInstantiation) {
        Variables.add(variableInstantiation);
    }


    public ArrayList<FunctionDeclaration> getBody() {
        return body;
    }

    public void setBody(ArrayList<FunctionDeclaration> body) {
        this.body = body;
    }

    public void addStatement(FunctionDeclaration statement) {
        this.body.add(statement);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
