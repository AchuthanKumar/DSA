package com.data.structures.examples.Practice.Arrays.Hashing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ValidAnagramLCTest {

    @Autowired
    public ValidAnagramLC validAnagramLC;

    @Test
    public void testIsValidAnagramCase1(){
        boolean result = validAnagramLC.isAnagram("anagram","nagaram");
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    public void testIsValidAnagramCase2(){
        boolean result = validAnagramLC.isAnagram("rat","car");
        System.out.println(result);
        assertFalse(result);
    }


    @Test
    public void testIsValidAnagramUsingArraysCase1(){
        boolean result = validAnagramLC.isAnagramCheckUsingArrays("anagram","nagaram");
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    public void testIsValidAnagramUsingArraysCase2(){
        boolean result = validAnagramLC.isAnagramCheckUsingArrays("rat","car");
        System.out.println(result);
        assertFalse(result);
    }
}
