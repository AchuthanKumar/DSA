package com.data.structures.examples.DataStructures.Arrays.PrefixSum;

import org.springframework.stereotype.Service;

@Service
public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] runningSumResults = new int[nums.length];

        int runningSum = nums[0];
        runningSumResults[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSumResults[i] = nums[i] + runningSum;
            runningSum += nums[i];
        }

        return runningSumResults;
    }
}
