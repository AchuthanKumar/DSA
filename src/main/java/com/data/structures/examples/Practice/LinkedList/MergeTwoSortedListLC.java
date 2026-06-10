package com.data.structures.examples.Practice.LinkedList;

import org.springframework.stereotype.Service;

@Service
public class MergeTwoSortedListLC {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode anchor = new ListNode(0);
        ListNode current = anchor;

        while (list1 != null && list2 != null) {
            if(list1.val <= list2.val){
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            }else {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            }
        }

        if(list1 != null){
            current.next = list1;
        }

        if(list2 != null){
            current.next = list2;
        }

        return anchor.next;
    }

}
