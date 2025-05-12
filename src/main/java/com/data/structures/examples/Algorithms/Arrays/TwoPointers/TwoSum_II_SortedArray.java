package com.data.structures.examples.Algorithms.Arrays.TwoPointers;

import org.springframework.stereotype.Service;

@Service
public class TwoSum_II_SortedArray {
    public int[] twoSumByBruteForce(int[] numbers, int target) {
        int[] sumIndex = new int[2];

        for (int i = 0; i < numbers.length && numbers[i] <= target; i++) {
            int complement = target - numbers[i];
            for (int j = i + 1; j < numbers.length && numbers[j] <= complement; j++) {
                if (numbers[i] + numbers[j] == target) {
                    sumIndex = new int[]{i + 1, j + 1};
                }
            }
        }

        return sumIndex;
    }

    public int[] twoSumByTwoPointers(int[] numbers, int target) {
        int[] sumIndex = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                sumIndex = new int[]{left + 1, right + 1};
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return sumIndex;
    }
}
