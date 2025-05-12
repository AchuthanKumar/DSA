package com.data.structures.examples.DataStructures.Arrays.SlidingWindow.VariableSize;

import org.springframework.stereotype.Service;

@Service
public class MinimumSizeSubArraySum {

    //Below Code has the time complexity of O(N^2)
    public int minSubArrayLenByBruteForce(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;

        for (int left = 0; left < nums.length; left++) {
            int sum = 0;
            for (int right = left; right < nums.length; right++) {
                sum += nums[right];

                if (sum >= target) {
                    minLen = Math.min(minLen, right - left + 1);
                    break;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

//    Below Code has time complexity of O(N)
    public int minSubArrayLenBySlidingWindow(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int windowSum = 0;

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];

            while (windowSum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                windowSum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    //The code with time complexity of O(NLogN) is possible
//    Revisit the code and write fastest version
}
