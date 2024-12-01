package org.dsa.dsa.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Graph implements using Map<T,List<T>>
 */
public class Graph<T> {
    private final Map<T, List<T>> adList = new HashMap<>();

    public void addVertex(T vertex) {
            adList.putIfAbsent(vertex, new ArrayList<>()); //A,B
    }

    public void addEdge(T vertex1, T vertex2) {
        if (adList.get(vertex1) != null && adList.get(vertex2) != null) {
            adList.get(vertex1).add(vertex2);//A,[B]
            adList.get(vertex2).add(vertex1);//B,[A]
        }
    }

    public void removeEdge(T vertex1, T vertex2) {
        if (adList.get(vertex1) != null && adList.get(vertex2) != null) {
            adList.get(vertex1).remove(vertex2);
            adList.get(vertex2).remove(vertex1);
        }
    }

    public void removeVertex(T vertex) {
        if (adList.get(vertex) == null) return;
        for (T oldVertex : adList.get(vertex)) {
            adList.get(oldVertex).remove(vertex); //remove from list
        }
        adList.remove(vertex); //remove from main
    }

    public void printGraph() {
        System.out.println(adList);
    }

}
