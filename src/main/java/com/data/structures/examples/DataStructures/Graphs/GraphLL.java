package com.data.structures.examples.DataStructures.Graphs;


import com.data.structures.examples.DataStructures.SinglyLinkedLists.SinglyLinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GraphLL {
    public final List<List<Integer>> adjList;
    private final boolean isUndirected;
    private final int numVertices;

    public GraphLL(List<List<Integer>> adjList, int numVertices, boolean isUndirected) {
        this.adjList = adjList;
        this.numVertices = numVertices;
        this.isUndirected = isUndirected;
    }

    public GraphLL(int numVertices, boolean isUndirected) {
        adjList = new LinkedList<>();
        this.isUndirected = isUndirected;
        this.numVertices = numVertices;
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public void addEdge(int pos1, int pos2) {
        adjList.get(pos1).add(pos2);
        if (isUndirected) adjList.get(pos2).add(pos1);
    }

//    public void removeEdge(int pos1, int pos2) {
//        adjList.get(pos1).remove(pos2);
//        if (isUndirected) adjList.get(pos2).remove(pos1);
//    }

    public void removeEdge(int pos1, int pos2) {
        adjList.get(pos1).remove(Integer.valueOf(pos2));
        if (isUndirected) adjList.get(pos2).remove(Integer.valueOf(pos1));
    }


    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (int edges : adjList.get(i)) {
                System.out.print(" -> " + edges);
            }
            System.out.println();
        }
    }

    public void DFSUsingStack(int start) {
        boolean[] visited = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();

        stack.add(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            int currVertex = stack.pop();
            System.out.print(currVertex + " ");

            for (int adjVertex : adjList.get(currVertex)) {
                if (!visited[adjVertex]) {
                    stack.push(adjVertex);
                    visited[adjVertex] = true;
                }
            }
        }
    }

    public void DFSUsingRecursion(int start) {
        boolean[] visited = new boolean[numVertices];
        DFSUtil(start, visited);
    }

    private void DFSUtil(int currVertex, boolean[] visited) {
        System.out.print(currVertex + " ");
        visited[currVertex] = true;

        for (int adjVertex : adjList.get(currVertex)) {
            if (!visited[adjVertex]) {
                DFSUtil(adjVertex, visited);
            }
        }
    }

    public void BFS(int start) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int currVertex = queue.poll();
            System.out.print(currVertex + " ");

            for (int adjVertex : adjList.get(currVertex)) {
                if (!visited[adjVertex]) {
                    queue.offer(adjVertex);
                    visited[adjVertex] = true;
                }
            }
        }
    }
}
