package com.data.structures.examples.Algorithms.BinarySearch;

import com.data.structures.examples.Algorithms.BinarySearch.Advanced.SearchInRotatedSortedArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SearchInRotatedSortedArrayTest {
    @Autowired
    SearchInRotatedSortedArray searchInRotatedSortedArray;

    @Test
    public void testSearchInRotatedSortedArray() {
        assertEquals(4,searchInRotatedSortedArray.search(new int[] {4,5,6,7,0,1,2},0));
    }

    @Test
    public void testSearchInRotatedSortedArray1() {
        assertEquals(-1,searchInRotatedSortedArray.search(new int[] {4,5,6,7,0,1,2},3));
    }

    @Test
    public void testSearchInRotatedSortedArray2() {
        assertEquals(-1,searchInRotatedSortedArray.search(new int[] {1},0));
    }
}
