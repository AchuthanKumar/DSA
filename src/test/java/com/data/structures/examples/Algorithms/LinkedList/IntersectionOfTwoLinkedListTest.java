package com.data.structures.examples.Algorithms.LinkedList;

import com.data.structures.examples.Algorithms.LinkedList.TwoPointers.IntersectionOfTwoLinkedList;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IntersectionOfTwoLinkedListTest {
    @Autowired
    IntersectionOfTwoLinkedList intersectionOfTwoLinkedList;

    @Test
    public void testIntersectionOfTwoLinkedList() {
        SLLNode head1 = new SLLNode(4);
        head1.next = new SLLNode(1);
        head1.next.next = new SLLNode(8);
        head1.next.next.next = new SLLNode(4);
        head1.next.next.next.next = new SLLNode(5);

        SLLNode head2 = new SLLNode(5);
        head2.next = new SLLNode(6);
        head2.next.next = new SLLNode(1);
        head2.next.next.next = head1.next.next;


        assertEquals(head2.next.next.next, intersectionOfTwoLinkedList.getIntersectionNode(head1, head2));
    }
}
