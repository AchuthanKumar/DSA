package com.data.structures.examples.Practice.LinkedList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MergeTwoSortedListLCTest {

    @Autowired
    MergeTwoSortedListLC mergeTwoSortedList;

    @Test
    public void testMergeTwoSortedListCase1() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode currHead = list1;
        System.out.print("Input Sorted List1 : " + currHead.val);
        currHead = currHead.next;
        while (currHead != null) {
            System.out.print(" -> " + currHead.val);
            currHead = currHead.next;
        }

        currHead = list2;
        System.out.print("\nInput Sorted List2 : " + currHead.val);
        currHead = currHead.next;
        while (currHead != null) {
            System.out.print(" -> " + currHead.val);
            currHead = currHead.next;
        }

        ListNode resultHead = mergeTwoSortedList.mergeTwoLists(list1, list2);
        System.out.print("\n\nMerged List : " + resultHead.val);
        resultHead = resultHead.next;
        while (resultHead != null) {
            System.out.print(" -> " + resultHead.val);
            resultHead = resultHead.next;
        }
    }

}
