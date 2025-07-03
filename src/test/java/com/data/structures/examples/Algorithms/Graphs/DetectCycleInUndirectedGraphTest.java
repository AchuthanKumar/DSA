package com.data.structures.examples.Algorithms.Graphs;

import com.data.structures.examples.Algorithms.Graphs.CycleDetection.DetectCycleInUndirectedGraph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class DetectCycleInUndirectedGraphTest {
    @Autowired
    DetectCycleInUndirectedGraph detectCycleInUndirectedGraph;

    @Test
    public void testDetectCycleInUndirectedGraphUsingBfs() {
        Assertions.assertTrue(detectCycleInUndirectedGraph.hasCycle(4, 4, new int[][]{{0, 1}, {0, 2}, {1, 2}, {2, 3}}, true));
    }

    @Test
    public void testDetectCycleInUndirectedGraphUsingDfs() {
        Assertions.assertTrue(detectCycleInUndirectedGraph.hasCycle(4, 4, new int[][]{{0, 1}, {0, 2}, {1, 2}, {2, 3}}, false));
    }

    @Test
    public void testAcyclicGraph_BFS() {
        Assertions.assertFalse(detectCycleInUndirectedGraph.hasCycle(5, 4, new int[][]{{0, 1}, {1, 2}, {3, 4}}, true));
    }

    @Test
    public void testAcyclicGraph_DFS() {
        Assertions.assertFalse(detectCycleInUndirectedGraph.hasCycle(5, 4, new int[][]{{0, 1}, {1, 2}, {3, 4}}, false));
    }

    @Test
    public void testCyclicDisconnectedGraph_BFS() {
        Assertions.assertTrue(detectCycleInUndirectedGraph.hasCycle(6, 5, new int[][]{{0, 1}, {1, 2}, {2, 0}, {3, 4}, {4, 5}}, true));
    }

    @Test
    public void testCyclicDisconnectedGraph_DFS() {
        Assertions.assertTrue(detectCycleInUndirectedGraph.hasCycle(6, 5, new int[][]{{0, 1}, {1, 2}, {2, 0}, {3, 4}, {4, 5}}, false));
    }

    @Test
    public void testSingleNode_NoCycle_BFS() {
        Assertions.assertFalse(detectCycleInUndirectedGraph.hasCycle(1, 0, new int[][]{}, true));
    }

    @Test
    public void testSingleNode_NoCycle_DFS() {
        Assertions.assertFalse(detectCycleInUndirectedGraph.hasCycle(1, 0, new int[][]{}, false));
    }

    @Test
    public void testTwoNodesNoCycle_BFS() {
        Assertions.assertFalse(detectCycleInUndirectedGraph.hasCycle(2, 1, new int[][]{{0, 1}}, true));
    }

    @Test
    public void testTwoNodesNoCycle_DFS() {
        Assertions.assertFalse(detectCycleInUndirectedGraph.hasCycle(2, 1, new int[][]{{0, 1}}, false));
    }

    @Test
    public void testCycleInLongerPath_BFS() {
        Assertions.assertTrue(detectCycleInUndirectedGraph.hasCycle(5, 5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 0}}, true));
    }

    @Test
    public void testCycleInLongerPath_DFS() {
        Assertions.assertTrue(detectCycleInUndirectedGraph.hasCycle(5, 5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 0}}, false));
    }

}
