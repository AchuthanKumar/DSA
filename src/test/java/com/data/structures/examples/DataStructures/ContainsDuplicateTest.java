package com.data.structures.examples.DataStructures;

import com.data.structures.examples.DataStructures.Arrays.Hashing.ContainsDuplicate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class ContainsDuplicateTest {

    @Autowired
    private ContainsDuplicate containsDuplicate;

    @Test
    public void testContainsDuplicate() {
        assertTrue(containsDuplicate.containsDuplicateBruteForce(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void testContainsDuplicate1() {
        assertFalse(containsDuplicate.containsDuplicateBruteForce(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testContainsDuplicate2() {
        assertTrue(containsDuplicate.containsDuplicateBruteForce(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @Test
    public void testContainsDuplicateOnePass() {
        assertTrue(containsDuplicate.containsDuplicateOnePass(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void testContainsDuplicateOnePass1() {
        assertFalse(containsDuplicate.containsDuplicateOnePass(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testContainsDuplicateOnePass2() {
        assertTrue(containsDuplicate.containsDuplicateOnePass(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @Test
    public void testContainsDuplicateOnePassOptimized() {
        assertTrue(containsDuplicate.containsDuplicateOnePassOptimized(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void testContainsDuplicateOnePassOptimized1() {
        assertFalse(containsDuplicate.containsDuplicateOnePassOptimized(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testContainsDuplicateOnePassOptimized2() {
        assertTrue(containsDuplicate.containsDuplicateOnePassOptimized(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
