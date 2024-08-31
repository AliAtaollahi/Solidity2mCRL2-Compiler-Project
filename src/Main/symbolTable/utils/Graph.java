package main.symbolTable.utils;

import java.util.*;

public class Graph {
    private final Map<String, List<String>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(String a, String b) {
        adjacencyList.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
    }

    public ArrayList<List<String>> findCycles() {
        Set<String> visited = new HashSet<>();
        Set<String> beingVisited = new HashSet<>();
        ArrayList<List<String>> cycles = new ArrayList<>();

        for (String vertex : adjacencyList.keySet()) {
            if (!visited.contains(vertex)) {
                List<String> result = new ArrayList<>();
                if (hasCycle(vertex, visited, beingVisited, result)) {
                    cycles.add(result);
                }
            }
        }

        return cycles;
    }

    private boolean hasCycle(String vertex, Set<String> visited, Set<String> beingVisited, List<String> result) {
        visited.add(vertex);
        beingVisited.add(vertex);

        for (String neighbor : adjacencyList.getOrDefault(vertex, Collections.emptyList())) {
            if (beingVisited.contains(neighbor)) {
                result.add(neighbor);
                return true;
            }
            if (!visited.contains(neighbor) && hasCycle(neighbor, visited, beingVisited, result)) {
                result.add(neighbor);
                return true;
            }
        }

        beingVisited.remove(vertex);
        return false;
    }
    public Void printGraph(){
        for(String vertex : adjacencyList.keySet()){
            System.out.println(vertex + "----");
            for(String adj : adjacencyList.get(vertex)){
                System.out.println(adj);
            }
            System.out.println("--------");
        }
        return null;
    }


}

