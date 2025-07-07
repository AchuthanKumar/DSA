package com.data.structures.examples.Algorithms.DynamicProgramming;

import org.springframework.stereotype.Service;

@Service
public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;

        for (int num : nums)
            sum += num;

        if (-1 * target > sum || target > sum || ((target + sum) % 2 != 0)) return 0;

        int subsetSum = (target + sum) / 2;
        return countSubsets(nums, subsetSum);
    }

    private int countSubsets(int[] nums, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int i = sum; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }

        return dp[sum];
    }
}
