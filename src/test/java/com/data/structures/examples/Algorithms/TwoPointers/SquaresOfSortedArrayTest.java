package com.data.structures.examples.Algorithms.TwoPointers;

import com.data.structures.examples.Algorithms.Arrays.TwoPointers.SquaresOfSortedArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class SquaresOfSortedArrayTest {
    @Autowired
    SquaresOfSortedArray squaresOfSortedArray;

    @Test
    public void testSquaresOfSortedArray() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, squaresOfSortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    public void testSquaresOfSortedArray1() {
        assertArrayEquals(new int[]{4,9,9,49,121}, squaresOfSortedArray.sortedSquares(new int[]{-7,-3,2,3,11}));
    }

    @Test
    public void testSquaresOfSortedArray2() {
        assertArrayEquals(new int[]{1,4,9,25}, squaresOfSortedArray.sortedSquares(new int[]{-5,-3,-2,-1}));
    }
}
