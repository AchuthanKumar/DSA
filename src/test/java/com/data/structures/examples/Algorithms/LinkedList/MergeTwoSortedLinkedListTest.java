package com.data.structures.examples.Algorithms.LinkedList;

import com.data.structures.examples.Algorithms.LinkedList.InPlaceLLUpdate.MergeTwoSortedLinkedList;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MergeTwoSortedLinkedListTest {
    @Autowired
    MergeTwoSortedLinkedList mergeTwoSortedLinkedList;

    @Test
    public void testMergeTwoSortedLinkedList() {
        SLLNode head1 = new SLLNode(1);
        head1.next = new SLLNode(2);
        head1.next.next = new SLLNode(4);

        SLLNode head2 = new SLLNode(1);
        head2.next = new SLLNode(3);
        head2.next.next = new SLLNode(4);

        SLLNode head = mergeTwoSortedLinkedList.mergeTwoLists(head1, head2);

        StringBuilder output = new StringBuilder();
        while (head != null) {
            output.append(head.value + " -> ");
            head = head.next;
        }
        output.append("NULL");

        System.out.println(output.toString());

        assertEquals("1 -> 1 -> 2 -> 3 -> 4 -> 4 -> NULL", output.toString());
    }
}
