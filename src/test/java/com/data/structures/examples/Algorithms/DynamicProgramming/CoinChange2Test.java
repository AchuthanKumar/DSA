package com.data.structures.examples.Algorithms.DynamicProgramming;

import com.data.structures.examples.Algorithms.DynamicProgramming.CoinChange.CoinChange2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CoinChange2Test {
    @Autowired
    CoinChange2 coinChange2;

    @Test
    public void testCoinChangeII() {
        assertEquals(4,coinChange2.change(4,new int[]{1,2,4}));
    }

    @Test
    public void testCoinChangeII1() {
        assertEquals(0,coinChange2.change(3,new int[]{2}));
    }

    @Test
    public void testCoinChangeII2() {
        assertEquals(1,coinChange2.change(10,new int[]{10}));
    }
}
