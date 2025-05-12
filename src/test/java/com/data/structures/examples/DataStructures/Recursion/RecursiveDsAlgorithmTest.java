package com.data.structures.examples.DataStructures.Recursion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class RecursiveDsAlgorithmTest {

    @Autowired
    private RecursiveDSalgorithm recursiveDSalgorithm;

    @Test
    public void testPrintSeriesInAsc() {
        recursiveDSalgorithm.printSeriesInAsc(10);
    }

    @Test
    public void testPrintSeriesInDesc() {
        recursiveDSalgorithm.printSeriesInDesc(10);
    }

    @Test
    public void testPrintSumOfSeries() {
        System.out.println(recursiveDSalgorithm.printSumOfSeries(10));
    }

    @Test
    public void testPalindromeChecker1() {
        boolean isPalindrome = recursiveDSalgorithm.palindromeChecker("malayalam");
        assertTrue(isPalindrome);
    }

    @Test
    public void testPalindromeChecker2() {
        boolean isPalindrome = recursiveDSalgorithm.palindromeChecker("Achuthan");
        assertFalse(isPalindrome);
    }
}
