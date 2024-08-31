package main.ast.nodes.declaration;

import main.ast.nodes.declaration.utility.ContractType;
import main.ast.nodes.declaration.utility.InheritanceSpecifier;
import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ContractDefinition extends Declaration {
    private Identifier name;
    private ArrayList<InheritanceSpecifier> inheritanceSpecifiers = new ArrayList<>();
    private ArrayList<ContractPart> contractParts = new ArrayList<>();
    private boolean isAbstract = false;

    private ContractType contractType;

    public ContractDefinition(Identifier name, String contractType) {
        this.name = name;
        this.contractType = ContractType.fromString(contractType);
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

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    public ArrayList<InheritanceSpecifier> getInheritanceSpecifiers() {
        return inheritanceSpecifiers;
    }

    public void setInheritanceSpecifiers(ArrayList<InheritanceSpecifier> inheritanceSpecifiers) {
        this.inheritanceSpecifiers = inheritanceSpecifiers;
    }

    public ArrayList<ContractPart> getContractParts() {
        return contractParts;
    }

    public void setContractParts(ArrayList<ContractPart> contractParts) {
        this.contractParts = contractParts;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }
}
