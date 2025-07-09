package com.data.structures.examples.Algorithms.DynamicProgramming;

import com.data.structures.examples.Algorithms.DynamicProgramming.SubArray.MaximumProductSubArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class MaximumProductSubArrayTest {
    @Autowired
    MaximumProductSubArray maximumProductSubArray;

    @Test
    public void testMaximumProductSubArray() {
        assertEquals(6, maximumProductSubArray.maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    public void testMaximumProductSubArray1() {
        assertEquals(0, maximumProductSubArray.maxProduct(new int[]{-2,0,-1}));
    }

    @Test
    public void testMaximumProductSubArray2() {
        assertEquals(24, maximumProductSubArray.maxProduct(new int[]{-2,3,-4}));
    }
}
