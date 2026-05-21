package com.data.structures.examples.Practice.Arrays.SlidingWindow.VariableSize;

import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class LongestSubStringWithoutRepeatingCharactersLC {

//    O(n)
    public int lengthOfLongestSubString(String s) {
        int left = 0, longestLen = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left++));
            }

            charSet.add(s.charAt(right));
            longestLen = Math.max(longestLen, charSet.size());
        }

        return longestLen;
    }

}
