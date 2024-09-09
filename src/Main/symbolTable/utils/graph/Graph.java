package main.symbolTable.utils.graph;

import main.symbolTable.utils.graph.exceptions.GraphDoesNotContainNodeException;
import main.symbolTable.utils.graph.exceptions.NodeAlreadyExistsException;

import java.util.*;

public class Graph<N> {
    private Map<N, Set<N>> parentShipRelation = new HashMap<>();

    public void addNode(N desired) throws NodeAlreadyExistsException {
        if (parentShipRelation.containsKey(desired))
            throw new NodeAlreadyExistsException();
        parentShipRelation.put(desired, new HashSet<>());
    }

    public boolean doesGraphContainNode(N desired) {
        return parentShipRelation.containsKey(desired);
    }

    public void addNodeAsParentOf(N desired, N parentNode) throws GraphDoesNotContainNodeException {
        if (!parentShipRelation.containsKey(desired))
            throw new GraphDoesNotContainNodeException();
        parentShipRelation.get(desired).add(parentNode);
    }

    public Collection<N> getParentsOfNode(N desired) throws GraphDoesNotContainNodeException {
        if (!parentShipRelation.containsKey(desired))
            throw new GraphDoesNotContainNodeException();
        return parentShipRelation.get(desired);
    }

    public boolean isSecondNodeAncestorOf(N first , N second) {
        Set<N> visitedNodes = new HashSet<>();
        return _isSecondNodeAncestorOf(first,second, visitedNodes);
    }

    private boolean _isSecondNodeAncestorOf(N first, N second, Set<N> visitedNodes) {
        try {
            if(first.equals(second))
                return true;
            Collection<N> parents = getParentsOfNode(first);
            for(N node : parents) {
                if (node.equals(second)) {
                    return true;
                }
                if (visitedNodes.contains(node))
                    continue;
                visitedNodes.add(node);
                if (_isSecondNodeAncestorOf(node, second, visitedNodes))
                    return true;
            }
        } catch(GraphDoesNotContainNodeException ignored) {
        }
        return false;
    }

}
