package com.data.structures.examples.Algorithms.Arrays.Hashing;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freqList = new List[nums.length + 1];

        for (int keyVal : map.keySet()) {
            int frequency = map.get(keyVal);
            if (freqList[frequency] == null) {
                freqList[frequency] = new ArrayList<>();
            }

            freqList[frequency].add(keyVal);
        }

        for (int i = freqList.length - 1, index = 0; i >= 0 && index < k; i--) {
            if (freqList[i] != null) {
                for (int value : freqList[i]) {
                    result[index++] = value;
                    if (index == k) break;
                }
            }
        }

        return result;
    }
}
