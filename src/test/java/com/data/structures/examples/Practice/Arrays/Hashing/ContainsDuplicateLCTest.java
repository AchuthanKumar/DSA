package com.data.structures.examples.Practice.Arrays.Hashing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ContainsDuplicateLCTest {

    @Autowired
    public ContainsDuplicateLC containsDuplicateLC;

    @Test
    public void testContainsDuplicateArray1() {
        boolean result = containsDuplicateLC.containsDuplicate(new int[]{1, 2, 3, 1});
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    public void testContainsDuplicateArray2(){
        boolean result = containsDuplicateLC.containsDuplicate(new int[]{1,2,3,4});
        System.out.println(result);
        assertFalse(result);
    }

    @Test
    public void testContainsDuplicateArray3(){
        boolean result = containsDuplicateLC.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        System.out.println(result);
        assertTrue(result);
    }
}
