package com.data.structures.examples.Practice.LinkedList;

public class LinkedListCycleLC {

    public boolean hasCycle(ListNode head) {
        ListNode tortoise = head, hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (hare == tortoise)
                return true;
        }

        return false;
    }
}
