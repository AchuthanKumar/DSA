package com.data.structures.examples.Algorithms.BinarySearch.Advanced;

import org.springframework.stereotype.Service;

@Service
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0, mid = -1, right = nums.length - 1;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
