package com.data.structures.examples.Algorithms.Graphs;

import com.data.structures.examples.Algorithms.Graphs.DFS.FloodFill;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertArrayEquals;

@SpringBootTest
public class FloodFillTest {
    @Autowired
    FloodFill floodFill;

    @Test
    public void testFloodFill(){
        assertArrayEquals(new int[][]{{2,2,2},{2,2,0},{2,0,1}}, floodFill.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}},1,1,2));
    }

    @Test
    public void testFloodFill1(){
        assertArrayEquals(new int[][]{{0,0,0},{0,0,0}}, floodFill.floodFill(new int[][]{{0,0,0},{0,0,0}},0,0,0));
    }
}
