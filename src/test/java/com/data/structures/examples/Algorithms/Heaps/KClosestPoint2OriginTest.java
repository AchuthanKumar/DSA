package com.data.structures.examples.Algorithms.Heaps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class KClosestPoint2OriginTest {
    @Autowired
    KClosestPoint2Origin kClosestPoint2Origin;

    // Helper to sort and compare 2D arrays ignoring order
    private void assert2DArrayEqualsIgnoreOrder(int[][] expected, int[][] actual) {
        Comparator<int[]> comp = Comparator.comparingInt((int[] p) -> p[0]).thenComparingInt(p -> p[1]);
        Arrays.sort(expected, comp);
        Arrays.sort(actual, comp);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testKClosestPoint2Origin() {
        int[][] expected = new int[][]{{-2, 2}};
        int[][] actual = kClosestPoint2Origin.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1);
        assert2DArrayEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void testKClosestPoint2Origin1() {
        int[][] expected = new int[][]{{3, 3}, {-2, 4}};
        int[][] actual = kClosestPoint2Origin.kClosest(new int[][]{{-2, 4}, {5, -1}, {3, 3}}, 2);
        assert2DArrayEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void testKClosestPoint2Origin2() {
        int[][] expected = new int[][]{{-5, 4}, {4, 6}};
        int[][] actual = kClosestPoint2Origin.kClosest(new int[][]{{-5, 4}, {-6, -5}, {4, 6}}, 2);
        assert2DArrayEqualsIgnoreOrder(expected, actual);
    }



}
