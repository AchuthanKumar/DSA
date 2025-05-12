package com.data.structures.examples.Algorithms.Arrays.TwoPointers;

import org.springframework.stereotype.Service;

@Service
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] sortedSquares = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int resultIndex = sortedSquares.length - 1;

        while (left <= right) {
            if (squareOf(nums[left]) > squareOf(nums[right])) {
                sortedSquares[resultIndex--] = squareOf(nums[left++]);
            } else {
                sortedSquares[resultIndex--] = squareOf(nums[right--]);
            }
        }

        return sortedSquares;
    }

    private int squareOf(int num) {
        return num * num;
    }
}
