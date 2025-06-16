package com.data.structures.examples.DataStructures.Graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GraphLLTest {
    GraphLL graph;

    @BeforeEach
    public void setupGraph() {
        graph = new GraphLL(5, false);
    }

    @Test
    public void testGraphLL() {
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        graph.addEdge(4, 0);
        graph.addEdge(1, 2);

        graph.printGraph();
    }
}
