package com.data.structures.examples.Algorithms.Hashing;

import com.data.structures.examples.Algorithms.Arrays.Hashing.TwoSumLeetCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class TwoSumLeetCodeTest {

    @Autowired
    private TwoSumLeetCode twoSumLeetCode;

    @Test
    public void twoSumBFLeetCodeTestFailCase() {
        System.out.println(Arrays.toString(twoSumLeetCode.twoSumBruteForce(new int[]{2, 11, 6, 15}, 9)));
    }

    @Test
    public void twoSumsBFLeetCodeTestSuccessCase(){
        System.out.println(Arrays.toString(twoSumLeetCode.twoSumBruteForce(new int[]{2, 11, 7, 15}, 9)));
    }

    @Test
    public void twoSumOptimizedLeetCodeTestFailCase() {
        System.out.println(Arrays.toString(twoSumLeetCode.twoSumOptimized(new int[]{2, 11, 6, 15}, 9)));
    }

    @Test
    public void twoSumsOptimizedLeetCodeTestSuccessCase(){
        System.out.println(Arrays.toString(twoSumLeetCode.twoSumOptimized(new int[]{2, 11, 7, 15}, 9)));
    }
}
