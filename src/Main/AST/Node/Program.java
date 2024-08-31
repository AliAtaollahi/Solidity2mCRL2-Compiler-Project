package Main.AST.Node;

import Main.AST.Node.declaration.*;
import Main.visitor.IVisitor;

import java.util.ArrayList;

public class Program extends Node{
    private ArrayList<GlobVariableDeclaration> vars = new ArrayList<>();
    private ArrayList<FunctionDeclaration> functions = new ArrayList<>();
    private ContractDeclaration programContractDeclaration;

    public ContractDeclaration getContract() {
        return this.programContractDeclaration;
    }

    public void setContract(ContractDeclaration contractDeclarationActors) {
        this.programContractDeclaration = contractDeclarationActors;
    }

    public ArrayList<GlobVariableDeclaration> getVars() {
        return vars;
    }

    public void setVars(ArrayList<GlobVariableDeclaration> vars) {
        this.vars = vars;
    }

    public ArrayList<FunctionDeclaration> getFunctions() {
        return functions;
    }

    public void setFunctions(ArrayList<FunctionDeclaration> functions) {
        this.functions = functions;
    }

    public void addVar(GlobVariableDeclaration globVariableDeclaration) {
        this.vars.add(globVariableDeclaration);
    }

    public void addFunction(FunctionDeclaration functionDeclaration) {
        this.functions.add(functionDeclaration);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}