package com.data.structures.examples.Algorithms.LinkedList.TwoPointers;

import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.springframework.stereotype.Service;

@Service
public class IntersectionOfTwoLinkedList {
    public SLLNode getIntersectionNode(SLLNode headA, SLLNode headB) {
        if (headA == null || headB == null) return null;

        SLLNode pointerA = headA;
        SLLNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = pointerA == null ? headB : pointerA.next;
            pointerB = pointerB == null ? headA : pointerB.next;
        }

        return pointerA;
    }
}
