package com.data.structures.examples.Practice.Arrays;

import org.springframework.stereotype.Service;

@Service
public class BestTimeToBuyAndSellStockLC {

    public int getMaxProfit(int[] prices) {
        int maxProfit = 0;
        int leastBuyPrice = prices[0];

        for (int currPrice : prices) {
            leastBuyPrice = Math.min(leastBuyPrice, currPrice);
            maxProfit = Math.max(maxProfit, currPrice - leastBuyPrice);
        }

        return maxProfit;
    }
}
