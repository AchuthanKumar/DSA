package com.data.structures.examples.Algorithms.Graphs.MST;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReconstructItinerary {
    public List<String> findItinerary(List<List<String>> tickets) {
        LinkedList<String> reconstructedItinerary = new LinkedList<>();

        //Step 1 : Construct a Graph
        Map<String, PriorityQueue<String>> graph = new HashMap<>();

        for (List<String> ticket : tickets) {
            graph.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            graph.get(ticket.get(0)).offer(ticket.get(1));
        }

        //Step 2: Perform Post order DFS to identify the eulerian path
        postOrderDfs("JFK", graph, reconstructedItinerary);

        return reconstructedItinerary;
    }

    private void postOrderDfs(String airport, Map<String, PriorityQueue<String>> airportMap, LinkedList<String> itinerary) {
        PriorityQueue<String> destinations = airportMap.get(airport);
        while (destinations != null && !destinations.isEmpty()) {
            postOrderDfs(destinations.poll(), airportMap, itinerary);
        }
        itinerary.addFirst(airport);
    }
}

