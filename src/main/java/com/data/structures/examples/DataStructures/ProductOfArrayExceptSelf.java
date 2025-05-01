package com.data.structures.examples.DataStructures;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ProductOfArrayExceptSelf {

    //Following code has time complexity of O(N^2)
    public int[] productExceptSelfBruteForce(int[] nums) {
        if (nums.length < 2 || nums.length > 105) {
            return new int[0];
        }

        int[] resultArray = new int[nums.length];

        Arrays.fill(resultArray, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j)
                    resultArray[i] *= nums[j];
            }
        }

        return resultArray;
    }

    //    Prefix and Suffix Product Approach for O(N) Time Complexity with Space O(N)
    public int[] productExceptSelfPrefixSuffixProductApproach(int[] nums) {
        int[] resultArray = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            resultArray[i] = prefix[i] * suffix[i];
        }

        return resultArray;
    }

    public int[] productExceptSelfOptimizedPSPApproach(int[] nums) {
        int[] resultArray = new int[nums.length];

        resultArray[0] = 1;
        //Calculate product of prefix and store in results
        for (int i = 1; i < nums.length; i++) {
            resultArray[i] = resultArray[i - 1] * nums[i - 1];
        }

        //Calculate suffix product and store in results
        int suffixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            resultArray[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return resultArray;
    }
}
