package com.data.structures.examples.Practice.Arrays.PrefixSum;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SubarraySumEqualsKLC {

    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0, count = 0;
        HashMap<Integer, Integer> pSumFqMap = new HashMap<>();
        pSumFqMap.put(prefixSum, pSumFqMap.getOrDefault(prefixSum, 0) + 1);

        for (int num : nums) {
            prefixSum += num;
            int compVal = prefixSum - k;

            if (pSumFqMap.containsKey(compVal)) {
                count += pSumFqMap.get(compVal);
            }

            pSumFqMap.put(prefixSum, pSumFqMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
