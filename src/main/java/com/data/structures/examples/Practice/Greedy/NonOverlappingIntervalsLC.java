package com.data.structures.examples.Practice.Greedy;

import java.util.Arrays;

public class NonOverlappingIntervalsLC {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 1) return 0;

        int removeCounter = 0;
        int previousEnd;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        previousEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < previousEnd) {
                removeCounter++;
            } else {
                previousEnd = intervals[i][1];
            }
        }

        return removeCounter;
    }
}
