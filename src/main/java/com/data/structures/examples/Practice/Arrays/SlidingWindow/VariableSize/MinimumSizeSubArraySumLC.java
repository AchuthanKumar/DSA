package com.data.structures.examples.Practice.Arrays.SlidingWindow.VariableSize;

import org.springframework.stereotype.Service;

@Service
public class MinimumSizeSubArraySumLC {

    public int minSubArrayLen(int target, int[] nums) {
        int minWindowLen = Integer.MAX_VALUE;
        int left = 0, right = 0;
        int windowLen = 0;
        int subArrSum = 0;

        for (; right < nums.length && left <= right; right++) {
            subArrSum += nums[right];
            windowLen++;

            while (subArrSum >= target) {
                minWindowLen = Math.min(minWindowLen, windowLen);
                subArrSum -= nums[left];
                left++;
                windowLen--;
            }
        }

        return minWindowLen == Integer.MAX_VALUE? 0 : minWindowLen;
    }
}
