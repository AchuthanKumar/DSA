package com.data.structures.examples.Practice.Arrays.Stack;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ValidParenthesesLCTest {

    @Autowired
    public ValidParenthesesLC validParenthesesLC;


    @Test
    public void testValidParenthesesCase1() {
        boolean result = validParenthesesLC.isValid("()");
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    public void testValidParenthesesCase2() {
        boolean result = validParenthesesLC.isValid("()[]{}");
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    public void testValidParenthesesCase3() {
        boolean result = validParenthesesLC.isValid("(]");
        System.out.println(result);
        assertFalse(result);
    }

    @Test
    public void testValidParenthesesCase4() {
        boolean result = validParenthesesLC.isValid("([])");
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    public void testValidParenthesesCase5() {
        boolean result = validParenthesesLC.isValid("([)]");
        System.out.println(result);
        assertFalse(result);
    }

    @Test
    public void testValidParenthesesCase6() {
        boolean result = validParenthesesLC.isValid("]");
        System.out.println(result);
        assertFalse(result);
    }

    @Test
    public void testValidParenthesesCase7() {
        boolean result = validParenthesesLC.isValid("(){}}{");
        System.out.println(result);
        assertFalse(result);
    }
}
