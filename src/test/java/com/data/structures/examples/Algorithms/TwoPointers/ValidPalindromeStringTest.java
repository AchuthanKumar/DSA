package com.data.structures.examples.Algorithms.TwoPointers;

import com.data.structures.examples.Algorithms.Arrays.TwoPointers.ValidPalindromeString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ValidPalindromeStringTest {
    @Autowired
    ValidPalindromeString validPalindromeString;

    @Test
    public void testValidPalindromeStringByBruteForce() {
        assertTrue(validPalindromeString.isPalindromeValidationByBruteForce("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testValidPalindromeStringByBruteForce1() {
        assertFalse(validPalindromeString.isPalindromeValidationByBruteForce("race a car"));
    }

    @Test
    public void testValidPalindromeStringByBruteForce2() {
        assertTrue(validPalindromeString.isPalindromeValidationByBruteForce(" "));
    }

    @Test
    public void testValidPalindromeStringByBruteForce3() {
        assertTrue(validPalindromeString.isPalindromeValidationByBruteForce(".,"));
    }

    @Test
    public void testValidPalindromeStringByBruteForce4() {
        assertTrue(validPalindromeString.isPalindromeValidationByBruteForce("Never a foot too far, even."));
    }

    @Test
    public void testValidPalindromeStringByTwoPointers() {
        assertTrue(validPalindromeString.isPalindromeValidationByTwoPointers("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testValidPalindromeStringByTwoPointers1() {
        assertFalse(validPalindromeString.isPalindromeValidationByTwoPointers("race a car"));
    }

    @Test
    public void testValidPalindromeStringByTwoPointers2() {
        assertTrue(validPalindromeString.isPalindromeValidationByTwoPointers(" "));
    }

    @Test
    public void testValidPalindromeStringByTwoPointers3() {
        assertTrue(validPalindromeString.isPalindromeValidationByTwoPointers(".,"));
    }

    @Test
    public void testValidPalindromeStringByTwoPointers4() {
        assertTrue(validPalindromeString.isPalindromeValidationByTwoPointers("Never a foot too far, even."));
    }

}
