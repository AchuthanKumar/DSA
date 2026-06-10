package com.data.structures.examples.Practice.LinkedList;

import org.springframework.stereotype.Service;

@Service
public class ReverseLinkedListLC {

//    null <- 1 <- 2 <- 3 <- 4 <- 5 | null

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null, next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    //    null | 1 -> 2 -> 3 -> 4 -> 5 -> null
    //    null <- 1 <- 2 <- 3 <- 4 <- 5 | null

    public ListNode reverseListRecursively(ListNode head) {
//        Base Case
        if (head == null || head.next == null) return head;

//        Recursive Case
        ListNode newHead = reverseListRecursively(head.next);

//        Fix pointers
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
