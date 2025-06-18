package com.data.structures.examples.Algorithms.Graphs.BFS;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        HashMap<Node, Node> clonedNodeMap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        Node clone = new Node(node.val);
        clonedNodeMap.put(node, clone);
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (Node neighbor : current.neighbors) {
                if (!clonedNodeMap.containsKey(neighbor)) {
                    Node clonedNeighbor = new Node(neighbor.val);
                    clonedNodeMap.put(neighbor, clonedNeighbor);
                    queue.offer(neighbor);
                }

//                Add Cloned neighbor to cloned node
                clonedNodeMap.get(current).neighbors.add(clonedNodeMap.get(neighbor));
            }
        }

        return clone;
    }
}

