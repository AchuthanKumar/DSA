package com.data.structures.examples.Algorithms.DynamicProgramming;

import com.data.structures.examples.Algorithms.DynamicProgramming.PathFinding.MinPathSum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class MinPathSumTest {
    @Autowired
    MinPathSum minPathSum;

    @Test
    public void testMinPathSumUsing2DimensionalDp() {
        assertEquals(7, minPathSum.minPathSumUsing2DimensionalDp(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }

    @Test
    public void testMinPathSumUsing2DimensionalDp1() {
        assertEquals(12, minPathSum.minPathSumUsing2DimensionalDp(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    @Test
    public void testMinPathSumUsing1DimensionalDp() {
        assertEquals(7, minPathSum.minPathSumUsing1DimensionalDp(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }

    @Test
    public void testMinPathSumUsing1DimensionalDp1() {
        assertEquals(12, minPathSum.minPathSumUsing1DimensionalDp(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
