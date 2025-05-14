package com.data.structures.examples.DataStructures.Stack;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StackLLTest {

    @Test
    public void testStackLLPush() {
        StackLL stack = new StackLL();
        stack.push(3);
        stack.push(2);
        stack.push(1);

        assertEquals("1 -> 2 -> 3 -> NULL", stack.displayStack());
    }

    @Test
    public void testStackLLPop() {
        StackLL stack = new StackLL();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.pop();

        assertEquals("1 -> 2 -> 3 -> NULL", stack.displayStack());
    }

    @Test
    public void testStackLLPopUnderflow() {
        StackLL stack = new StackLL();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    public void testStackLLPeek() {
        StackLL stack = new StackLL();
        stack.push(3);
        stack.push(2);
        stack.push(1);

        assertEquals(1, stack.peek());
    }

    @Test
    public void testStackLLPeekUnderflow() {
        StackLL stack = new StackLL();
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    public void testStackLLIsEmpty() {
        StackLL stack = new StackLL();
        assertTrue(stack.isEmpty());
    }

}
