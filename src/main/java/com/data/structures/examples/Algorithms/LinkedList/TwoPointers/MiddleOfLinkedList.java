package com.data.structures.examples.Algorithms.LinkedList.TwoPointers;

import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.springframework.stereotype.Service;

@Service
public class MiddleOfLinkedList {
    public SLLNode middleNode(SLLNode head) {
        SLLNode harePointer = head;
        SLLNode tortoisePointer = head;

        try {
            while (harePointer.next != null) {
                tortoisePointer = tortoisePointer.next;
                harePointer = harePointer.next.next;
            }
        } catch (NullPointerException e) {
            return tortoisePointer;
        }

        return tortoisePointer;
    }
}
