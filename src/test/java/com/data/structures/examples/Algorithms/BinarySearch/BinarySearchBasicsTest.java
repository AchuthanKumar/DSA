package com.data.structures.examples.Algorithms.BinarySearch;

import com.data.structures.examples.Algorithms.BinarySearch.Basics.BinarySearchBasics;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BinarySearchBasicsTest {
    @Autowired
    BinarySearchBasics binarySearchBasics;

    @Test
    public void testBinarySearchBasics() {
        assertEquals(4,binarySearchBasics.search(new int[]{-1,0,3,5,9,12},9));
    }

    @Test
    public void testBinarySearchBasics1() {
        assertEquals(-1,binarySearchBasics.search(new int[]{-1,0,3,5,9,12},2));
    }
}
