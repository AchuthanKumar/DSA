package com.data.structures.examples.DataStructures.Graphs;


import com.data.structures.examples.DataStructures.SinglyLinkedLists.SinglyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class GraphLL {
    private final List<List<Integer>> adjList;
    private final boolean isUndirected;

    public GraphLL(int numVertices, boolean isUndirected) {
        adjList = new LinkedList<>();
        this.isUndirected = isUndirected;
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public void addEdge(int pos1, int pos2) {
        adjList.get(pos1).add(pos2);
        if (isUndirected) adjList.get(pos2).add(pos1);
    }

    public void removeEdge(int pos1, int pos2) {
        adjList.get(pos1).remove(pos2);
        if (isUndirected) adjList.get(pos2).remove(pos1);
    }

    public void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("Vertex " + i + ":");
            for (int edges : adjList.get(i)) {
                System.out.print(" -> " + edges);
            }
            System.out.println();
        }
    }
}
