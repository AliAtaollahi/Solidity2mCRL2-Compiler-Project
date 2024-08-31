package main.ast.nodes.declaration;

import main.ast.nodes.declaration.utility.InheritanceSpecifier;
import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ContractDefinition extends Declaration {
    private Identifier name;
    private ArrayList<InheritanceSpecifier> inheritanceSpecifiers = new ArrayList<>();
    private ArrayList<ContractPart> contractParts = new ArrayList<>();
    private boolean isAbstract = false;

    public ContractDefinition(Identifier name) {
        this.name = name;
    }

    public void addContractPart(ContractPart contractPart) {
        this.contractParts.add(contractPart);
    }

    public void addInheritanceSpecifier(InheritanceSpecifier inheritanceSpecifier) {
        this.inheritanceSpecifiers.add(inheritanceSpecifier);
    }

    public void setIsAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    @Override
    public<T>T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
