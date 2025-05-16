package com.data.structures.examples.Algorithms.Stack;

import com.data.structures.examples.Algorithms.Arrays.Stack.StackSimulation.EvaluateReversePolishNotation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EvaluateReversePolishNotationTest {
    @Autowired
    EvaluateReversePolishNotation evaluateReversePolishNotation;

    @Test
    public void testEvaluateReversePolishNotation() {
        assertEquals(9, evaluateReversePolishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    public void testEvaluateReversePolishNotation1() {
        assertEquals(6, evaluateReversePolishNotation.evalRPN(new String[]{"4","13","5","/","+"}));
    }

    @Test
    public void testEvaluateReversePolishNotation2() {
        assertEquals(22, evaluateReversePolishNotation.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
