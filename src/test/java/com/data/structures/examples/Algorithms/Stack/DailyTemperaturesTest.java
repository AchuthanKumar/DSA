package com.data.structures.examples.Algorithms.Stack;

import com.data.structures.examples.Algorithms.Arrays.Stack.StackSimulation.DailyTemperatures;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DailyTemperaturesTest {
    @Autowired
    DailyTemperatures dailyTemperatures;

    @Test
    public void testDailyTemperatures() {
        assertEquals(Arrays.toString(new int[]{1, 1, 4, 2, 1, 1, 0, 0}), Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    @Test
    public void testDailyTemperatures1() {
        assertEquals(Arrays.toString(new int[]{1, 1, 1, 0}), Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{30, 40, 50, 60})));
    }

    @Test
    public void testDailyTemperatures2() {
        assertEquals(Arrays.toString(new int[]{1, 1, 0}), Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{30, 60, 90})));
    }

}
