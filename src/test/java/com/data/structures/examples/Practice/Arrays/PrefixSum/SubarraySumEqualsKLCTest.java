package com.data.structures.examples.Practice.Arrays.PrefixSum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SubarraySumEqualsKLCTest {

    @Autowired
    SubarraySumEqualsKLC subarraySumEqualsK;

    @Test
    public void testSubarraySumEqualsKCase1() {
        int result = subarraySumEqualsK.subarraySum(new int[]{1, 1, 1}, 2);
        System.out.println(result);
        assertEquals(2, result);
    }

    @Test
    public void testSubarraySumEqualsKCase2() {
        int result = subarraySumEqualsK.subarraySum(new int[]{1, 2, 3}, 3);
        System.out.println(result);
        assertEquals(2, result);
    }
}
