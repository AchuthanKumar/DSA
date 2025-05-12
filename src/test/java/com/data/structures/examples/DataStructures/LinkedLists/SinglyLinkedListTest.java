package com.data.structures.examples.DataStructures.LinkedLists;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class SinglyLinkedListTest {

    @Test
    public void testLinkedListInsertAtBeginning() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.insertAtBeginning(0);

        assertEquals("0 -> 1 -> 2 -> null", list.displayLinkedList());
    }

    @Test
    public void testLinkedListInsertAtEnd() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(2);

        assertEquals("0 -> 1 -> 2 -> null", list.displayLinkedList());
    }

    @Test
    public void testLinkedListInsertAtPosition() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(0);
        list.insertAtEnd(2);
        list.insertAtPosition(1, 1);

        assertEquals("0 -> 1 -> 2 -> null", list.displayLinkedList());
    }

    @Test
    public void testLinkedListDeleteAtBeginning() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.insertAtBeginning(0);
        list.insertAtBeginning(3);
        list.deleteAtBeginning();

        assertEquals("0 -> 1 -> 2 -> null", list.displayLinkedList());
    }

    @Test
    public void testLinkedListDeleteAtEnd() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.deleteAtEnd();

        assertEquals("0 -> 1 -> 2 -> null", list.displayLinkedList());
    }

    @Test
    public void testLinkedListDeleteAtPosition() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(0);
        list.insertAtEnd(2);
        list.insertAtPosition(1, 1);
        list.deleteAtPosition(1);

        assertEquals("0 -> 2 -> null", list.displayLinkedList());
    }

    @Test
    public void testInsertAtPositionInvalidIndex() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(1);
        Exception ex = assertThrows(IndexOutOfBoundsException.class, () -> list.insertAtPosition(2, 5));
        assertEquals("Provided index out of bounds", ex.getMessage());
    }

    @Test
    public void testDeleteAtBeginningEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertThrows(NullPointerException.class, list::deleteAtBeginning);
    }

    @Test
    public void testDeleteAtEndEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertThrows(NullPointerException.class, list::deleteAtEnd);
    }

    @Test
    void testDeleteAtPositionInvalidIndex() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.deleteAtPosition(3));
    }

    @Test
    void testDisplayOnEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertThrows(NullPointerException.class, list::display);
    }

}
