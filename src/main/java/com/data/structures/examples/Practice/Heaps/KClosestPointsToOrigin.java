package com.data.structures.examples.Practice.Heaps;

import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

@Service
public class KClosestPointsToOrigin {

    public int[][] kClosestPoints(int[][] points, int k) {
        PriorityQueue<int[]> distanceIndex = new PriorityQueue<>(k, ((a, b) -> b[0] - a[0]));
        int[][] result = new int[k][];

        for (int[] poistion : points) {
            int distanceFromOrigin = (poistion[0] * poistion[0]) + (poistion[1] * poistion[1]);

            if (distanceIndex.size() < k) {
                distanceIndex.offer(new int[]{distanceFromOrigin, poistion[0], poistion[1]});
            } else if (distanceIndex.size() == k) {
                if (distanceFromOrigin < distanceIndex.peek()[0]) {
                    distanceIndex.poll();
                    distanceIndex.offer(new int[]{distanceFromOrigin, poistion[0], poistion[1]});
                } else continue;
            }
        }

        int i = 0;
        while (!distanceIndex.isEmpty()) {
            int[] distIndexVals = distanceIndex.poll();
            result[i] = new int[]{distIndexVals[1], distIndexVals[2]};
            i++;
        }

        return result;
    }

}
