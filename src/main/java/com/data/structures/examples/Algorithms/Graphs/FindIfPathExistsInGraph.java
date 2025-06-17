package com.data.structures.examples.Algorithms.Graphs;

import com.data.structures.examples.DataStructures.Graphs.GraphLL;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

@Service
public class FindIfPathExistsInGraph {
    public boolean validPathCustomGraph(int n, int[][] edges, int source, int destination) {

        GraphLL graph = new GraphLL(n, true);

        for (int[] edge : edges) {
            int v1 = edge[0], v2 = edge[1];
            graph.addEdge(v1, v2);
        }

        boolean[] visited = new boolean[n];
        return traverseCustomGraphUsingDFS(graph, visited, source, destination);
    }

    private boolean traverseCustomGraphUsingDFS(GraphLL graph, boolean[] visited, int source, int destination) {
        Stack<Integer> stack = new Stack<>();
        stack.add(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (curr == destination) return true;

            for (int adjVertex : graph.adjList.get(curr)) {
                if (!visited[adjVertex]) {
                    stack.push(adjVertex);
                    visited[adjVertex] = true;
                }
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> graphLL = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graphLL.add(new LinkedList<>());

        for (int[] edge : edges) {
            int v1 = edge[0], v2 = edge[1];
            graphLL.get(v1).add(v2);
            graphLL.get(v2).add(v1);
        }

        boolean[] visited = new boolean[n];
        return traverseGraphUsingDFS(graphLL, visited, source, destination);
    }

    private boolean traverseGraphUsingDFS(List<List<Integer>> graph, boolean[] visited, int src, int dest) {
        Stack<Integer> stack = new Stack<>();
        stack.push(src);
        visited[src] = true;

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (curr == dest) return true;

            for (int adjVertex : graph.get(curr)) {
                if (!visited[adjVertex]) {
                    stack.push(adjVertex);
                    visited[adjVertex] = true;
                }
            }
        }

        return false;
    }
}
