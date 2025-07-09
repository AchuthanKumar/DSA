package com.data.structures.examples.Algorithms.DynamicProgramming;

import com.data.structures.examples.Algorithms.DynamicProgramming.RecursionOrMemoization.ClimbingStairs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ClimbingStairsTest {
    @Autowired
    ClimbingStairs climbingStairs;

    @Test
    public void testClimbingStairPossibleWays(){
        assertEquals(2,climbingStairs.climbStairs(2));
    }

    @Test
    public void testClimbingStairPossibleWays1(){
        assertEquals(3,climbingStairs.climbStairs(3));
    }
}
