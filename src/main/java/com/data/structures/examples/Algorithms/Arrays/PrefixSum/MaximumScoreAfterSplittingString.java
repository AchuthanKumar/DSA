package com.data.structures.examples.Algorithms.Arrays.PrefixSum;

import org.springframework.stereotype.Service;

@Service
public class MaximumScoreAfterSplittingString {
    public int maxScore(String s) {
        int maxScore = 0;
        int onesCount = 0;
        int zerosCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') onesCount++;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0')
                zerosCount++;
            else onesCount--;

            maxScore = Math.max(maxScore, onesCount + zerosCount);
        }

        return maxScore;
    }
}
