package com.data.structures.examples.Algorithms.Graphs;

import com.data.structures.examples.Algorithms.Graphs.Basics.FindIfPathExistsInGraph;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class FindIfPathExistsInGraphTest {
    @Autowired
    FindIfPathExistsInGraph findIfPathExistsInGraph;

    @Test
    public void testFindIfPathExistsInGraph() {
        assertTrue(findIfPathExistsInGraph.validPathCustomGraph(3, new int[][]{{0,1},{1,2},{2,0}},0, 2));
    }

    @Test
    public void testFindIfPathExistsInGraph1() {
        assertFalse(findIfPathExistsInGraph.validPathCustomGraph(6,new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}},0,5));
    }

    @Test
    public void testFindIfPathExistsInGraph2() {
        assertTrue(findIfPathExistsInGraph.validPath(3, new int[][]{{0,1},{1,2},{2,0}},0, 2));
    }

    @Test
    public void testFindIfPathExistsInGraph3() {
        assertFalse(findIfPathExistsInGraph.validPath(6,new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}},0,5));
    }
}
