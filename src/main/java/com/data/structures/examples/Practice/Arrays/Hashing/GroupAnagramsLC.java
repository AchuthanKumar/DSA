package com.data.structures.examples.Practice.Arrays.Hashing;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class GroupAnagramsLC {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        HashMap<String, List<String>> groupedAnagrams = new HashMap<>();

        for (String string : strs) {
            char[] sortedStrArray = string.toCharArray();
            Arrays.sort(sortedStrArray);
            String sortedStr = String.valueOf(sortedStrArray);

            List<String> groupList = groupedAnagrams.getOrDefault(sortedStr, new ArrayList<>());
            groupList.add(string);
            groupedAnagrams.put(sortedStr,groupList);

//            if (!groupedAnagrams.containsKey(sortedStr)) {
//                List<String> newList = new ArrayList<>();
//                newList.add(string);
//                groupedAnagrams.put(sortedStr, newList);
//            } else {
//                List<String> existingList = groupedAnagrams.get(sortedStr);
//                existingList.add(string);
//                groupedAnagrams.put(sortedStr, existingList);
//            }
        }

        for (String key : groupedAnagrams.keySet()) {
            result.add(groupedAnagrams.get(key));
        }

        return result;
    }
}
