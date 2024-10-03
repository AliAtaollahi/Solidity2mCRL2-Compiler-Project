package main.utils;

import java.util.*;

public class DependencyTree<T> {  // Make DependencyTree a generic class
    private Map<DependencyNode<T>, List<DependencyNode<T>>> dependencyMap;

    public DependencyTree() {
        this.dependencyMap = new HashMap<>();
    }

    // Add a dependency between a parent node and a dependent node
    public void addDependency(DependencyNode<T> parentNode, DependencyNode<T> dependentNode) {
        // If the parent node is not present, initialize its list
        dependencyMap.computeIfAbsent(parentNode, k -> new ArrayList<>()).add(dependentNode);
    }

    // Get the dependencies for a given node
    public List<DependencyNode<T>> getDependencies(DependencyNode<T> node) {
        return dependencyMap.getOrDefault(node, Collections.emptyList());
    }

    // Get the entire dependency map
    public Map<DependencyNode<T>, List<DependencyNode<T>>> getDependencyMap() {
        return dependencyMap;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<DependencyNode<T>, List<DependencyNode<T>>> entry : dependencyMap.entrySet()) {
            builder.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }
        return builder.toString();
    }
}
