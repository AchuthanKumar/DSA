package com.data.structures.examples.Practice.Heaps;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopKFrequentElementsLC {

    public int[] topKFrequent(int[] nums, int k) {
//       Priority Queues are Min Heap by default. Reverse the order to make it Max Heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int[] results = new int[k];

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int key : freqMap.keySet()) {
            pq.offer(new int[]{key, freqMap.get(key)});
        }

        for (int i = 0; i < k; i++) {
            results[i] = pq.poll()[0];
        }

        return results;
    }

    public int[] topKFrequentMinHeap(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int[] results = new int[k];

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int key : freqMap.keySet()) {
            if (pq.size() < k) {
                pq.offer(new int[]{key, freqMap.get(key)});
            } else if (pq.size() == k) {
                if (pq.peek()[1] < freqMap.get(key)) {
                    pq.poll();
                    pq.offer(new int[]{key, freqMap.get(key)});
                } else continue;
            }
        }

        for (int i = k - 1; i >= 0; i--) {
            results[i] = pq.poll()[0];
        }

        return results;
    }
}
