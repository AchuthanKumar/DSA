package com.data.structures.examples.DataStructures.Stack;


import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;

import java.util.EmptyStackException;

public class StackLL {
    SLLNode top;

    public StackLL() {
        top = null;
    }

    public void push(int data) {
        SLLNode newNode = new SLLNode(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int data = top.value;
        top = top.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.value;
    }

    public boolean isEmpty() {
        if (top == null)
            return true;
        else
            return false;
    }

    public String displayStack() {
        StringBuilder output = new StringBuilder();
        SLLNode current = top;
        while (current != null) {
            output.append(current.value + " -> ");
            current = current.next;
        }
        output.append("NULL");

        return output.toString();
    }
}
