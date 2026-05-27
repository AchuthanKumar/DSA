package com.data.structures.examples.Practice.Arrays.SlidingWIndow.VariableSize;

import com.data.structures.examples.Practice.Arrays.SlidingWindow.VariableSize.MinimumSizeSubArraySumLC;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MinimumSizeSubArraySumLCTest {
    @Autowired
    MinimumSizeSubArraySumLC minSizeSubArraySum;

    @Test
    public void testMinimumSizeSubArraySumCase1(){
        int result = minSizeSubArraySum.minSubArrayLen(7, new int[] {2,3,1,2,4,3});
        System.out.println(result);
        assertEquals(2,result);
    }

    @Test
    public void testMinimumSizeSubArraySumCase2(){
        int result = minSizeSubArraySum.minSubArrayLen(4, new int[] {1,4,4});
        System.out.println(result);
        assertEquals(1,result);
    }

    @Test
    public void testMinimumSizeSubArraySumCase3(){
        int result = minSizeSubArraySum.minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1});
        System.out.println(result);
        assertEquals(0,result);
    }
}
