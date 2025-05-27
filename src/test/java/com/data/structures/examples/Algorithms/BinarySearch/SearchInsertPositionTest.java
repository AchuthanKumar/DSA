package com.data.structures.examples.Algorithms.BinarySearch;

import com.data.structures.examples.Algorithms.BinarySearch.Basics.SearchInsertPosition;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SearchInsertPositionTest {
    @Autowired
    SearchInsertPosition searchInsertPosition;

    @Test
    public void testSearchInsertPosition() {
        assertEquals(2,searchInsertPosition.searchInsert(new int[]{1,3,5,6},5));
    }

    @Test
    public void testSearchInsertPosition1() {
        assertEquals(1,searchInsertPosition.searchInsert(new int[]{1,3,5,6},2));
    }

    @Test
    public void testSearchInsertPosition2() {
        assertEquals(4,searchInsertPosition.searchInsert(new int[]{1,3,5,6},7));
    }

    @Test
    public void testSearchInsertPosition3() {
        assertEquals(0,searchInsertPosition.searchInsert(new int[]{1,3,5,6},-1));
    }
}
