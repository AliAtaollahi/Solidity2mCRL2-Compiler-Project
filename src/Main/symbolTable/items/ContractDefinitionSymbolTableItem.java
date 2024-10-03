package main.symbolTable.items;

import main.ast.nodes.declaration.ContractDefinition;
import main.ast.nodes.expression.primary.Type;
import main.ast.nodes.expression.type.UserDefinedTypeName;
import main.symbolTable.SymbolTable;
import main.ast.nodes.declaration.utility.InheritanceSpecifier;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class ContractDefinitionSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "Contract_";
    private String contractName;
    private SymbolTable contractSymbolTable;
    private List<InheritanceSpecifier> inheritanceSpecifiers;
    private Type type;
    private ContractDefinition contractDefinition;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public ContractDefinitionSymbolTableItem(String contractName, UserDefinedTypeName type, ContractDefinition contractDefinition) {
        this.contractName = contractName;
        this.inheritanceSpecifiers = new ArrayList<>();
        this.type = type;
        this.contractDefinition = contractDefinition;
    }

    @Override
    public String getKey() {
        return this.START_KEY + contractName;
    }

    public String getContractName() {
        return contractName;
    }

    public SymbolTable getContractSymbolTable() {
        return contractSymbolTable;
    }

    public void setContractSymbolTable(SymbolTable contractSymbolTable) {
        this.contractSymbolTable = contractSymbolTable;
    }

    // New method to add inheritance specifiers
    public void addInheritanceSpecifier(InheritanceSpecifier inheritanceSpecifier) {
        this.inheritanceSpecifiers.add(inheritanceSpecifier);
    }

    // New method to get all inheritance specifiers
    public List<InheritanceSpecifier> getInheritanceSpecifiers() {
        return inheritanceSpecifiers;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ContractDefinition getContractDefinition() {
        return contractDefinition;
    }

    public void setContractDefinition(ContractDefinition contractDefinition) {
        this.contractDefinition = contractDefinition;
    }

    public void setInheritanceSpecifiers(List<InheritanceSpecifier> inheritanceSpecifiers) {
        this.inheritanceSpecifiers = inheritanceSpecifiers;
    }
}
