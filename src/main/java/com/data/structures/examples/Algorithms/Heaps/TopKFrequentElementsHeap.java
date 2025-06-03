package com.data.structures.examples.Algorithms.Heaps;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@Service
public class TopKFrequentElementsHeap {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        HashMap<Integer, Integer> val2FreqMap = new HashMap<>();

        for (int val : nums) {
            val2FreqMap.put(val, val2FreqMap.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparing(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : val2FreqMap.entrySet()) {
            minHeap.offer(entry);

            if (minHeap.size() > k)
                minHeap.poll();
        }

        int i = k - 1;
        while (!minHeap.isEmpty()) {
            result[i--] = minHeap.poll().getKey();
        }

        return result;
    }
}
