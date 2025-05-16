package com.data.structures.examples.Algorithms.Arrays.Stack.StackSimulation;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> indexStack = new Stack<>();

        for (int currIndex = 0; currIndex < temperatures.length; currIndex++) {
            while (!indexStack.isEmpty() && temperatures[currIndex] > temperatures[indexStack.peek()]) {
                int prevIndex = indexStack.pop();
                result[prevIndex] = currIndex - prevIndex;
            }
            indexStack.push(currIndex);
        }

        return result;
    }
}
