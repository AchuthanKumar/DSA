package com.data.structures.examples.Practice.Heaps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TopKFrequentElementsLCTest {

    @Autowired
    TopKFrequentElementsLC topKFrequentElementsLC;

    @Test
    public void testTopKFrequentElementsLCCase1() {
        int[] result = topKFrequentElementsLC.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testTopKFrequentElementsLCCase2() {
        int[] result = topKFrequentElementsLC.topKFrequent(new int[]{1}, 1);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void testTopKFrequentElementsLCCase3() {
        int[] result = topKFrequentElementsLC.topKFrequent(new int[]{1,2,1,2,1,2,3,1,3,2}, 2);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{1,2}, result);
    }

    @Test
    public void testTopKFrequentElementsLCCase4() {
        int[] result = topKFrequentElementsLC.topKFrequent(new int[]{5,3,1,1,1,3,73,1}, 2);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{1,3}, result);
    }


    @Test
    public void testTopKFrequentElementsLCMinHeapCase1() {
        int[] result = topKFrequentElementsLC.topKFrequentMinHeap(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testTopKFrequentElementsLCMinHeapCase2() {
        int[] result = topKFrequentElementsLC.topKFrequentMinHeap(new int[]{1}, 1);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void testTopKFrequentElementsLCMinHeapCase3() {
        int[] result = topKFrequentElementsLC.topKFrequentMinHeap(new int[]{1,2,1,2,1,2,3,1,3,2}, 2);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{1,2}, result);
    }

    @Test
    public void testTopKFrequentElementsLCMinHeapCase4() {
        int[] result = topKFrequentElementsLC.topKFrequentMinHeap(new int[]{5,3,1,1,1,3,73,1}, 2);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{1,3}, result);
    }
}
