package com.data.structures.examples.Algorithms.LinkedList;

import com.data.structures.examples.Algorithms.LinkedList.InPlaceLLUpdate.PalindromeLinkedList;
import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PalindromeLinkedListTest {
    @Autowired
    private PalindromeLinkedList palindromeLinkedList;

    @Test
    public void isPalindrome() {
        SLLNode head = new SLLNode(1);
        head.next = new SLLNode(2);
        head.next.next = new SLLNode(2);
        head.next.next.next = new SLLNode(1);

        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void isPalindrome2() {
        SLLNode head = new SLLNode(1);
        head.next = new SLLNode(2);

        assertFalse(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void isPalindrome3() {
        SLLNode head = new SLLNode(1);

        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void isPalindrome4() {
        SLLNode head = new SLLNode(1);
        head.next = new SLLNode(0);
        head.next.next = new SLLNode(0);

        assertFalse(palindromeLinkedList.isPalindrome(head));
    }
}
