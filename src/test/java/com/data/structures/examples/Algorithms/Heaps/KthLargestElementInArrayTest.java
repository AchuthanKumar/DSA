package com.data.structures.examples.Algorithms.Heaps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class KthLargestElementInArrayTest {
    @Autowired
    KthLargestElementInArray kthLargestElementInArray;

    @Test
    public void testKthLargestElementInArrayFnWithHeap() {
        assertEquals(5, kthLargestElementInArray.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    public void testKthLargestElementInArrayFnWithHeap1() {
        assertEquals(4, kthLargestElementInArray.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }

    @Test
    public void testKthLargestElementInArrayFnWithPq() {
        assertEquals(5, kthLargestElementInArray.findKthLargestPq(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    public void testKthLargestElementInArrayFnWithPq1() {
        assertEquals(4, kthLargestElementInArray.findKthLargestPq(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }

}
