package main.symbolTable.items;

import main.ast.nodes.expression.primary.Identifier;
import main.symbolTable.SymbolTable;
import main.ast.nodes.declaration.utility.InheritanceSpecifier;

import java.util.ArrayList;
import java.util.List;

public class ContractSymbolTableItem extends SymbolTableItem {
    private String contractName;
    private SymbolTable contractSymbolTable;
    private List<InheritanceSpecifier> inheritanceSpecifiers;  // New field to store inheritance specifiers

    public ContractSymbolTableItem(String contractName) {
        this.contractName = contractName;
        this.inheritanceSpecifiers = new ArrayList<>();  // Initialize the inheritance specifiers list
    }

    @Override
    public String getKey() {
        return "Contract_" + contractName;
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
}
