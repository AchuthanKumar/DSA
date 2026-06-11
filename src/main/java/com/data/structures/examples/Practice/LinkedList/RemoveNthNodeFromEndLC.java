package com.data.structures.examples.Practice.LinkedList;

import org.springframework.stereotype.Service;

@Service
public class RemoveNthNodeFromEndLC {

    public ListNode removeNthNode(ListNode head, int n) {
        ListNode anchor = new ListNode();
        anchor.next = head;
        ListNode prev = anchor;
        ListNode fastPtr = head;

//        Move fast pointer n nodes away from slow pointer
        for (int i = 0; i < n; i++) fastPtr = fastPtr.next;


//        Traverse until fast pointer hits end of list to identify N node from end
        while (fastPtr != null) {
            fastPtr = fastPtr.next;
            prev = prev.next;
        }

//        Map previous node and next node, remove current node
        prev.next = prev.next.next;

        return anchor.next;
    }
}
