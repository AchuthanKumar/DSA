package com.data.structures.examples.Algorithms.LinkedList.InPlaceLLUpdate;

import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.springframework.stereotype.Service;

@Service
public class MergeTwoSortedLinkedList {
    public SLLNode mergeTwoLists(SLLNode list1, SLLNode list2) {
        SLLNode dummyHead = new SLLNode(-1);
        SLLNode curr = dummyHead;


        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            } else {
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            curr.next = list1;
            curr = curr.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            curr.next = list2;
            curr = curr.next;
            list2 = list2.next;
        }

        return dummyHead.next;
    }
}
