package com.data.structures.examples.Practice.Arrays.SlidingWIndow.VariableSize;

import com.data.structures.examples.Practice.Arrays.SlidingWindow.VariableSize.LongestSubStringWithoutRepeatingCharactersLC;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LongestSubStringWithoutRepeatingCharactersLCTest {

    @Autowired
    public LongestSubStringWithoutRepeatingCharactersLC longestSubStringWithoutRepeatingCharactersLC;

    @Test
    public void testLengthOfLongestSubString1(){
        int result = longestSubStringWithoutRepeatingCharactersLC.lengthOfLongestSubString("abcabcbb");
        System.out.println(result);
        assertEquals(3,result);
    }

    @Test
    public void testLengthOfLongestSubString2(){
        int result = longestSubStringWithoutRepeatingCharactersLC.lengthOfLongestSubString("bbbbb");
        System.out.println(result);
        assertEquals(1,result);
    }

    @Test
    public void testLengthOfLongestSubString3(){
        int result = longestSubStringWithoutRepeatingCharactersLC.lengthOfLongestSubString("pwwkew");
        System.out.println(result);
        assertEquals(3,result);
    }

    @Test
    public void testLengthOfLongestSubString4(){
        int result = longestSubStringWithoutRepeatingCharactersLC.lengthOfLongestSubString("qrsvbspk");
        System.out.println(result);
        assertEquals(5,result);
    }
}
