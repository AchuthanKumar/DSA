package com.data.structures.examples.Algorithms.Arrays.Stack.Basics;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek() > val) minStack.push(val);
        else minStack.push(minStack.peek());
    }

    public void pop() {
        if (stack.isEmpty()) return;
        stack.pop();
        if (minStack.isEmpty()) return;
        minStack.pop();
    }

    public int top() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) return -1;
        return minStack.peek();
    }

    public String displayStack(){
        StringBuilder output = new StringBuilder();

        Stack<Integer> displayStack = stack;

        while(!displayStack.isEmpty()){
            output.append(displayStack.pop() + " -> ");
        }
        output.append("EOS");

        return output.toString();
    }

    public String displayMinStack(){
        StringBuilder output = new StringBuilder();

        Stack<Integer> displayStack = minStack;

        while(!displayStack.isEmpty()){
            output.append(displayStack.pop() + " -> ");
        }
        output.append("EOS");

        return output.toString();
    }
}
