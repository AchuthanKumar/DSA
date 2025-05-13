package com.data.structures.examples.Algorithms.TwoPointers;

import com.data.structures.examples.Algorithms.LinkedList.TwoPointers.MiddleOfLinkedList;
import com.data.structures.examples.DataStructures.LinkedLists.SLLNode;
import com.data.structures.examples.DataStructures.LinkedLists.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MiddleOfLinkedListTest {
    @Autowired
    MiddleOfLinkedList middleOfLinkedList;

    @Test
    public void testMiddleOfLinkedList(){
        SinglyLinkedList list = new SinglyLinkedList();
        SLLNode head = new SLLNode(0);
        list.insertAtBeginning(head);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        assertEquals(2,middleOfLinkedList.middleNode(head).value);
    }

    @Test
    public void testMiddleOfLinkedList1(){
        SinglyLinkedList list = new SinglyLinkedList();
        SLLNode head = new SLLNode(0);
        list.insertAtBeginning(head);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        assertEquals(2,middleOfLinkedList.middleNode(head).value);
    }
}
