package com.data.structures.examples.Algorithms.DynamicProgramming.SubArray;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PalindromeSubString {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        subStringPalindromeValidation(0, s, new ArrayList<>(), result);
        return result;
    }

    private void subStringPalindromeValidation(int start, String string, ArrayList<String> currentList, List<List<String>> result) {
        if (start == string.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int end = start; end < string.length(); end++) {
            String subString = string.substring(start, end + 1);

            if (isPalindrome(subString)) {
                currentList.add(subString);
                subStringPalindromeValidation(end + 1, string, currentList, result);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;

        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }

        return true;
    }
}
