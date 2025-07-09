package com.data.structures.examples.Algorithms.DynamicProgramming.OneDimensional;

import org.springframework.stereotype.Service;

@Service
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0, subsetSum = 0;

        for (int num : nums) sum += num;

        if (sum == 0 || sum % 2 != 0) return false;

        subsetSum = sum / 2;
        return canFindSubsets(nums, subsetSum);
    }

    private boolean canFindSubsets(int[] nums, int sum) {
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int i = sum; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[sum];
    }

    // The below code fails for large inputs as it causes integer overflow
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
