package com.data.structures.examples.Algorithms.Arrays.SlidingWindow.VariableSize;

import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class LongestSubStringWithUniqueChar {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<Character>();
        int left = 0;
        int windowLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                windowLength--;
                left++;
            }

            charSet.add(s.charAt(right));
            windowLength++;

            if (windowLength > maxLength) maxLength = windowLength;
        }

        return maxLength;
    }
}
