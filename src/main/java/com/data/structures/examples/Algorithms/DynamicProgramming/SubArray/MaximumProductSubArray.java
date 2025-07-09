package com.data.structures.examples.Algorithms.DynamicProgramming.SubArray;

import org.springframework.stereotype.Service;

@Service
public class MaximumProductSubArray {
//    Improvisation of Kadane’s Algorithm
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(num, num * maxEndingHere);
            minEndingHere = Math.min(num, num * minEndingHere);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }


        return maxSoFar;
    }
}
