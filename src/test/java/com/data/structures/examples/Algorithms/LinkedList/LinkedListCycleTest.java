package com.data.structures.examples.Algorithms.LinkedList;

import com.data.structures.examples.Algorithms.LinkedList.TwoPointers.LinkedListCycle;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class LinkedListCycleTest {
    @Autowired
    LinkedListCycle linkedListCycle;

    @Test
    public void testLinkedListCycle() {
        SinglyLinkedList list = new SinglyLinkedList();
        SLLNode head = new SLLNode(3);
        list.insertAtBeginning(head);

        SLLNode node1 = new SLLNode(2);
        list.insertAtEnd(node1);

        list.insertAtEnd(0);

        SLLNode node2 = new SLLNode(-4, node1);
        list.insertAtEnd(node2);

        assertTrue(linkedListCycle.hasCycle(head));
    }

    @Test
    public void testLinkedListCycle2() {
        SinglyLinkedList list = new SinglyLinkedList();
        SLLNode head = new SLLNode(3);
        list.insertAtBeginning(head);
        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        assertFalse(linkedListCycle.hasCycle(head));

    }

}
