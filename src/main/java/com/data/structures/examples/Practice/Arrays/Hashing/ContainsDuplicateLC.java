package com.data.structures.examples.Practice.Arrays.Hashing;

import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class ContainsDuplicateLC {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> distinctSet = new HashSet<>();

        for (int num : nums) {
            if (distinctSet.contains(num))
                return true;

            distinctSet.add(num);
        }

        return false;
    }
}
