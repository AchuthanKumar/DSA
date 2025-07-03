package com.data.structures.examples.Algorithms.Graphs.DijikstraAlgoImpl;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
//        Step 1 : Build List Impl graph
        Map<Integer, List<Edge>> graph = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] time : times) {
            graph.get(time[0]).add(new Edge(time[1], time[2]));
        }

//        Step 2: Use Dijkstra to calculate shortest path
        PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));
        boolean[] visited = new boolean[n + 1];
        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        queue.offer(new Edge(k, 0));
        distance[k] = 0;

        while (!queue.isEmpty()) {
            int currVertex = queue.poll().vertex;

            if (!visited[currVertex]) {
                visited[currVertex] = true;

                for (Edge adjEdge : graph.get(currVertex)) {
                    int adjVertex = adjEdge.vertex;
                    int weight = adjEdge.weight;

                    if (!visited[adjVertex] && distance[currVertex] + weight < distance[adjVertex]) {
                        distance[adjVertex] = distance[currVertex] + weight;
                        queue.offer(new Edge(adjVertex, distance[adjVertex]));
                    }
                }
            }
        }

//        Step 3: Validate the distance array and return Max value
        int maxNetworkTime = 0;
        for (int i = 1; i <= n; i++) {
            if (distance[i] == Integer.MAX_VALUE) return -1;
            maxNetworkTime = Math.max(maxNetworkTime, distance[i]);
        }

        return maxNetworkTime;
    }
}

class Edge {
    public int vertex;
    public int weight;

    public Edge(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}
