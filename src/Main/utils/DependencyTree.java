package main.utils;

import main.symbolTable.items.SymbolTableItem;

import java.util.*;

public class DependencyTree {
    private Map<DependencyNode, Set<DependencyNode>> dependencyMap;

    public DependencyTree() {
        this.dependencyMap = new HashMap<>();
    }

    // Add a dependency between a parent node and a dependent node
    public boolean addDependency(DependencyNode parentNode, DependencyNode dependentNode) {
        // Initialize the set if the parent node is not present
        Set<DependencyNode> dependencies = dependencyMap.computeIfAbsent(parentNode, k -> new HashSet<>());
        // Return true if the dependency was successfully added, false if it already exists
        return dependencies.add(dependentNode);
    }

    // Get the dependencies for a given node
    public Set<DependencyNode> getDependencies(DependencyNode node) {
        return dependencyMap.getOrDefault(node, Collections.emptySet());
    }

    // Get the entire dependency map
    public Map<DependencyNode, Set<DependencyNode>> getDependencyMap() {
        return dependencyMap;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<DependencyNode, Set<DependencyNode>> entry : dependencyMap.entrySet()) {
            builder.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }
        return builder.toString();
    }
}
