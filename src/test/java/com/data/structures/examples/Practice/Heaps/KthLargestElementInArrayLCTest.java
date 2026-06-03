package com.data.structures.examples.Practice.Heaps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class KthLargestElementInArrayLCTest {

    @Autowired
    KthLargestElementInArrayLC kthLargestElementInArray;

    @Test
    public void testKthLargestInArrayCase1() {
        int result = kthLargestElementInArray.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(result);
        assertEquals(5, result);
    }

    @Test
    public void testKthLargestInArrayCase2() {
        int result = kthLargestElementInArray.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        System.out.println(result);
        assertEquals(4, result);
    }

}
