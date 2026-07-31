package com.data.structures.examples.Practice.Arrays;

import org.springframework.stereotype.Service;

@Service
public class FindTheCelebrity {

    public int findCelebrity(int n) {

        // Step 1: Find the potential celebrity
        int candidate = 0;

        for (int i = 1; i < n; i++) {
            if (knows(candidate, i)) {
                // Candidate knows someone, so candidate cannot be celebrity
                candidate = i;
            }
        }

        // Step 2: Verify the candidate
        for (int i = 0; i < n; i++) {

            if (i == candidate) {
                continue;
            }

            // Candidate should know nobody
            // Everyone should know candidate
            if (knows(candidate, i) || !knows(i, candidate)) {
                return -1;
            }
        }

        return candidate;
    }

//    Dummy method that returns response if person a knows b
    private boolean knows(int a, int b){
        return true;
    }
}
