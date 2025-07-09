package com.data.structures.examples.Algorithms.DynamicProgramming;

import com.data.structures.examples.Algorithms.DynamicProgramming.PathFinding.UniquePaths;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class UniquePathsTest {
    @Autowired
    UniquePaths uniquePaths;

    @Test
    public void testUniquePathsUsing2DimensionalDP(){
        assertEquals(28,uniquePaths.uniquePaths(3,7));
    }

    @Test
    public void testUniquePathsUsing2DimensionalDP1(){
        assertEquals(3,uniquePaths.uniquePaths(3,2));
    }

    @Test
    public void testUniquePathsUsing1DimensionalDP(){
        assertEquals(28,uniquePaths.uniquePaths1D(3,7));
    }

    @Test
    public void testUniquePathsUsing1DimensionalDP1(){
        assertEquals(3,uniquePaths.uniquePaths1D(3,2));
    }

    @Test
    public void testUniquePathsUsingCombinatorics(){
        assertEquals(28,uniquePaths.uniquePathsCombinatorics(3,7));
    }

    @Test
    public void testUniquePathsUsingCombinatorics2(){
        assertEquals(3,uniquePaths.uniquePathsCombinatorics(3,2));
    }
}
