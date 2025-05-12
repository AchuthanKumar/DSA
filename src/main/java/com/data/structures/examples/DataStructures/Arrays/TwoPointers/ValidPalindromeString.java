package com.data.structures.examples.DataStructures.Arrays.TwoPointers;

import org.springframework.stereotype.Service;

@Service
public class ValidPalindromeString {

    public boolean isPalindromeValidationByBruteForce(String s) {
        StringBuilder cleanedString = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanedString.append(c);
            }
        }

        return cleanedString.toString().toLowerCase().equals(cleanedString.reverse().toString().toLowerCase());
    }

    public boolean isPalindromeValidationByTwoPointers(String s) {

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (j > i && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }

        return true;
    }
}
