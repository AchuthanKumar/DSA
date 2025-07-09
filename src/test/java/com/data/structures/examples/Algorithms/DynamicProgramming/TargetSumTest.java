package com.data.structures.examples.Algorithms.DynamicProgramming;

import com.data.structures.examples.Algorithms.DynamicProgramming.OneDimensional.TargetSum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class TargetSumTest {
    @Autowired
    TargetSum targetSum;

    @Test
    public void testTargetSum() {
        assertEquals(5,targetSum.findTargetSumWays(new int[]{1,1,1,1,1},3));
    }

    @Test
    public void testTargetSum1() {
        assertEquals(1,targetSum.findTargetSumWays(new int[]{1},1));
    }
}
