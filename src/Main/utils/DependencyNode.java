package main.utils;

import main.ast.nodes.declaration.ContractDefinition;
import main.ast.nodes.declaration.FunctionDefinition;
import main.ast.nodes.expression.primary.FunctionDescriptor;
import main.ast.nodes.expression.primary.OtherFunctionDescriptors;

import java.util.Objects;

public class DependencyNode<T> {  // T is the generic type
    private T itemKey;  // T replaces FunctionDefinition
    private ContractDefinition contractDefinitionKey;
    private String nameForDebug;

    // Constructor with T as the type for functionDefinitionKey
    public DependencyNode(T itemKey, ContractDefinition contractDefinitionKey) {
        this.itemKey = itemKey;
        this.contractDefinitionKey = contractDefinitionKey;
        String itemName = "";
        if (itemKey instanceof FunctionDefinition) {
            FunctionDefinition functionDefinition = (FunctionDefinition)itemKey;
            itemName = (functionDefinition.getFunctionDescriptor() instanceof FunctionDescriptor) ?
                    ((FunctionDescriptor) functionDefinition.getFunctionDescriptor()).getName().getName() :
                    ((OtherFunctionDescriptors) functionDefinition.getFunctionDescriptor()).getName();
        }
        this.nameForDebug = itemName + "  ->  " + contractDefinitionKey.getName().getName();
    }

    // Getter and setter for the generic type
    public T getFunctionDefinitionKey() {
        return itemKey;
    }

    public void setFunctionDefinitionKey(T functionDefinitionKey) {
        this.itemKey = functionDefinitionKey;
    }

    public ContractDefinition getContractDefinitionKey() {
        return contractDefinitionKey;
    }

    public void setContractDefinitionKey(ContractDefinition contractDefinitionKey) {
        this.contractDefinitionKey = contractDefinitionKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DependencyNode<?> node = (DependencyNode<?>) o;
        return Objects.equals(itemKey, node.itemKey) &&
                Objects.equals(contractDefinitionKey, node.contractDefinitionKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemKey, contractDefinitionKey);
    }

    @Override
    public String toString() {
        return "DependencyNode{" +
                "itemKey=" + itemKey +
                ", contractDefinitionKey=" + contractDefinitionKey +
                ", nameForDebug='" + nameForDebug + '\'' +
                '}';
    }
}
