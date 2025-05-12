package com.data.structures.examples.DataStructures.Arrays.TwoPointers;

import org.springframework.stereotype.Service;

@Service
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

//        if (left == right && nums[left] != val) {
//            left++;
//        }

        while (left <= right) {
            if (nums[left] != val) {
                left++;
            } else if (nums[right] == val) {
                right--;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        return left;
    }
}
