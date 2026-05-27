package com.data.structures.examples.Practice.Arrays.Stack;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class ValidParenthesesLC {

    public boolean isValid(String s) {
        Stack<Character> cStack = new Stack<>();

        for (char currChar : s.toCharArray()) {
            if (currChar == '(' || currChar == '{' || currChar == '[') {
                cStack.push(currChar);
            } else {
                if (cStack.isEmpty()) return false;
                char popChar = cStack.pop();
                switch (currChar) {
                    case ')':
                        if (popChar != '(') return false;
                        break;
                    case '}':
                        if (popChar != '{') return false;
                        break;
                    case ']':
                        if (popChar != '[') return false;
                        break;
                    default:
                        return false;
                }
            }
        }

        return cStack.isEmpty();
    }
}
