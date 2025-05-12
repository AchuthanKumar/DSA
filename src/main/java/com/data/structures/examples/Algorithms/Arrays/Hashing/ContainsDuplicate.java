package com.data.structures.examples.Algorithms.Arrays.Hashing;

import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class ContainsDuplicate {
    public boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicateOnePass(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqueNums.contains(nums[i])) {
                return true;
            }
            uniqueNums.add(nums[i]);
        }
        return false;
    }

    public boolean containsDuplicateOnePassOptimized(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return false;
        }
        HashSet<Integer> uniqueNums = new HashSet<Integer>();
        for (int num : nums) {
            if (!uniqueNums.add(num)) {
                return true;
            }
        }
        return false;
    }
}
