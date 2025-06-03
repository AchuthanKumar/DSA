package com.data.structures.examples.DataStructures.Heaps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MaxHeapTest {

    private MaxHeap maxHeap;

    @BeforeEach
    public void setup() {
        maxHeap = new MaxHeap(10);
    }

    @Test
    void testInsertAndGetMax() {
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        assertEquals(20, maxHeap.getMax());
    }

    @Test
    void testDeleteMax() {
        maxHeap.insert(10);
        maxHeap.insert(40);
        maxHeap.insert(20);
        int max = maxHeap.deleteMax();
        assertEquals(40, max);
        assertEquals(2, maxHeap.size);
        assertEquals(20, maxHeap.getMax());
    }

    @Test
    void testDeleteSpecificValue() {
        maxHeap.insert(15);
        maxHeap.insert(30);
        maxHeap.insert(10);
        int deleted = maxHeap.delete(15);
        assertEquals(15, deleted);
        assertEquals(2, maxHeap.size);
    }

    @Test
    void testInsertBeyondCapacityThrows() {
        for (int i = 0; i < 10; i++) maxHeap.insert(i);
        assertThrows(IllegalStateException.class, () -> maxHeap.insert(11));
    }

    @Test
    void testGetMaxFromEmptyHeapThrows() {
        assertThrows(IllegalStateException.class, () -> maxHeap.getMax());
    }

    @Test
    void testDeleteMaxFromEmptyHeapThrows() {
        assertThrows(IllegalStateException.class, () -> maxHeap.deleteMax());
    }

    @Test
    void testDeleteNonExistentValueThrows() {
        maxHeap.insert(5);
        maxHeap.insert(9);
        assertThrows(IllegalStateException.class, () -> maxHeap.delete(100));
    }

    @Test
    void testBuildHeap() {
        int[] input = {3, 10, 5, 6, 2, 12, 7};
        maxHeap.buildHeap(input, input.length);
        assertEquals(12, maxHeap.getMax());
        assertEquals(7, maxHeap.size);
    }

    @Test
    void testBuildHeapExceedingCapacityThrows() {
        int[] input = new int[11];
        assertThrows(IllegalStateException.class, () -> maxHeap.buildHeap(input, input.length));
    }

    @Test
    void testDestroyHeap() {
        maxHeap.insert(50);
        maxHeap.destroyHeap();
        assertNull(maxHeap.heapVal);
        assertEquals(0, maxHeap.size);
        assertEquals(0, maxHeap.capacity);
    }

    @Test
    void testShowMaxHeap() {
        maxHeap.insert(4);
        maxHeap.insert(8);
        maxHeap.insert(2);
        String heapString = maxHeap.showMaxHeap();
        assertTrue(heapString.contains("8")); // 8 should be the root
        assertTrue(heapString.contains("4"));
        assertTrue(heapString.contains("2"));
    }
}
