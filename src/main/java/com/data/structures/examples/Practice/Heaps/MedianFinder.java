package com.data.structures.examples.Practice.Heaps;

import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

//Find Median From Data Stream LC

@Service
public class MedianFinder {
    //    As it should be a ordered list, I use PQ/Heap
    PriorityQueue<Integer> leftHeap;
    PriorityQueue<Integer> rightHeap;


    public MedianFinder() {
        leftHeap = new PriorityQueue<>((a, b) -> b - a);
        rightHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        leftHeap.offer(num);
        rightHeap.offer(leftHeap.poll());
        if (rightHeap.size() > leftHeap.size()) {
            leftHeap.offer(rightHeap.poll());
        }
    }

    public double findMedian() {
        if(leftHeap.size()>rightHeap.size()){
            return leftHeap.peek();
        }else {
            int leftMax = leftHeap.peek();
            int rightMin = rightHeap.peek();
            return (double) (leftMax + rightMin) /2;
        }
    }
}
