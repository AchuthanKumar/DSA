package com.data.structures.examples.Algorithms.LinkedList.Practice;

import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.springframework.stereotype.Service;

@Service
public class AddTwoNumbers {
    public SLLNode addTwoNumbers(SLLNode l1, SLLNode l2) {
        SLLNode resultHead = new SLLNode(-1);
        SLLNode ptr1 = l1;
        SLLNode ptr2 = l2;
        SLLNode resultPtr = resultHead;
        int carry = 0;
        int tempSum = 0;

        while (ptr1 != null || ptr2 != null || carry != 0) {

            tempSum = carry;

            if (ptr1 != null) {
                tempSum += ptr1.value;
                ptr1 = ptr1.next;
            }

            if (ptr2 != null) {
                tempSum += ptr2.value;
                ptr2 = ptr2.next;
            }

            carry = tempSum > 9 ? tempSum / 10 : 0;
            tempSum = tempSum < 10 ? tempSum : tempSum % 10;

            resultPtr.next = new SLLNode(tempSum);

            resultPtr = resultPtr.next;
        }

        return resultHead.next;
    }
}
