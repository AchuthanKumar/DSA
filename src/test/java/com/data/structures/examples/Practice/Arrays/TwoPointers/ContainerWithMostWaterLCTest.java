package com.data.structures.examples.Practice.Arrays.TwoPointers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ContainerWithMostWaterLCTest {

    @Autowired
    ContainerWithMostWaterLC containerWithMostWaterLC;


    @Test
    public void testContainerWithMostWaterLCCase1(){
        int resultArea = containerWithMostWaterLC.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(resultArea);
        assertEquals(49,resultArea);
    }

    @Test
    public void testContainerWithMostWaterLCCase2(){
        int resultArea = containerWithMostWaterLC.maxArea(new int[]{1,1});
        System.out.println(resultArea);
        assertEquals(1,resultArea);
    }
}
