package com.data.structures.examples.Algorithms.Arrays;

import org.springframework.stereotype.Service;

@Service
public class BestTimeToBuyAndSellStock {

    public int maxProfitBruteForceApproach(int[] prices) {
        int maxStockProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int minBuyPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int maxSellPrice = prices[j];
                if (minBuyPrice < maxSellPrice) {
                    maxStockProfit = Math.max(maxSellPrice - minBuyPrice, maxStockProfit);
                }
            }
        }

        return maxStockProfit;
    }

    public int maxProfitOnePass(int[] prices) {
        int minBuyPrice = Integer.MAX_VALUE;
        int maxStockProfit = 0;

        for (int i = 0; i < prices.length; i++) {
//            Approach 1 :
//            if (prices[i] < minBuyPrice) {
//                minBuyPrice = prices[i];
//            } else {
//                maxStockProfit = Math.max(maxStockProfit, prices[i] - minBuyPrice);
//            }
//            Approach 2 :
//            minBuyPrice = Math.min(minBuyPrice, prices[i]);
//            maxStockProfit = Math.max(maxStockProfit, prices[i] - minBuyPrice);
            //Approach 3 :
            minBuyPrice = (prices[i] < minBuyPrice) ? prices[i] : minBuyPrice;
            maxStockProfit = (maxStockProfit < prices[i] - minBuyPrice) ? prices[i] - minBuyPrice : maxStockProfit;
        }

        return maxStockProfit;
    }
}
