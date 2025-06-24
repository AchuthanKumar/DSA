package com.data.structures.examples.Algorithms.Graphs.CycleDetection;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DetectCycleInUndirectedGraph {

    public boolean hasCycle(int M, int N, int[][] edges, boolean bfs) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[M];

        for (int i = 0; i < M; i++) {
            if (!visited[i]) {
                if (bfs) {
                    if (bfsDetectCycle(i, visited, graph)) return true;
                } else {
                    if (dfsDetectCycle(i, visited, graph)) return true;
                }
            }
        }


        return false;
    }

    private boolean bfsDetectCycle(int start, boolean[] visited, List<List<Integer>> graph) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{-1, start});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int curr[] = queue.poll();
            int parent = curr[0];
            int node = curr[1];

            for (int adjVertex : graph.get(node)) {
                if (!visited[adjVertex]) {
                    queue.offer(new int[]{node, adjVertex});
                    visited[adjVertex] = true;
                } else if (adjVertex != parent) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfsDetectCycle(int start, boolean[] visited, List<List<Integer>> graph) {
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{-1, start});
        visited[start] = true;

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int parent = curr[0];
            int node = curr[1];

            for (int adjVertex : graph.get(node)) {
                if (!visited[adjVertex]) {
                    stack.push(new int[]{node, adjVertex});
                    visited[adjVertex] = true;
                } else if (adjVertex != parent) {
                    return true;
                }
            }
        }

        return false;
    }
}
