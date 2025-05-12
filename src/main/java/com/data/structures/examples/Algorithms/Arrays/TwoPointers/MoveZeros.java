package com.data.structures.examples.Algorithms.Arrays.TwoPointers;

import org.springframework.stereotype.Service;

@Service
public class MoveZeros {
    public int[] moveZeroes(int[] nums) {

        int left = 0;

//        Approach 1 :
//        int right = nums.length > 1 ? left + 1 : left;
//
//        while (left < right && left < nums.length && right < nums.length) {
//            if (nums[left] != 0) {
//                left++;
//                right = left + 1;
//            } else if (nums[right] == 0) {
//                right++;
//            } else {
//                nums[left] = nums[right];
//                nums[right] = 0;
//            }
//        }

//        Approach 2:
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left++] = nums[right];
            }
        }

        for (; left < nums.length; left++) {
            nums[left] = 0;
        }

        return nums;
    }
}
