package com.data.structures.examples.Algorithms.TwoPointers;

import com.data.structures.examples.Algorithms.Arrays.TwoPointers.TwoSum_II_SortedArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TwoSum_II_SortedArrayTest {
    @Autowired
    TwoSum_II_SortedArray twoSum_II_SortedArray;

    @Test
    public void testTwoSum_II_SortedArrayByBruteForce() {
        assertArrayEquals(new int[]{1, 2}, twoSum_II_SortedArray.twoSumByBruteForce(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void testTwoSum_II_SortedArrayByBruteForce1() {
        assertArrayEquals(new int[]{1, 3}, twoSum_II_SortedArray.twoSumByBruteForce(new int[]{2, 3,4}, 6));
    }

    @Test
    public void testTwoSum_II_SortedArrayByBruteForce2() {
        assertArrayEquals(new int[]{1, 2}, twoSum_II_SortedArray.twoSumByBruteForce(new int[]{-1,0}, -1));
    }

    @Test
    public void testTwoSum_II_SortedArrayByTwoPointers() {
        assertArrayEquals(new int[]{1, 2}, twoSum_II_SortedArray.twoSumByTwoPointers(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void testTwoSum_II_SortedArrayByTwoPointers1() {
        assertArrayEquals(new int[]{1, 3}, twoSum_II_SortedArray.twoSumByTwoPointers(new int[]{2, 3,4}, 6));
    }

    @Test
    public void testTwoSum_II_SortedArrayByTwoPointers2() {
        assertArrayEquals(new int[]{1, 2}, twoSum_II_SortedArray.twoSumByTwoPointers(new int[]{-1,0}, -1));
    }
}
