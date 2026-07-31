package com.data.structures.examples.Practice.Arrays.Stack;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class DailyTemperaturesLC {

    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures == null || temperatures.length == 0) {
            return new int[0];
        }

        int[] answers = new int[temperatures.length];

        Stack<Integer> dailyIndices = new Stack<>();
        dailyIndices.push(0);

        for (int i = 1; i < temperatures.length; i++) {
            while (!dailyIndices.isEmpty() && temperatures[i] > temperatures[dailyIndices.peek()]) {
                int j = dailyIndices.pop();
                answers[j] = i - j;
            }

            dailyIndices.push(i);
        }

        return answers;
    }
}
