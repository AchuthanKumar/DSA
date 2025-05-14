package com.data.structures.examples.DataStructures.DoublyLinkedLists;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DoublyLinkedListTest {

    @Test
    public void testDoublyLinkedListInsertAtBeginning() {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtBeginning(30);

        assertEquals("30 -> 20 -> 10 -> NULL", dll.displayLinkedList());
    }

    @Test
    public void testDoublyLinkedListInsertAtEnd() {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(30);
        dll.insertAtEnd(20);
        dll.insertAtEnd(10);

        assertEquals("30 -> 20 -> 10 -> NULL", dll.displayLinkedList());
    }

    @Test
    public void testDoublyLinkedListInsertAtPosition() {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(30);
        dll.insertAtEnd(10);
        dll.insertAtPosition(1, 20);

        assertEquals("30 -> 20 -> 10 -> NULL", dll.displayLinkedList());
    }

    @Test
    public void testDoublyLinkedListDeleteAtBeginning() {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtBeginning(30);
        dll.insertAtBeginning(40);
        dll.deleteAtBeginning();

        assertEquals("30 -> 20 -> 10 -> NULL", dll.displayLinkedList());
    }

    @Test
    public void testDoublyLinkedListDeleteAtEnd() {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(30);
        dll.insertAtEnd(20);
        dll.insertAtEnd(10);
        dll.insertAtEnd(5);
        dll.deleteAtEnd();

        assertEquals("30 -> 20 -> 10 -> NULL", dll.displayLinkedList());
    }

    @Test
    public void testDoublyLinkedListDeleteAtPosition() {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtBeginning(40);
        dll.insertAtBeginning(30);
        dll.deleteAtPosition(1);

        assertEquals("30 -> 20 -> 10 -> NULL", dll.displayLinkedList());
    }
}
