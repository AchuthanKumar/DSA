package com.data.structures.examples.Algorithms.DynamicProgramming;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class PartitionEqualSubsetSumTest {
    @Autowired
    PartitionEqualSubsetSum partitionEqualSubsetSum;

    @Test
    public void testPartitionEqualSubsetSum() {
        assertTrue(partitionEqualSubsetSum.canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    public void testPartitionEqualSubsetSum1() {
        assertFalse(partitionEqualSubsetSum.canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    public void testPartitionEqualSubsetSum2() {
        assertTrue(partitionEqualSubsetSum.canPartition(new int[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100}));
    }
}
