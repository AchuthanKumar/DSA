package com.data.structures.examples.Algorithms.DynamicProgramming;

import com.data.structures.examples.Algorithms.DynamicProgramming.TwoDimensional.EditDistance;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class EditDistanceTest {
    @Autowired
    EditDistance editDistance;

    @Test
    public void testEditDistance() {
        assertEquals(3, editDistance.minDistance("horse", "ros"));
    }

    @Test
    public void testEditDistance1() {
        assertEquals(5, editDistance.minDistance("intention", "execution"));
    }
}
