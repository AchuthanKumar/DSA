package com.data.structures.examples.Algorithms.Arrays.Stack.StackSimulation;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class EvaluateReversePolishNotation {
    Stack<Integer> operands;
    int operand1;
    int operand2;

    public int evalRPN(String[] tokens) {
        operands = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    operand2 = operands.pop();
                    operand1 = operands.pop();
                    operands.push(operand1 + operand2);
                    break;
                case "-":
                    operand2 = operands.pop();
                    operand1 = operands.pop();
                    operands.push(operand1 - operand2);
                    break;
                case "*":
                    operand2 = operands.pop();
                    operand1 = operands.pop();
                    operands.push(operand1 * operand2);
                    break;
                case "/":
                    operand2 = operands.pop();
                    operand1 = operands.pop();
                    operands.push(operand1 / operand2);
                    break;
                default:
                    operands.push(Integer.parseInt(token));
                    break;
            }
        }

        return operands.pop();
    }
}
