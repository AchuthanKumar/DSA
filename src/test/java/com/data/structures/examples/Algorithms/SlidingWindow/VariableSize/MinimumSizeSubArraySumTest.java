package com.data.structures.examples.Algorithms.SlidingWindow.VariableSize;

import com.data.structures.examples.Algorithms.Arrays.SlidingWindow.VariableSize.MinimumSizeSubArraySum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MinimumSizeSubArraySumTest {
    @Autowired
    private MinimumSizeSubArraySum minimumSizeSubArraySum;

    @Test
    public void testMinimumSizeSubArraySumByBruteForce() {
        assertEquals(2, minimumSizeSubArraySum.minSubArrayLenByBruteForce(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    public void testMinimumSizeSubArraySumByBruteForce1() {
        assertEquals(1, minimumSizeSubArraySum.minSubArrayLenByBruteForce(4, new int[]{1,4,4}));
    }

    @Test
    public void testMinimumSizeSubArraySumByBruteForce2() {
        assertEquals(0, minimumSizeSubArraySum.minSubArrayLenByBruteForce(11, new int[]{1,1,1,1,1,1,1,1}));
    }

    @Test
    public void testMinimumSizeSubArraySumBySlidingWindow() {
        assertEquals(2, minimumSizeSubArraySum.minSubArrayLenBySlidingWindow(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    public void testMinimumSizeSubArraySumBySlidingWindow1() {
        assertEquals(1, minimumSizeSubArraySum.minSubArrayLenBySlidingWindow(4, new int[]{1,4,4}));
    }

    @Test
    public void testMinimumSizeSubArraySumBySlidingWindow2() {
        assertEquals(0, minimumSizeSubArraySum.minSubArrayLenBySlidingWindow(11, new int[]{1,1,1,1,1,1,1,1}));
    }
}
