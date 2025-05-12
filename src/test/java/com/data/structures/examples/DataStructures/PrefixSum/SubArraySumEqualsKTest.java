package com.data.structures.examples.DataStructures.PrefixSum;

import com.data.structures.examples.DataStructures.Arrays.PrefixSum.SubArraySumEqualsK;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SubArraySumEqualsKTest {
    @Autowired
    private SubArraySumEqualsK subArraySumEqualsK;

    @Test
    public void testSubArraySumEqualsK() {
        assertEquals(2,subArraySumEqualsK.subarraySum(new int[]{1,1,1}, 2));
    }

    @Test
    public void testSubArraySumEqualsK1() {
        assertEquals(2, subArraySumEqualsK.subarraySum(new int[]{1, 1, 1}, 2));
        // Subarrays: [1,1] (indices 0-1), [1,1] (indices 1-2)
    }

    @Test
    public void testSubArraySumEqualsK2() {
        assertEquals(3, subArraySumEqualsK.subarraySum(new int[]{1, -1, 0}, 0));
        // Subarrays: [1,-1] (indices 0-1), [1,-1,0] (indices 0-2), [0] (index 2)
    }

    @Test
    public void testSubArraySumEqualsK3() {
        assertEquals(5, subArraySumEqualsK.subarraySum(new int[]{1, 2, 3, -3, 3}, 3));
        // Subarrays: [1,2] (indices 0-1), [3] (index 2), [3] (index 4), [-3,3] (indices 3-4)
    }

    @Test
    public void testSubArraySumEqualsK4() {
        assertEquals(1, subArraySumEqualsK.subarraySum(new int[]{5}, 5));
        // Subarray: [5] (index 0)
    }

    @Test
    public void testSubArraySumEqualsK5() {
        assertEquals(0, subArraySumEqualsK.subarraySum(new int[]{1, 2, 3}, 10));
        // No subarray sums to 10
    }

    @Test
    public void testSubArraySumEqualsK6() {
        assertEquals(0, subArraySumEqualsK.subarraySum(new int[]{}, 0));
        // Empty array, no subarrays possible
    }

    @Test
    public void testSubArraySumEqualsK7() {
        assertEquals(6, subArraySumEqualsK.subarraySum(new int[]{0, 0, 0}, 0));
        // Subarrays: [0] (index 0), [0,0] (indices 0-1), [0,0,0] (indices 0-2)
    }

    @Test
    public void testSubArraySumEqualsK8() {
        assertEquals(2, subArraySumEqualsK.subarraySum(new int[]{-1, -1, 1, 1}, 0));
        // Subarrays: [-1,-1,1,1] (indices 0-3), [-1,1] (indices 2-3)
    }

    @Test
    public void testSubArraySumEqualsK9() {
        assertEquals(2,subArraySumEqualsK.subarraySum(new int[]{1,2,3}, 3));
    }

    @Test
    public void testSubArraySumEqualsK10() {
        assertEquals(3,subArraySumEqualsK.subarraySum(new int[]{1,-1,0}, 0));
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap() {
        assertEquals(2,subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{1,1,1}, 2));
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap1() {
        assertEquals(2, subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{1, 1, 1}, 2));
        // Subarrays: [1,1] (indices 0-1), [1,1] (indices 1-2)
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap2() {
        assertEquals(3, subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{1, -1, 0}, 0));
        // Subarrays: [1,-1] (indices 0-1), [1,-1,0] (indices 0-2), [0] (index 2)
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap3() {
        assertEquals(5, subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{1, 2, 3, -3, 3}, 3));
        // Subarrays: [1,2] (indices 0-1), [3] (index 2), [3] (index 4), [-3,3] (indices 3-4)
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap4() {
        assertEquals(1, subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{5}, 5));
        // Subarray: [5] (index 0)
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap5() {
        assertEquals(0, subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{1, 2, 3}, 10));
        // No subarray sums to 10
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap6() {
        assertEquals(0, subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{}, 0));
        // Empty array, no subarrays possible
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap7() {
        assertEquals(6, subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{0, 0, 0}, 0));
        // Subarrays: [0] (index 0), [0,0] (indices 0-1), [0,0,0] (indices 0-2)
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap8() {
        assertEquals(2, subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{-1, -1, 1, 1}, 0));
        // Subarrays: [-1,-1,1,1] (indices 0-3), [-1,1] (indices 2-3)
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap9() {
        assertEquals(2,subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{1,2,3}, 3));
    }

    @Test
    public void testSubArraySumEqualsKByPrefixAndMap10() {
        assertEquals(3,subArraySumEqualsK.subarraySumByPrefixSumAndMap(new int[]{1,-1,0}, 0));
    }
}
