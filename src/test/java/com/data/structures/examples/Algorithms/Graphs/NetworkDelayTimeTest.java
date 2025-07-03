package com.data.structures.examples.Algorithms.Graphs;

import com.data.structures.examples.Algorithms.Graphs.DijikstraAlgoImpl.NetworkDelayTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class NetworkDelayTimeTest {
    @Autowired
    NetworkDelayTime networkDelayTime;

    @Test
    public void testNetworkDelayTime() {
        assertEquals(2, networkDelayTime.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2));
    }

    @Test
    public void testNetworkDelayTime1(){
        assertEquals(1, networkDelayTime.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 1));
    }

    @Test
    public void testNetworkDelayTime2(){
        assertEquals(-1, networkDelayTime.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 2));
    }
}
