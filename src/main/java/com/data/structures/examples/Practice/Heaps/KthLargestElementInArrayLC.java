package com.data.structures.examples.Practice.Heaps;

import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

@Service
public class KthLargestElementInArrayLC {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (pq.size() == k) {
                if (pq.peek() < num) {
                    pq.poll();
                    pq.offer(num);
                } else continue;
            }
        }

        return pq.peek();
    }
}
