package com.data.structures.examples.DataStructures.PrefixSum;

import com.data.structures.examples.DataStructures.Arrays.PrefixSum.MaximumScoreAfterSplittingString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MaximumScoreAfterSplittingStringTest {
    @Autowired
    private MaximumScoreAfterSplittingString maximumScoreAfterSplittingString;

    @Test
    public void testMaximumScoreAfterSplittingString() {
        assertEquals(5,maximumScoreAfterSplittingString.maxScore("011101"));
    }

    @Test
    public void testMaximumScoreAfterSplittingString1() {
        assertEquals(5,maximumScoreAfterSplittingString.maxScore("00111"));
    }

    @Test
    public void testMaximumScoreAfterSplittingString2() {
        assertEquals(3,maximumScoreAfterSplittingString.maxScore("1111"));
    }
}
