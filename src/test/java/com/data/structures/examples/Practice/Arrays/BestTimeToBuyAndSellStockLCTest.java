package com.data.structures.examples.Practice.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BestTimeToBuyAndSellStockLCTest {
    @Autowired
    BestTimeToBuyAndSellStockLC bestTimeToBuyAndSellStockLC;

    @Test
    public void testBestTimeToBuyAndSellStockCase1(){
        int result = bestTimeToBuyAndSellStockLC.getMaxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(result);
        assertEquals(5,result);
    }

    @Test
    public void testBestTimeToBuyAndSellStockCase2(){
        int result = bestTimeToBuyAndSellStockLC.getMaxProfit(new int[]{7,6,4,3,1});
        System.out.println(result);
        assertEquals(0,result);
    }
}
