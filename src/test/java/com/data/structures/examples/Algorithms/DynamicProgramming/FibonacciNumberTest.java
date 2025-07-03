package com.data.structures.examples.Algorithms.DynamicProgramming;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class FibonacciNumberTest {
    @Autowired
    FibonacciNumber fibonacciNumber;

    @Test
    public void testFibonacciNumber(){
        assertEquals(1,fibonacciNumber.fib(2));
    }

    @Test
    public void testFibonacciNumber1(){
        assertEquals(2,fibonacciNumber.fib(3));
    }

    @Test
    public void testFibonacciNumber2(){
        assertEquals(3,fibonacciNumber.fib(4));
    }

    @Test
    public void testFibonacciNumberWithMemoization(){
        assertEquals(1,fibonacciNumber.fibWithMemoization(2));
    }

    @Test
    public void testFibonacciNumberWithMemoization1(){
        assertEquals(2,fibonacciNumber.fibWithMemoization(3));
    }

    @Test
    public void testFibonacciNumberWithMemoization2(){
        assertEquals(3,fibonacciNumber.fibWithMemoization(4));
    }

    @Test
    public void testFibonacciNumberBottomUpWithTabulation(){
        assertEquals(1,fibonacciNumber.fibBottomUpWithTabulation(2));
    }

    @Test
    public void testFibonacciNumberBottomUpWithTabulation1(){
        assertEquals(2,fibonacciNumber.fibBottomUpWithTabulation(3));
    }

    @Test
    public void testFibonacciNumberBottomUpWithTabulation2(){
        assertEquals(3,fibonacciNumber.fibBottomUpWithTabulation(4));
    }

    @Test
    public void testFibonacciNumberBottomUpOptimized(){
        assertEquals(1,fibonacciNumber.fibBottomUpOptimized(2));
    }

    @Test
    public void testFibonacciNumberBottomUpOptimized1(){
        assertEquals(2,fibonacciNumber.fibBottomUpOptimized(3));
    }

    @Test
    public void testFibonacciNumberBottomUpOptimized2(){
        assertEquals(3,fibonacciNumber.fibBottomUpOptimized(4));
    }
}
