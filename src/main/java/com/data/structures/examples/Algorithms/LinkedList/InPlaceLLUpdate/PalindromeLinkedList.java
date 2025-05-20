package com.data.structures.examples.Algorithms.LinkedList.InPlaceLLUpdate;

import com.data.structures.examples.Algorithms.LinkedList.Basics.ReverseLinkedList;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PalindromeLinkedList {
    @Autowired
    ReverseLinkedList reverseLinkedList;

    public boolean isPalindrome(SLLNode head) {
        SLLNode current = head;
        SLLNode hare = head;
        SLLNode tortoise = head;

        while (hare != null && tortoise.next != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        SLLNode mid = reverseLinkedList.reverseList(tortoise);

        while (mid != null) {
            if (current.value != mid.value) {
                return false;
            }

            current = current.next;
            mid = mid.next;
        }

        return true;
    }
}
