package com.data.structures.examples.DataStructures.Arrays.PrefixSum;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SubArraySumEqualsK {

//      The below attempt fails as it failed to consider all the occurrence of sub array
//    Considering the input [1,-1,0], the following code identifies [1,-1] & [0], and misses out [1,-1,0].
//        public int subarraySum(int[] nums, int k) {
//        int subArrayCount = 0;
//        int runningSum = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == k || runningSum + nums[i] == k) {
//                subArrayCount++;
//                runningSum = nums[i];
//            } else {
//                runningSum += nums[i];
//            }
//        }
//
//        return subArrayCount;
//    }

    //Lesson learnt and updated the Brute Force approach
    public int subarraySum(int[] nums, int k) {
        int subArrayCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    subArrayCount++;
                }
            }
        }

        return subArrayCount;
    }

    //    Reduces Time Complexity to O(N)
    public int subarraySumByPrefixSumAndMap(int[] nums, int k) {
        int subArrayCount = 0;
        int runningSum = 0;
        HashMap<Integer, Integer> runningSumCount = new HashMap<>();
        runningSumCount.put(0, 1);

        for (int num : nums) {
            runningSum += num;

//            Calculate differences :
//            a + b = target = > a - target = b
//            runningSum + nums[i] (Possible/Expected Value in nums) = k => runningSum - k = nums[i] (Possible/Expected Value in nums)
            if (runningSumCount.containsKey(runningSum - k)) {
                subArrayCount += runningSumCount.get(runningSum - k);
            }

            runningSumCount.put(runningSum, runningSumCount.getOrDefault(runningSum, 0) + 1);
        }

        return subArrayCount;
    }
}
