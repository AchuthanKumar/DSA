package com.data.structures.examples.Algorithms.DynamicProgramming;

import org.springframework.stereotype.Service;

@Service
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;

        int oneStepBeforeFromCurrentStep = 2, twoStepsBeforeFromCurrentStep = 1, allPossibleWays = 0;

        for (int i = 3; i <= n; i++) {
            allPossibleWays = oneStepBeforeFromCurrentStep + twoStepsBeforeFromCurrentStep;
            twoStepsBeforeFromCurrentStep = oneStepBeforeFromCurrentStep;
            oneStepBeforeFromCurrentStep = allPossibleWays;
        }

        return allPossibleWays;
    }
}
