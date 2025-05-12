package com.data.structures.examples.Algorithms.Arrays.SlidingWindow.FixedSize;

import org.springframework.stereotype.Service;

@Service
public class MaximumAverageSubArray {

//    The following code has time complexity of O(N)
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;
        long windowSum = 0;
        int left = 0;

        for (int right = 0; right < k; right++) {
            windowSum += nums[right];
        }

        maxSum = windowSum;

        for (int right = k; right < nums.length; right++) {
            windowSum += nums[right];
            windowSum -= nums[left++];

            if (windowSum > maxSum) maxSum = windowSum;
        }

        return maxSum / k;
    }
}
