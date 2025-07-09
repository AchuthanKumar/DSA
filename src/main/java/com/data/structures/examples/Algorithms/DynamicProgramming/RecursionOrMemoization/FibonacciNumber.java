package com.data.structures.examples.Algorithms.DynamicProgramming.RecursionOrMemoization;

import org.springframework.stereotype.Service;

@Service
public class FibonacciNumber {
    //    DP  : Top-down approach without Memoization
    public int fib(int n) {
        if (n == 0 || n == 1) return n;

        return fib(n - 1) + fib(n - 2);
    }

    //    Top-down approach with Memoization
    public int fibWithMemoization(int n) {
        int[] fibonacciSum = new int[n + 1];

        return fibHelper(n, fibonacciSum);
    }

    private int fibHelper(int n, int[] fibonacciSum) {
        if (n == 0 || n == 1) return n;

        if (fibonacciSum[n] != 0) return fibonacciSum[n];

        return fibonacciSum[n] = fibHelper(n - 1, fibonacciSum) + fibHelper(n - 2, fibonacciSum);
    }

    //    Bottom-Up Approach with Tabulation
    public int fibBottomUpWithTabulation(int n) {
        int[] fibonacciSum = new int[n + 1];

        fibonacciSum[0] = 0;
        fibonacciSum[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacciSum[i] = fibonacciSum[i - 1] + fibonacciSum[i - 2];
        }

        return fibonacciSum[n];
    }

    //    Bottom Up Approach Simplified
    public int fibBottomUpOptimized(int n) {
        int a = 0, b = 1, sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum;
    }
}
