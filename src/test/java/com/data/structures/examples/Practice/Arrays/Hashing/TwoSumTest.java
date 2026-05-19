package com.data.structures.examples.Practice.Arrays.Hashing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class TwoSumTest {

    @Autowired
    public TwoSumLC twoSumLC;

    @Test
    public void twoSumTestCase1() {
        int[] results = twoSumLC.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(results));
        assertArrayEquals(new int[]{0, 1}, results);
    }

    @Test
    public void twoSumTestCase2() {
        int[] results = twoSumLC.twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(results));
        assertArrayEquals(new int[]{1, 2}, results);
    }

    @Test
    public void twoSumTestCase3() {
        int[] results = twoSumLC.twoSum(new int[]{3,3}, 6);
        System.out.println(Arrays.toString(results));
        assertArrayEquals(new int[]{0, 1}, results);
    }
}
