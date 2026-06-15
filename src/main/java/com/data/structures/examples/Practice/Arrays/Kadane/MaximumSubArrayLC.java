package com.data.structures.examples.Practice.Arrays.Kadane;

import org.springframework.stereotype.Service;

@Service
public class MaximumSubArrayLC {

    public int maxSubArray(int[] nums) {
        int currSum = nums[0], maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
