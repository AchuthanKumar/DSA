package com.data.structures.examples.Algorithms.LinkedList;

import com.data.structures.examples.Algorithms.LinkedList.Basics.RemoveNthNodeFromEndOfLL;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RemoveNthNodeFromEndOfLLTest {
    @Autowired
    RemoveNthNodeFromEndOfLL removeNthNodeFromEndOfLL;

    @Test
    public void testRemoveNthNodeFromEndOfLL() {
        SLLNode head = new SLLNode(1);
        head.next = new SLLNode(2);
        head.next.next = new SLLNode(3);
        head.next.next.next = new SLLNode(4);
        head.next.next.next.next = new SLLNode(5);

        SLLNode newHead = removeNthNodeFromEndOfLL.removeNthFromEnd(head, 2);

        StringBuilder output = new StringBuilder();
        while (newHead != null) {
            output.append(newHead.value + " -> ");
            newHead = newHead.next;
        }
        output.append("NULL");

        System.out.println(output.toString());
        assertEquals("1 -> 2 -> 3 -> 5 -> NULL", output.toString());
    }

    @Test
    public void testRemoveNthNodeFromEndOfLL1() {
        SLLNode head = new SLLNode(1);

        SLLNode newHead = removeNthNodeFromEndOfLL.removeNthFromEnd(head, 1);

        StringBuilder output = new StringBuilder();
        while (newHead != null) {
            output.append(newHead.value + " -> ");
            newHead = newHead.next;
        }
        output.append("NULL");

        System.out.println(output.toString());
        assertEquals("NULL", output.toString());
    }

    @Test
    public void testRemoveNthNodeFromEndOfLL2() {
        SLLNode head = new SLLNode(1);
        head.next = new SLLNode(2);

        SLLNode newHead = removeNthNodeFromEndOfLL.removeNthFromEnd(head, 1);

        StringBuilder output = new StringBuilder();
        while (newHead != null) {
            output.append(newHead.value + " -> ");
            newHead = newHead.next;
        }
        output.append("NULL");

        System.out.println(output.toString());
        assertEquals("1 -> NULL", output.toString());
    }
}
