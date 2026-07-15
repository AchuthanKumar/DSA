package com.data.structures.examples.Practice.Heaps;

import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

@Service
public class KthLargestElementInStream {

    PriorityQueue<Integer> pq;
    int size;

    public void KthLargest(int k, int[] nums) {
        size = k;
        pq = new PriorityQueue<>(size);
        for (int num : nums)
            add(num);
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > size) pq.poll();
        return pq.peek();
    }

}
