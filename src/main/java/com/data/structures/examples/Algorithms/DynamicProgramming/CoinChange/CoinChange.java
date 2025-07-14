package com.data.structures.examples.Algorithms.DynamicProgramming.CoinChange;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount * 3); // Random infinity value

        dp[0] = 0;

//        for (int i = 1; i <= amount; i++) {
//            for (int coin : coins) {
//                if (i >= coin)
//                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
//            }
//        }

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
