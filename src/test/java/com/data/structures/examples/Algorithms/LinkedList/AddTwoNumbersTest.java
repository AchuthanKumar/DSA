package com.data.structures.examples.Algorithms.LinkedList;

import com.data.structures.examples.Algorithms.LinkedList.Practice.AddTwoNumbers;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AddTwoNumbersTest {
    @Autowired
    AddTwoNumbers addTwoNumbers;

    @Test
    public void testAddTwoNumbers() {
        SLLNode list1 = new SLLNode(2);
        list1.next = new SLLNode(4);
        list1.next.next = new SLLNode(3);

        SLLNode list2 = new SLLNode(5);
        list2.next = new SLLNode(6);
        list2.next.next = new SLLNode(4);

        SLLNode result = addTwoNumbers.addTwoNumbers(list1, list2);

        StringBuilder output = new StringBuilder();
        while (result != null) {
            output.append(result.value + " -> ");
            result = result.next;
        }
        output.append("NULL");

        assertEquals("7 -> 0 -> 8 -> NULL", output.toString());
    }

    @Test
    public void testAddTwoNumbers1() {
        SLLNode list1 = new SLLNode(0);

        SLLNode list2 = new SLLNode(0);

        SLLNode result = addTwoNumbers.addTwoNumbers(list1, list2);

        StringBuilder output = new StringBuilder();
        while (result != null) {
            output.append(result.value + " -> ");
            result = result.next;
        }
        output.append("NULL");

        assertEquals("0 -> NULL", output.toString());
    }

    @Test
    public void testAddTwoNumbers2() {
        SLLNode list1 = new SLLNode(9);
        list1.next = new SLLNode(9);
        list1.next.next = new SLLNode(9);
        list1.next.next.next = new SLLNode(9);
        list1.next.next.next.next = new SLLNode(9);
        list1.next.next.next.next.next = new SLLNode(9);
        list1.next.next.next.next.next.next = new SLLNode(9);

        SLLNode list2 = new SLLNode(9);
        list2.next = new SLLNode(9);
        list2.next.next = new SLLNode(9);
        list2.next.next.next = new SLLNode(9);

        SLLNode result = addTwoNumbers.addTwoNumbers(list1, list2);

        StringBuilder output = new StringBuilder();
        while (result != null) {
            output.append(result.value + " -> ");
            result = result.next;
        }
        output.append("NULL");

        assertEquals("8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1 -> NULL", output.toString());
    }
}
