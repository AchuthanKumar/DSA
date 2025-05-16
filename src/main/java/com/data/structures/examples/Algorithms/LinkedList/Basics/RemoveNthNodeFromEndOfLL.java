package com.data.structures.examples.Algorithms.LinkedList.Basics;

import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.springframework.stereotype.Service;

@Service
public class RemoveNthNodeFromEndOfLL {

    public SLLNode removeNthFromEnd(SLLNode head, int n) {
        SLLNode dummy = new SLLNode();
        dummy.next = head;
        SLLNode hare = dummy;
        SLLNode tortoise = dummy;

        for (int i = 0; i < n; i++) {
            hare = hare.next;
        }

        while (hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next;
        }

        tortoise.next = tortoise.next.next;

        return dummy.next;
    }

}
