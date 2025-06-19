package com.data.structures.examples.Algorithms.Graphs;

import com.data.structures.examples.Algorithms.Graphs.BFS.RottingOranges;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class RottingOrangesTest {
    @Autowired
    RottingOranges rottingOranges;

    @Test
    public void testOrangesRottingEveryMinute(){
        assertEquals(4,rottingOranges.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
    }

    @Test
    public void testOrangesRottingEveryMinute1(){
        assertEquals(-1,rottingOranges.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}}));
    }

    @Test
    public void testOrangesRottingEveryMinute2(){
        assertEquals(0,rottingOranges.orangesRotting(new int[][]{{0,2}}));
    }
}
