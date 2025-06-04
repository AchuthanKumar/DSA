package com.data.structures.examples.Algorithms.Heaps;

import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

@Service
public class KClosestPoint2Origin {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];

        PriorityQueue<int[]> closestCoOrdinates = new PriorityQueue<>((p1, p2) -> {
            int dist1 = p1[0] * p1[0] + p1[1] * p1[1];
            int dist2 = p2[0] * p2[0] + p2[1] * p2[1];

            // Highest Priority means top of the heap or left-most element of queue.

            //If the below code returns :
            // Negative - i.e. dist2 < dist1 then p1 has higher priority
            // Positive - i.e. dist2 > dist1 then p2 has higher priority
            // Zero - Will be placed in random order Or Order does not matter
            return dist2 - dist1;
        });

        for (int[] coOrds : points) {
            closestCoOrdinates.offer(coOrds);

            if (closestCoOrdinates.size() > k)
                closestCoOrdinates.poll();
        }

        int i = 0;
        while (!closestCoOrdinates.isEmpty()) {
            int[] closestCoOrds = closestCoOrdinates.poll();
            result[i++] = closestCoOrds;
        }

        return result;
    }
}
