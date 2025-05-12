package com.data.structures.examples.DataStructures.PrefixSum;

import com.data.structures.examples.DataStructures.Arrays.PrefixSum.RunningSumOf1DArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RunningSumOf1DArrayTest {

    @Autowired
    private RunningSumOf1DArray runningSumOf1DArray;

    @Test
    public void testRunningSumOf1DArray() {
        System.out.println(Arrays.toString(runningSumOf1DArray.runningSum(new int[]{1, 2, 3, 4})));
        assertEquals(Arrays.toString(new int[]{1, 3, 6, 10}), Arrays.toString(runningSumOf1DArray.runningSum(new int[]{1, 2, 3, 4})));
    }

    @Test
    public void testRunningSumOf1DArray1() {
        System.out.println(Arrays.toString(runningSumOf1DArray.runningSum(new int[]{1, 1, 1, 1, 1})));
        assertEquals(Arrays.toString(new int[]{1,2,3,4,5}), Arrays.toString(runningSumOf1DArray.runningSum(new int[]{1, 1, 1, 1, 1})));
    }

    @Test
    public void testRunningSumOf1DArray2() {
        System.out.println(Arrays.toString(runningSumOf1DArray.runningSum(new int[]{3, 1, 2, 10, 1})));
        assertEquals(Arrays.toString(new int[]{3,4,6,16,17}), Arrays.toString(runningSumOf1DArray.runningSum(new int[]{3, 1, 2, 10, 1})));
    }
}
