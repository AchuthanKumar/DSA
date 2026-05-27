package com.data.structures.examples.Practice.Arrays.SlidingWIndow.VariableSize;

import com.data.structures.examples.Practice.Arrays.SlidingWindow.VariableSize.LongestRepeatingCharacterReplacementLC;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LongestRepeatingCharacterReplacementLCTest {
    @Autowired
    LongestRepeatingCharacterReplacementLC longestRepeatingCharacterReplacementLC;

    @Test
    public void testLongestRepeatingCharacterReplacementCase1(){
        int result = longestRepeatingCharacterReplacementLC.longestSubStringLength("ABAB", 2);
        System.out.println(result);
        assertEquals(4,result);
    }

    @Test
    public void testLongestRepeatingCharacterReplacementCase2(){
        int result = longestRepeatingCharacterReplacementLC.longestSubStringLength("AABABBA", 1);
        System.out.println(result);
        assertEquals(4,result);
    }
}
