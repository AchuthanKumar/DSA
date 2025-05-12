package com.data.structures.examples.Algorithms.TwoPointers;

import com.data.structures.examples.Algorithms.Arrays.TwoPointers.RemoveElement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RemoveElementTest {
    @Autowired
    RemoveElement removeElement;

    @Test
    public void testRemoveElement() {
        assertEquals(2, removeElement.removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    @Test
    public void testRemoveElement1() {
        assertEquals(5, removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    @Test
    public void testRemoveElement2() {
        assertEquals(1, removeElement.removeElement(new int[]{2}, 3));
    }

    @Test
    public void testRemoveElement3() {
        assertEquals(2, removeElement.removeElement(new int[]{3,3}, 5));
    }
}
