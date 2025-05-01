package com.data.structures.examples.DataStructures;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TwoSumLeetCode {

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public int[] twoSumOptimized(int[] nums, int target) {

        HashMap<Integer, Integer> sumOperands = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (sumOperands.containsKey(complement)) {
                return new int[]{sumOperands.get(complement), i};
            }

            sumOperands.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
