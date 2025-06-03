package com.data.structures.examples.Algorithms.Heaps;

import com.data.structures.examples.DataStructures.Heaps.MinHeap;
import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

@Service
public class KthLargestElementInArray {
    //Both PQ and Heap can be use

    public int findKthLargest(int[] nums, int k) {
        MinHeap heap = new MinHeap(k + 1);

        for (int val : nums) {
            heap.insert(val);

            if (heap.size > k) {
                heap.deleteMin();
            }
        }

        return heap.getMin();
    }

    public int findKthLargestPq(int[] nums, int k) {
        if (nums == null || nums.length == 0) return -1;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int val : nums) {
            minHeap.offer(val);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}
