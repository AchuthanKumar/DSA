package com.data.structures.examples.Algorithms.SlidingWindow.VariableSize;

import com.data.structures.examples.Algorithms.Arrays.SlidingWindow.VariableSize.MaximumSumSubArrayOfSizeK;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MaximumSumSubArrayOfSizeKTest {
    @Autowired
    private MaximumSumSubArrayOfSizeK maximumSumSubArrayOfSizeK;

    @Test
    public void testMaximumSumSubArrayOfSizeK() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySum(new int[]{1, 5, 4, 2, 9, 9, 9}, 3));
        assertEquals(15, maximumSumSubArrayOfSizeK.maximumSubarraySum(new int[]{1, 5, 4, 2, 9, 9, 9}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeK1() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySum(new int[]{4,4,4}, 3));
        assertEquals(0, maximumSumSubArrayOfSizeK.maximumSubarraySum(new int[]{4,4,4}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeK2() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySum(new int[]{1,2,3}, 3));
        assertEquals(6, maximumSumSubArrayOfSizeK.maximumSubarraySum(new int[]{1,2,3}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeK3() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySum(new int[]{1,1,1,7,8,9}, 3));
        assertEquals(24, maximumSumSubArrayOfSizeK.maximumSubarraySum(new int[]{1,1,1,7,8,9}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeK4() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySum(new int[]{1,1,1,1,1,1}, 2));
        assertEquals(0, maximumSumSubArrayOfSizeK.maximumSubarraySum(new int[]{1,1,1,1,1,1}, 2));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKBySlidingWindow() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumBySlidingWindow(new int[]{1, 5, 4, 2, 9, 9, 9}, 3));
        assertEquals(15, maximumSumSubArrayOfSizeK.maximumSubarraySumBySlidingWindow(new int[]{1, 5, 4, 2, 9, 9, 9}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKBySlidingWindow1() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumBySlidingWindow(new int[]{4,4,4}, 3));
        assertEquals(0, maximumSumSubArrayOfSizeK.maximumSubarraySumBySlidingWindow(new int[]{4,4,4}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKBySlidingWindow2() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumBySlidingWindow(new int[]{1,2,3}, 3));
        assertEquals(6, maximumSumSubArrayOfSizeK.maximumSubarraySumBySlidingWindow(new int[]{1,2,3}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKBySlidingWindow3() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumBySlidingWindow(new int[]{1,1,1,7,8,9}, 3));
        assertEquals(24, maximumSumSubArrayOfSizeK.maximumSubarraySumBySlidingWindow(new int[]{1,1,1,7,8,9}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKBySlidingWindow4() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumBySlidingWindow(new int[]{1,1,1,1,1,1}, 2));
        assertEquals(0, maximumSumSubArrayOfSizeK.maximumSubarraySumBySlidingWindow(new int[]{1,1,1,1,1,1}, 2));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKByFixedSizeSlidingWindow() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{1, 5, 4, 2, 9, 9, 9}, 3));
        assertEquals(15, maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{1, 5, 4, 2, 9, 9, 9}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKByFixedSizeSlidingWindow1() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{4,4,4}, 3));
        assertEquals(0, maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{4,4,4}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKByFixedSizeSlidingWindow2() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{1,2,3}, 3));
        assertEquals(6, maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{1,2,3}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKByFixedSizeSlidingWindow3() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{1,1,1,7,8,9}, 3));
        assertEquals(24, maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{1,1,1,7,8,9}, 3));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKByFixedSizeSlidingWindow4() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{1,1,1,1,1,1}, 2));
        assertEquals(0, maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{1,1,1,1,1,1}, 2));
    }

    @Test
    public void testMaximumSumSubArrayOfSizeKByFixedSizeSlidingWindow5() {
        System.out.println(maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{9,9,9,1,2,3}, 3));
        assertEquals(12, maximumSumSubArrayOfSizeK.maximumSubarraySumByFixedSizeSlidingWindow(new int[]{9,9,9,1,2,3}, 3));
    }
}
