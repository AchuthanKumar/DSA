package com.data.structures.examples.Practice.Arrays.Kadane;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MaximumSubArrayLCTest {

    @Autowired
    MaximumSubArrayLC maximumSubArray;

    @Test
    public void testMaximumSubArrayCase1(){
        int result = maximumSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        System.out.println("Result : " + result);
        assertEquals(6,result);
    }

    @Test
    public void testMaximumSubArrayCase2(){
        int result = maximumSubArray.maxSubArray(new int[] {1});
        System.out.println("Result : " + result);
        assertEquals(1,result);
    }

    @Test
    public void testMaximumSubArrayCase3(){
        int result = maximumSubArray.maxSubArray(new int[] {5,4,-1,7,8});
        System.out.println("Result : " + result);
        assertEquals(23,result);
    }

    @Test
    public void testMaximumSubArrayCase4(){
        int result = maximumSubArray.maxSubArray(new int[] {-1,-2,-3});
        System.out.println("Result : " + result);
        assertEquals(-1,result);
    }

    @Test
    public void testMaximumSubArrayCase5(){
        int result = maximumSubArray.maxSubArray(new int[] {-2,-1,-3});
        System.out.println("Result : " + result);
        assertEquals(-1,result);
    }
}
