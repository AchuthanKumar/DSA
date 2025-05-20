package com.data.structures.examples.Algorithms.LinkedList;

import com.data.structures.examples.Algorithms.LinkedList.TwoPointers.LinkedListCycle2;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LinkedListCycle2Test {
    @Autowired
    LinkedListCycle2 linkedListCycle2;

    @Test
    public void testLinkedListCycle1() {
        SLLNode head = new SLLNode(3);
        head.next = new SLLNode(2);
        head.next.next = new SLLNode(0);
        head.next.next.next = new SLLNode(4);
        head.next.next.next.next = head.next;

        assertEquals(head.next, linkedListCycle2.detectCycle(head));
    }

    @Test
    public void testLinkedListCycle2() {
        SLLNode head = new SLLNode(1);
        head.next = new SLLNode(2);
        head.next.next = head;

        assertEquals(head, linkedListCycle2.detectCycle(head));
    }

    @Test
    public void testLinkedListCycle3() {
        SLLNode head = new SLLNode(1);

        assertEquals(null, linkedListCycle2.detectCycle(head));
    }

    @Test
    public void testLinkedListCycle4() {
        SLLNode head = new SLLNode(1);
        head.next = new SLLNode(2);

        assertEquals(null, linkedListCycle2.detectCycle(head));
    }
}
