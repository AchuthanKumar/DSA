package com.data.structures.examples.Algorithms.Graphs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class NumberOfProvincesTest {
    @Autowired
    NumberOfProvinces numberOfProvinces;

    @Test
    public void testFindNumberOfProvinces(){
        assertEquals(2,numberOfProvinces.findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
    }

    @Test
    public void testFindNumberOfProvinces1(){
        assertEquals(3,numberOfProvinces.findCircleNum(new int[][]{{1,0,0},{0,1,0},{0,0,1}}));
    }
}
