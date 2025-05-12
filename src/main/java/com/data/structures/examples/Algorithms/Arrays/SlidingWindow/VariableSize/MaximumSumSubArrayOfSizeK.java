package com.data.structures.examples.Algorithms.Arrays.SlidingWindow.VariableSize;

import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class MaximumSumSubArrayOfSizeK {

    //The following code take more time
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        HashSet<Integer> set = new HashSet<>();
        long windowSum = 0;

        if (nums.length == k) {
            for (int i = 0; i < nums.length; i++) {
                if (!set.contains(nums[i])) {
                    set.add(nums[i]);
                    windowSum += nums[i];
                } else {
                    windowSum = 0;
                    break;
                }
            }
            maxSum = Math.max(maxSum, windowSum);
        } else {
            for (int i = 0; i <= nums.length - k; i++) {
                set = new HashSet<>();
                windowSum = 0;
                for (int j = i; j < i + k; j++) {
                    if (!set.contains(nums[j])) {
                        set.add(nums[j]);
                        windowSum += nums[j];
                    } else {
                        windowSum = 0;
                        break;
                    }
                }
                maxSum = Math.max(maxSum, windowSum);
            }
        }


        return maxSum;
    }

    //Fixed Size Sliding window (Needs Update)
    public long maximumSubarraySumByFixedSizeSlidingWindow(int[] nums, int k) {
        long maxSum = 0;
        long windowSum = 0;
        HashSet<Integer> windowValues = new HashSet<>();
        int left = 0;

        for (int i = 0; i < k; i++) {
            windowValues.add(nums[i]);
            windowSum += nums[i];
        }

        if (windowValues.size() == k) {
            maxSum = windowSum;
        }

        for (int right = k; right < nums.length; right++) {
            windowSum -= nums[left];
            windowValues.remove(nums[left++]);

            windowValues.add(nums[right]);
            windowSum += nums[right];

            if (windowValues.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }

    //Sliding Window (Variable) + HashSet Approach
    public long maximumSubarraySumBySlidingWindow(int[] nums, int k) {
        long maxSum = 0;
        long windowSum = 0;
        HashSet<Integer> windowValues = new HashSet<>(k);
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            while (windowValues.contains(nums[right])) {
                windowValues.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            windowValues.add(nums[right]);
            windowSum += nums[right];

            if (right - left + 1 == k) {
                if (windowValues.size() == k)
                    maxSum = Math.max(maxSum, windowSum);

                windowValues.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }

}
