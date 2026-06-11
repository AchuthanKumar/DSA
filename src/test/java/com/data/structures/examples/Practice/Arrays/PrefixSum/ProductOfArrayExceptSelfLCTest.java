package com.data.structures.examples.Practice.Arrays.PrefixSum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class ProductOfArrayExceptSelfLCTest {

    @Autowired
    ProductOfArrayExceptSelfLC productOfArrayExceptSelf;

    @Test
    public void testProductOfArrayExceptSelfCase1() {
        int[] result = productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(result));
        int[] expected = new int[]{24, 12, 8, 6};
        assertArrayEquals(expected, result);
    }

}
