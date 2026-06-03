package com.data.structures.examples.Practice.Arrays.Stack;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class DailyTemperaturesLC {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] answers = new int[temperatures.length];
        answers[temperatures.length - 1 != 0 ? temperatures.length - 1 : 0] = 0;

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
