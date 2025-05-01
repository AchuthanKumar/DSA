package com.data.structures.examples.DataStructures;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BestTimeToBuyAndSellStockTest {

    @Autowired
    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @Test
    public void bestTimeToBuyAndSellStockBruteForceVsOnePass() {
        System.out.println(bestTimeToBuyAndSellStock.maxProfitBruteForceApproach(new int[]{1, 2, 3, 4, 5}));
        System.out.println(bestTimeToBuyAndSellStock.maxProfitOnePass(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void bestTimeToBuyAndSellStockBruteForceVsOnePass2() {
        System.out.println(bestTimeToBuyAndSellStock.maxProfitBruteForceApproach(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(bestTimeToBuyAndSellStock.maxProfitOnePass(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void bestTimeToBuyAndSellStockBruteForceVsOnePass3() {
        System.out.println(bestTimeToBuyAndSellStock.maxProfitBruteForceApproach(new int[]{5, 4, 3, 2, 1}));
        System.out.println(bestTimeToBuyAndSellStock.maxProfitOnePass(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void bestTimeToBuyAndSellStockBruteForceVsOnePass4() {
        System.out.println(bestTimeToBuyAndSellStock.maxProfitBruteForceApproach(new int[]{1}));
        System.out.println(bestTimeToBuyAndSellStock.maxProfitOnePass(new int[]{1}));
    }

    @Test
    public void bestTimeToBuyAndSellStockBruteForceVsOnePass5() {
        System.out.println(bestTimeToBuyAndSellStock.maxProfitBruteForceApproach(new int[]{3, 2, 6, 1, 8, 4, 9}));
        System.out.println(bestTimeToBuyAndSellStock.maxProfitOnePass(new int[]{3, 2, 6, 1, 8, 4, 9}));
    }

    @Test
    public void bestTimeToBuyAndSellStockBruteForceVsOnePass6() {
        System.out.println(bestTimeToBuyAndSellStock.maxProfitBruteForceApproach(new int[]{1, 1000, 500, 2000, 300}));
        System.out.println(bestTimeToBuyAndSellStock.maxProfitOnePass(new int[]{1, 1000, 500, 2000, 300}));
    }
}
