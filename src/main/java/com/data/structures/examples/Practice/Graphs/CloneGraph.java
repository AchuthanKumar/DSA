package com.data.structures.examples.Practice.Graphs;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

@Service
public class CloneGraph {
    public Node cloneGraph(Node node) {
        if(node == null) return node;

        Map<Node, Node> cloneNodeMap = new HashMap<>();
        Queue<Node> q = new LinkedList<>();

        //Clone first node
        Node cloneNode = new Node(node.val);
        cloneNodeMap.put(node, cloneNode);
        q.offer(node);

        while (!q.isEmpty()) {
            Node currNode = q.poll();

            for (Node neighbor : currNode.neighbors) {
                if (!cloneNodeMap.containsKey(neighbor)) {
                    Node cloneNeighbor = new Node(neighbor.val);
                    cloneNodeMap.put(neighbor, cloneNeighbor);
                    q.offer(neighbor);
                }

                cloneNodeMap.get(currNode).neighbors.add(cloneNodeMap.get(neighbor));
            }
        }

        return cloneNode;
    }
}
