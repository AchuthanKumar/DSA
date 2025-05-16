package com.data.structures.examples.Algorithms.LinkedList.Basics;

import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.springframework.stereotype.Service;

@Service
public class ReverseLinkedList {
    public SLLNode reverseList(SLLNode head) {
        SLLNode curr = head;
        SLLNode prev = null;

        while (curr != null) {
            SLLNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
