package com.data.structures.examples.Practice.Arrays.Hashing;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TwoSumLC {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }

            complementMap.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
