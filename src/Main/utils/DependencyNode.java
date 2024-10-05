package main.utils;

import main.ast.nodes.declaration.ContractDefinition;
import main.symbolTable.items.SymbolTableItem;
import java.util.Objects;

public class DependencyNode {
    private SymbolTableItem itemKey;  // Changed from T to SymbolTableItem
    private ContractDefinition contractDefinitionKey;
    private String nameForDebug;

    // Constructor accepting SymbolTableItem
    public DependencyNode(SymbolTableItem itemKey, ContractDefinition contractDefinitionKey) {
        this.itemKey = itemKey;
        this.contractDefinitionKey = contractDefinitionKey;
        String itemName = itemKey.getKey();  // Now directly using getName from SymbolTableItem
        this.nameForDebug = itemName + "  ->  " + contractDefinitionKey.getName().getName();
    }

    // Getter and setter for SymbolTableItem
    public SymbolTableItem getItemKey() {
        return itemKey;
    }

    public void setItemKey(SymbolTableItem itemKey) {
        this.itemKey = itemKey;
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
        DependencyNode node = (DependencyNode) o;
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
