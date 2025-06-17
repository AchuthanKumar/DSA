package com.data.structures.examples.Algorithms.Graphs;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

@Service
public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < isConnected.length; i++) {
            graph.add(new LinkedList<>());
            for (int j = 0; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1) {
                    graph.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[isConnected.length];
        int numOfProvinces = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                findTotalNumberProvincesUsingDFS(graph, visited, i);
                numOfProvinces++;
            }
        }

        return numOfProvinces;
    }

    private void findTotalNumberProvincesUsingDFS(List<List<Integer>> graph, boolean[] visited, int src) {
        Stack<Integer> stack = new Stack<>();

        stack.push(src);
        visited[src] = true;

        while (!stack.isEmpty()) {
            int curr = stack.pop();

            for (int adjVertex : graph.get(curr)) {
                if (!visited[adjVertex]) {
                    stack.push(adjVertex);
                    visited[adjVertex] = true;
                }
            }
        }
    }
}
