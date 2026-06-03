package com.data.structures.examples.Practice.Arrays.Stack;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class DailyTemperaturesLCTest {

    @Autowired
    DailyTemperaturesLC dailyTemperaturesLC;


    @Test
    public void testDailyTemperaturesLCcase1() {
        int[] result = dailyTemperaturesLC.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(Arrays.toString(result));
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
//        Arrays.sort(result);
//        Arrays.sort(expected);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDailyTemperaturesLCcase2() {
        int[] result = dailyTemperaturesLC.dailyTemperatures(new int[]{30,40,50,60});
        System.out.println(Arrays.toString(result));
        int[] expected = new int[]{1,1,1,0};
//        Arrays.sort(result);
//        Arrays.sort(expected);
        assertArrayEquals(expected, result);
    }
}
