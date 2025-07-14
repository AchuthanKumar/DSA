package com.data.structures.examples.Algorithms.DynamicProgramming;

import com.data.structures.examples.Algorithms.DynamicProgramming.CoinChange.CoinChange;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CoinChangeTest {
    @Autowired
    CoinChange coinChange;

    @Test
    public void testCoinChange() {
        assertEquals(3, coinChange.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void testCoinChange1() {
        assertEquals(-1, coinChange.coinChange(new int[]{2}, 3));
    }

    @Test
    public void testCoinChange2() {
        assertEquals(0, coinChange.coinChange(new int[]{1}, 0));
    }
}
