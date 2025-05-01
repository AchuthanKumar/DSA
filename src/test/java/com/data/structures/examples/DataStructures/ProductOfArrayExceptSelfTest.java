package com.data.structures.examples.DataStructures;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductOfArrayExceptSelfTest {
    @Autowired
    private ProductOfArrayExceptSelf productOfArrayExceptSelf;

    @Test
    public void testProductOfArrayExceptSelfByBruteForce() {
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelfBruteForce(new int[]{1, 2, 3, 4})));
        assertEquals(Arrays.toString(new int[]{24, 12, 8, 6}), Arrays.toString(productOfArrayExceptSelf.productExceptSelfBruteForce(new int[]{1, 2, 3, 4})));
    }

    @Test
    public void testProductOfArrayExceptSelfByBruteForce2() {
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelfBruteForce(new int[]{-1, 1, 0, -3, 3})));
        assertEquals(Arrays.toString(new int[]{0, 0, 9, 0, 0}), Arrays.toString(productOfArrayExceptSelf.productExceptSelfBruteForce(new int[]{-1, 1, 0, -3, 3})));
    }

    @Test
    public void testProductOfArrayExceptSelfByPrefixSuffixProductApproach() {
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelfPrefixSuffixProductApproach(new int[]{1, 2, 3, 4})));
        assertEquals(Arrays.toString(new int[]{24, 12, 8, 6}), Arrays.toString(productOfArrayExceptSelf.productExceptSelfPrefixSuffixProductApproach(new int[]{1, 2, 3, 4})));
    }

    @Test
    public void testProductOfArrayExceptSelfByPrefixSuffixProductApproach2() {
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelfPrefixSuffixProductApproach(new int[]{-1, 1, 0, -3, 3})));
        assertEquals(Arrays.toString(new int[]{0, 0, 9, 0, 0}), Arrays.toString(productOfArrayExceptSelf.productExceptSelfPrefixSuffixProductApproach(new int[]{-1, 1, 0, -3, 3})));
    }
}
