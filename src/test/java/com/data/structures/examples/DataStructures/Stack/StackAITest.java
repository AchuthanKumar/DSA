package com.data.structures.examples.DataStructures.Stack;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class StackAITest {
    @Test
    public void testStackAIPush() {
        StackAI stack = new StackAI(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals("30 -> 20 -> 10 -> NULL", stack.displayStack());
    }

    @Test
    public void testStackAIPushOverflow() {
        StackAI stack = new StackAI(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals("30 -> 20 -> 10 -> NULL", stack.displayStack());
    }

    @Test
    public void testStackAIPop() {
        StackAI stack = new StackAI(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.pop();

        assertEquals("30 -> 20 -> 10 -> NULL", stack.displayStack());
    }

    @Test
    public void testStackAIPopUnderflow() {
        StackAI stack = new StackAI(2);
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    public void testStackAIPeek() {
        StackAI stack = new StackAI(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        assertEquals(40, stack.peek());
    }

    @Test
    public void testStackAIExpand() {
        StackAI stack = new StackAI(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(4, stack.maxSize);
    }
}
