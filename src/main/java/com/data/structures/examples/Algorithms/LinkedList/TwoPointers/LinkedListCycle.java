package com.data.structures.examples.Algorithms.LinkedList.TwoPointers;

import com.data.structures.examples.DataStructures.LinkedLists.SLLNode;
import org.springframework.stereotype.Service;

@Service
public class LinkedListCycle {

    public boolean hasCycle(SLLNode head) {
        SLLNode harePointer = head;
        SLLNode tortoisePointer = head;

        while (harePointer.next != null) {
            try {
                tortoisePointer = tortoisePointer.next;
                harePointer = harePointer.next.next;

                if (tortoisePointer == harePointer || harePointer.next == tortoisePointer) {
                    return true;
                }
            } catch (NullPointerException e) {
                return false;
            }
        }

        return false;
    }

}
