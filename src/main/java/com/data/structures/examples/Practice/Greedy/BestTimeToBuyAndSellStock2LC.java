package com.data.structures.examples.Practice.Greedy;

import org.springframework.stereotype.Service;

@Service
public class BestTimeToBuyAndSellStock2LC {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]) {
                maxProfit += prices[i]-prices[i-1];
            }
        }

        return maxProfit;
    }
}
