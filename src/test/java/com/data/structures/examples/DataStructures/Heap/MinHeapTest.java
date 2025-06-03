package com.data.structures.examples.DataStructures.Heap;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class MinHeapTest {

    private MinHeap heap;

    @BeforeEach
    public void setup() {
        heap = new MinHeap(10);
    }

    @Test
    public void testMinHeap() {
        heap.insert(9);
        heap.insert(3);
        heap.insert(6);
        heap.insert(1);

        System.out.println(heap.showMinHeap());
    }

    @Test
    public void testMinHeapOrder() {
        heap.insert(4);
        heap.insert(1);
        heap.insert(3);
        heap.insert(2);
        heap.insert(16);
        heap.insert(9);
        heap.insert(10);

        System.out.println(heap.showMinHeap());
    }

    @Test
    public void testInsertAndGetMin() {
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);

        assertEquals(3, heap.getMin());
    }

    @Test
    public void testInsertMaintainsHeapProperty() {
        heap.insert(10);
        heap.insert(4);
        heap.insert(15);
        heap.insert(1);
        heap.insert(3);

        assertEquals(1, heap.getMin());
    }

    @Test
    public void testDeleteMin() {
        heap.insert(4);
        heap.insert(2);
        heap.insert(7);

        assertEquals(2, heap.deleteMin());
        assertEquals(4, heap.getMin());
    }

    @Test
    public void testDeleteSpecificValue() {
        heap.insert(9);
        heap.insert(5);
        heap.insert(6);
        heap.insert(2);

        assertEquals(2, heap.delete(2));
        assertEquals(5, heap.getMin());

        assertThrows(IllegalStateException.class, () -> heap.delete(100)); // value not found
    }

    @Test
    public void testDeleteMinOnEmptyHeapThrows() {
        assertThrows(IllegalStateException.class, () -> heap.deleteMin());
    }

    @Test
    public void testInsertOnFullHeapThrows() {
        MinHeap smallHeap = new MinHeap(2);
        smallHeap.insert(1);
        smallHeap.insert(2);
        assertThrows(IllegalStateException.class, () -> smallHeap.insert(3));
    }

    @Test
    public void testBuildHeap() {
        int[] values = {4, 10, 3, 5, 1};
        heap.buildHeap(values, values.length);
        assertEquals(1, heap.getMin());
    }

    @Test
    public void testBuildHeapThrowsWhenExceedingCapacity() {
        int[] values = {1, 2, 3, 4, 5, 6};
        MinHeap smallHeap = new MinHeap(5);
        assertThrows(IllegalStateException.class, () -> smallHeap.buildHeap(values, values.length));
    }

    @Test
    public void testDestroyHeap() {
        heap.insert(1);
        heap.destroyHeap();

        assertNull(heap.heapVal);
        assertEquals(0, heap.size);
        assertEquals(0, heap.capacity);
    }

    @Test
    public void testShowMinHeap() {
        heap.insert(3);
        heap.insert(1);
        heap.insert(6);
        String output = heap.showMinHeap().trim();  // remove trailing space

        assertTrue(output.contains("1"));
        assertTrue(output.contains("3"));
        assertTrue(output.contains("6"));
    }

    @Test
    public void testPercolateUpAndDownWorkCorrectly() {
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);
        heap.insert(5);
        heap.insert(10);
        heap.insert(8);

        assertEquals(5, heap.getMin());
        assertEquals(5, heap.deleteMin());
        assertEquals(8, heap.getMin());
    }
}
