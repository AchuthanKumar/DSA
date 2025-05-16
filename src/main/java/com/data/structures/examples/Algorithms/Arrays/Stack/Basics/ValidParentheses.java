package com.data.structures.examples.Algorithms.Arrays.Stack.Basics;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

//        Approach 1
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                stack.push(')');
//            } else if (c == '{') {
//                stack.push('}');
//            } else if (c == '[') {
//                stack.push(']');
//            } else {
//                if (stack.isEmpty() || stack.pop() != c) return false;
//            }
//        }

//        Approach 2
        for (char currChar : s.toCharArray()) {
            if (currChar == '(' || currChar == '{' || currChar == '[') {
                stack.push(currChar);
            } else {
                if (stack.isEmpty())
                    return false;
                char poppedChar = stack.pop();
                if ((poppedChar != '(' && currChar == ')') ||
                        (poppedChar != '{' && currChar == '}') ||
                        (poppedChar != '[' && currChar == ']')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
