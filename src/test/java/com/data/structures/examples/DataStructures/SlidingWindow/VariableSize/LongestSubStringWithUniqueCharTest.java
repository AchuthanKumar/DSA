package com.data.structures.examples.DataStructures.SlidingWindow.VariableSize;

import com.data.structures.examples.DataStructures.Arrays.SlidingWindow.VariableSize.LongestSubStringWithUniqueChar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LongestSubStringWithUniqueCharTest {
    @Autowired
    private LongestSubStringWithUniqueChar longestSubStringWithUniqueChar;

    @Test
    public void testLongestSubStringWithUniqueChar() {
        assertEquals(3,longestSubStringWithUniqueChar.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testLongestSubStringWithUniqueChar1() {
        assertEquals(1,longestSubStringWithUniqueChar.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testLongestSubStringWithUniqueChar2() {
        assertEquals(3,longestSubStringWithUniqueChar.lengthOfLongestSubstring("pwwkew"));
    }

}
