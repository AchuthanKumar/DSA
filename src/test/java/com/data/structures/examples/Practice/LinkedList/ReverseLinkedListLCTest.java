package com.data.structures.examples.Practice.LinkedList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReverseLinkedListLCTest {

    @Autowired
    ReverseLinkedListLC reverseLinkedList;

    @Test
    public void testReverseLinkedListCase1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode currHead = head;
        System.out.println("Input LinkedList : ");
        System.out.print(currHead.val);
        currHead = currHead.next;
        while (currHead != null) {
            System.out.print(" -> " + currHead.val);
            currHead = currHead.next;
        }

        ListNode resultHead = reverseLinkedList.reverseList(head);
        ListNode currResult = resultHead;
        System.out.println("\n\n\nReversed LinkedList : ");
        System.out.print(currResult.val);
        currResult = currResult.next;
        while (currResult != null) {
            System.out.print(" -> " + currResult.val);
            currResult = currResult.next;
        }
    }

    @Test
    public void testReverseLinkedListRecursiveCase1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode currHead = head;
        System.out.println("Input LinkedList : ");
        System.out.print(currHead.val);
        currHead = currHead.next;
        while (currHead != null) {
            System.out.print(" -> " + currHead.val);
            currHead = currHead.next;
        }

        ListNode resultHead = reverseLinkedList.reverseListRecursively(head);
        ListNode currResult = resultHead;
        System.out.println("\n\n\nReversed LinkedList : ");
        System.out.print(currResult.val);
        currResult = currResult.next;
        while (currResult != null) {
            System.out.print(" -> " + currResult.val);
            currResult = currResult.next;
        }
    }
}
