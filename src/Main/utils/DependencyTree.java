package main.utils;

import main.symbolTable.items.SymbolTableItem;

import java.util.*;

public class DependencyTree {
    private Map<DependencyNode, List<DependencyNode>> dependencyMap;

    public DependencyTree() {
        this.dependencyMap = new HashMap<>();
    }

    // Add a dependency between a parent node and a dependent node
    public void addDependency(DependencyNode parentNode, DependencyNode dependentNode) {
        // If the parent node is not present, initialize its list
        dependencyMap.computeIfAbsent(parentNode, k -> new ArrayList<>()).add(dependentNode);
    }

    // Get the dependencies for a given node
    public List<DependencyNode> getDependencies(DependencyNode node) {
        return dependencyMap.getOrDefault(node, Collections.emptyList());
    }

    // Get the entire dependency map
    public Map<DependencyNode, List<DependencyNode>> getDependencyMap() {
        return dependencyMap;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<DependencyNode, List<DependencyNode>> entry : dependencyMap.entrySet()) {
            builder.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }
        return builder.toString();
    }
}
