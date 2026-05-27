package com.data.structures.examples.Practice.Arrays.SlidingWindow.VariableSize;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LongestRepeatingCharacterReplacementLC {

    public int longestSubStringLength(String s, int k) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int windowLen = 0;
        int maxWindowLen = 0;
        int left = 0;
        int right = 0;

        for (; right < s.length() && left <= right; right++) {
            freqMap.put(s.charAt(right), freqMap.getOrDefault(s.charAt(right), 0) + 1);
            windowLen++;

            maxFreq = Math.max(maxFreq, freqMap.get(s.charAt(right)));


//            Shrink window
            if (windowLen - maxFreq > k) {
                char leftChar = s.charAt(left);

                if (freqMap.containsKey(leftChar)) {
                    if (freqMap.get(leftChar) > 1) {
                        freqMap.replace(leftChar, freqMap.get(leftChar) - 1);
                    } else {
                        freqMap.remove(leftChar);
                    }

                    left++;
                    windowLen = right - left + 1;
                }
            }


            maxWindowLen = Math.max(maxWindowLen, windowLen);
        }

        return maxWindowLen;
    }
}
