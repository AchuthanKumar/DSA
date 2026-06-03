package com.data.structures.examples.Practice.Heaps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class KClosestPointsToOriginTest {

    @Autowired
    KClosestPointsToOrigin kClosestPointsToOrigin;

    @Test
    public void testKClosestPointsToOriginCase1() {
        int[][] result = kClosestPointsToOrigin.kClosestPoints(new int[][]{{1, 3}, {-2, 2}}, 1);
        System.out.println(Arrays.toString(result));
        int[][] expected = new int[][]{{-2, 2}};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testKClosestPointsToOriginCase2() {
        int[][] result = kClosestPointsToOrigin.kClosestPoints(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
        System.out.println(Arrays.toString(result));
        int[][] expected = new int[][]{{3, 3}, {-2, 4}};
        assertArrayEquals(expected, result);
    }

}
