package org.dsa.dsa.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Graph implements using Map<String,ArrayList<String>>
 */
public class Graph {
    private Map<String, ArrayList<String>> adList = new HashMap<>();

    public boolean addVertex(String vertex) {
        if (adList.get(vertex) == null) { // if vertex is new not exist
            adList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if (adList.get(vertex1) != null && adList.get(vertex2) != null) {
            adList.get(vertex1).add(vertex2);
            adList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if (adList.get(vertex1) != null && adList.get(vertex2) != null) {
            adList.get(vertex1).remove(vertex2);
            adList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if (adList.get(vertex) == null) return false;
        for (String oldVertex : adList.get(vertex)) {
            adList.get(oldVertex).remove(vertex); //remove from list
        }
        adList.remove(vertex); //remove from main
        return true;
    }

    public void printGraph() {
        System.out.println(adList);
    }
}
