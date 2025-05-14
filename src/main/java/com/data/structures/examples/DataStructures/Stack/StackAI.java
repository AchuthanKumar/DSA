package com.data.structures.examples.DataStructures.Stack;

import java.util.EmptyStackException;

public class StackAI {
    int top = -1;
    int maxSize;
    int[] stackArray;

    public StackAI(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
    }

    public void push(int value) {
//        if (isFull()) throw new StackOverflowError("Maximum stack size reached");
        if (isFull()) expandStack();
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return stackArray[top];
    }

    public boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    public boolean isFull() {
        if (top == maxSize - 1) return true;
        else return false;
    }

    public void expandStack() {
        int[] tempStack = stackArray;
        maxSize = maxSize * 2;
        stackArray = new int[maxSize];
        for (int i = 0; i < tempStack.length; i++) {
            stackArray[i] = tempStack[i];
        }
    }

    public String displayStack() {
        StringBuilder output = new StringBuilder();

        for (int index = top; index >= 0; index--) {
            output.append(stackArray[index] + " -> ");
        }
        output.append("NULL");

        return output.toString();
    }
}
