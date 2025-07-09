package com.data.structures.examples.Algorithms.DynamicProgramming.PathFinding;

import org.springframework.stereotype.Service;

@Service
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

        return dp[m - 1][n - 1];
    }

    public int uniquePaths1D(int m, int n) {
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) dp[i] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }

        return dp[n - 1];
    }

    public int uniquePathsCombinatorics(int m, int n) {
//        C(n,k) = n!/[k! * (n-k)!]
//        C(n,k) = n * (n-1) * (n-2) . . . .  * (n - k + 1) / k!
//        Two Directions : m - 1 and n - 1.
//        Total Movement : m + n - 2.
        return (int) combinatorics(m + n - 2, m - 1);
    }

    private long combinatorics(int n, int k) {
//        At i=0, the default value is 1
        long result = 1;

        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }
}
