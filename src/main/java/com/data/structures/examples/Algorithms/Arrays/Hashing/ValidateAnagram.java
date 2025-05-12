package com.data.structures.examples.Algorithms.Arrays.Hashing;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;

@Service
public class ValidateAnagram {

//    Simple but Slower Execution
    public boolean isAnagramValidationBySortAndCompare(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    //    Faster Execution but does not handle unicode
    public boolean isAnagramValidationByCountArray(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] countArray = new int[128];

        for (int i = 0; i < s.length(); i++) {
            countArray[s.charAt(i)]++;
            countArray[t.charAt(i)]--;
        }

        for (int count : countArray) {
            if (count != 0) return false;
        }

        return true;
    }

    //    Below code Handles unicode
    public boolean isAnagramValidationByFrequencyCount(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

//        Approach 1 :
//        for (int i = 0; i < s.length(); i++) {
//            charCountMap.put(s.charAt(i), charCountMap.getOrDefault(s.charAt(i), 0) + 1);
//            charCountMap.put(t.charAt(i), charCountMap.getOrDefault(t.charAt(i), 0) - 1);
//        }
//
//        for (char c : charCountMap.keySet()) {
//            if (charCountMap.get(c) != 0) return false;
//        }

//        Approach 2 (Faster) :
        for (char sChar : s.toCharArray()) {
            charCountMap.put(sChar, charCountMap.getOrDefault(sChar, 0) + 1);
        }

        for (char tChar : t.toCharArray()) {
            if (charCountMap.containsKey(tChar)) {
                charCountMap.put(tChar, charCountMap.get(tChar) - 1);
                if (charCountMap.get(tChar) < 0) return false;
            } else
                return false;
        }

        return true;
    }
}
