package com.data.structures.examples.Practice.Arrays.HashMap;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;

@Service
public class ValidAnagramLC {

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charMap = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
            charMap.put(t.charAt(i), charMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (char key : charMap.keySet()) {
            if (charMap.get(key) != 0) return false;
        }

        return true;
    }

    public boolean isAnagramCheckUsingArrays(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}
