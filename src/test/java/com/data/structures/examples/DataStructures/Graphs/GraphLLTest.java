package com.data.structures.examples.DataStructures.Graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class GraphLLTest {
    GraphLL graph;

    @BeforeEach
    void setUp() {
        // Create a directed graph with 6 vertices
        graph = new GraphLL(6, false);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
    }

    private String captureOutput(Runnable methodToTest) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        methodToTest.run();
        System.setOut(System.out); // Reset back to default
        return outContent.toString().trim();
    }

    @Test
    void testDFSUsingStack() {
        String output = captureOutput(() -> graph.DFSUsingStack(0));
        // DFS from node 0 could be: 0 2 3 4 5 1 or 0 1 3 4 5 2 depending on stack order
        // Since stack uses LIFO, and neighbors are iterated in order, exact order depends on adjacency list
        // For our edge addition, we expect: 0 2 3 4 5 1
        assertEquals("0 2 3 4 5 1", output);
    }

    @Test
    void testDFSUsingRecursion() {
        String output = captureOutput(() -> graph.DFSUsingRecursion(0));
        // Recursively follows first neighbor depth-wise
        // 0 -> 1 -> 3 -> 4 -> 5, then backtrack and check 2
        assertEquals("0 1 3 4 5 2", output);
    }

    @Test
    void testBFS() {
        String output = captureOutput(() -> graph.BFS(0));
        // BFS goes level by level: 0 -> 1, 2 -> 3 -> 4 -> 5
        assertEquals("0 1 2 3 4 5", output);
    }

    @Test
    void testAddAndRemoveEdge() {
        graph.removeEdge(3, 4);
        String output = captureOutput(() -> graph.BFS(0));
        // Removing edge 3->4 breaks path to 5, expected traversal stops at 3
        assertEquals("0 1 2 3", output);
    }
}
