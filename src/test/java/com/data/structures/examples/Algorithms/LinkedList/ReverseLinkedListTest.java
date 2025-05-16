package com.data.structures.examples.Algorithms.LinkedList;

import com.data.structures.examples.Algorithms.LinkedList.Basics.ReverseLinkedList;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ReverseLinkedListTest {
    @Autowired
    ReverseLinkedList reverseLinkedList;

    @Test
    public void testReverseLinkedList() {
        // Create original list manually
        SLLNode head = new SLLNode(1);
        head.next = new SLLNode(2);
        head.next.next = new SLLNode(3);
        head.next.next.next = new SLLNode(4);
        head.next.next.next.next = new SLLNode(5);

        // Reverse the list
        SLLNode reversedHead = reverseLinkedList.reverseList(head);

        // Verify reversed list is 5 → 4 → 3 → 2 → 1
        int[] expected = {5, 4, 3, 2, 1};
        int index = 0;

        while (reversedHead != null) {
            assertEquals(expected[index++], reversedHead.value);
            reversedHead = reversedHead.next;
        }
    }
}
