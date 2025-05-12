package com.data.structures.examples.Algorithms.Arrays.TwoPointers;

import org.springframework.stereotype.Service;

@Service
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicatesByBruteForce(int[] nums) {
        int k = nums.length;

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; ) {
                if (nums[i] == nums[j]) {
                    for (int l = j; l < k - 1; l++) {
                        nums[l] = nums[l + 1];
                    }

                    k--;
                } else {
                    j++; // Recheck and increment the pointer
                }
            }
        }

        return k;
    }


    public int removeDuplicatesByTwoPointers(int[] nums) {
        int k = 0;
        int i = 0;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }

        k = i + 1;

        return k;
    }
}
