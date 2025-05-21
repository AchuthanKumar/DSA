package com.data.structures.examples.Algorithms.BinarySearch;

import com.data.structures.examples.Algorithms.BinarySearch.Advanced.FindMinInRotatedSortedArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FindMinInRotatedSortedArrayTest {
    @Autowired
    FindMinInRotatedSortedArray findMinInRotatedSortedArray;

    @Test
    public void testFindMinInRotatedSortedArray() {
        assertEquals(1, findMinInRotatedSortedArray.findMin(new int[]{3,4,5,1,2}));
    }

    @Test
    public void testFindMinInRotatedSortedArray1() {
        assertEquals(0, findMinInRotatedSortedArray.findMin(new int[]{4,5,6,7,0,1,2}));
    }

    @Test
    public void testFindMinInRotatedSortedArray2() {
        assertEquals(11, findMinInRotatedSortedArray.findMin(new int[]{11,13,15,17}));
    }
}
