package com.data.structures.examples.Algorithms.TwoPointers;

import com.data.structures.examples.Algorithms.Arrays.TwoPointers.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RemoveDuplicatesFromSortedArrayTest {
    @Autowired
    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @Test
    public void testRemoveDuplicatesFromSortedArrayByBruteForce() {
        assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicatesByBruteForce(new int[]{1, 1, 2}));
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayByBruteForce1() {
        assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicatesByBruteForce(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayByTwoPointers() {
        assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicatesByTwoPointers(new int[]{1, 1, 2}));
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayByTwoPointers1() {
        assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicatesByTwoPointers(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
