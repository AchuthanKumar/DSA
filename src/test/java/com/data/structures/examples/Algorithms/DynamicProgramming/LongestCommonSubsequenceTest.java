package com.data.structures.examples.Algorithms.DynamicProgramming;

import com.data.structures.examples.Algorithms.DynamicProgramming.TwoDimensional.LongestCommonSubsequence;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class LongestCommonSubsequenceTest {
    @Autowired
    LongestCommonSubsequence longestCommonSubsequence;

    @Test
    public void testLongestCommonSubsequence() {
        assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    public void testLongestCommonSubsequence1() {
        assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    public void testLongestCommonSubsequence2() {
        assertEquals(0, longestCommonSubsequence.longestCommonSubsequence("abc", "def"));
    }
}
