package com.data.structures.examples.Algorithms.TwoPointers;

import com.data.structures.examples.Algorithms.Arrays.TwoPointers.MoveZeros;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class MoveZerosTest {
    @Autowired
    MoveZeros moveZeros;

    @Test
    public void testMoveZeros() {
        assertArrayEquals(new int[]{1,3,12,0,0},moveZeros.moveZeroes(new int[]{0,1,0,3,12}));
    }

    @Test
    public void testMoveZeros1() {
        assertArrayEquals(new int[]{0},moveZeros.moveZeroes(new int[]{0}));
    }

    @Test
    public void testMoveZeros2() {
        assertArrayEquals(new int[]{1},moveZeros.moveZeroes(new int[]{1}));
    }

    @Test
    public void testMoveZeros3() {
        assertArrayEquals(new int[]{1,0},moveZeros.moveZeroes(new int[]{1,0}));
    }
}
