package com.data.structures.examples.Algorithms.Stack;

import com.data.structures.examples.Algorithms.Arrays.Stack.Basics.MinStack;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MinStackTest {
    @Test
    public void testMinStackPush() {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);

        assertEquals("4 -> 3 -> 2 -> 1 -> EOS", minStack.displayStack());
    }

    @Test
    public void testMinStackPush2() {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);

        assertEquals("1 -> 1 -> 1 -> 1 -> EOS", minStack.displayMinStack());
    }

    @Test
    public void testMinStackPop() {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        minStack.push(5);
        minStack.pop();

        assertEquals("4 -> 3 -> 2 -> 1 -> EOS", minStack.displayStack());
        assertEquals("1 -> 1 -> 1 -> 1 -> EOS", minStack.displayMinStack());
    }

    @Test
    public void testMinStackTop() {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(2);
        minStack.push(3);

        assertEquals(3, minStack.top());
    }

    @Test
    public void testMinStackGetMin() {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(2);
        minStack.push(3);

        assertEquals(1, minStack.getMin());
    }
}
