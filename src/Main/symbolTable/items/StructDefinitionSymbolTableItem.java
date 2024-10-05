package main.symbolTable.items;

import main.ast.nodes.declaration.ContractDefinition;
import main.ast.nodes.declaration.StructDefinition;
import main.ast.nodes.expression.StructInitializationExpression;
import main.ast.nodes.expression.primary.*;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class StructDefinitionSymbolTableItem extends SymbolTableItem {
    private SymbolTable symbolTable;
    private Type type;
    private StructDefinition structDefinition;
    private ContractDefinition contractDefinition;


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public StructDefinitionSymbolTableItem(String name, Type type, StructDefinition structDefinition, ContractDefinition contractDefinition) {
        this.name = name;
        this.type = type;
        this.structDefinition = structDefinition;
        this.setLine(structDefinition.getLine());
        this.contractDefinition = contractDefinition;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public String getKey() {
        // Return a unique key for the variable, using its name
        return StructInitializationExpression.START_KEY + name;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public StructDefinition getStructDefinition() {
        return structDefinition;
    }

    public void setStructDefinition(StructDefinition structDefinition) {
        this.structDefinition = structDefinition;
    }

    public ContractDefinition getContractDefinition() {
        return contractDefinition;
    }

    public void setContractDefinition(ContractDefinition contractDefinition) {
        this.contractDefinition = contractDefinition;
    }
}
