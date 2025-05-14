package com.data.structures.examples.Algorithms.Stack;

import com.data.structures.examples.Algorithms.Arrays.Stack.ValidParentheses;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ValidParenthesesTest {
    @Autowired
    ValidParentheses validParentheses;

    @Test
    public void testValidParentheses() {
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void testValidParentheses1() {
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    public void testValidParentheses2() {
        assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    public void testValidParentheses3() {
        assertTrue(validParentheses.isValid("([])"));
    }
}
