package com.data.structures.examples.Algorithms.LinkedList.TwoPointers;

import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.springframework.stereotype.Service;

@Service
public class LinkedListCycle2 {
    public SLLNode detectCycle(SLLNode head) {
        if (head == null || head.next == null) return null;

        SLLNode hare = head;
        SLLNode tortoise = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (tortoise == hare) {
                return cycleIntersectionNode(head, tortoise);
            }
        }

        return null;
    }

    private SLLNode cycleIntersectionNode(SLLNode head, SLLNode meetingPoint) {
        SLLNode ptrA = head;
        SLLNode ptrB = meetingPoint;

        while (ptrA != ptrB) {
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }

        return ptrA;
    }
}
