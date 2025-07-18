package com.data.structures.examples.Algorithms.DynamicProgramming.PathFinding;

import org.springframework.stereotype.Service;

@Service
public class MinPathSum {
    public int minPathSumUsing2DimensionalDp(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) dp[i][0] = dp[i - 1][0] + grid[i][0];
        for (int j = 1; j < n; j++) dp[0][j] = dp[0][j - 1] + grid[0][j];

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m - 1][n - 1];
    }

    public int minPathSumUsing1DimensionalDp(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[] dp = new int[n];

        dp[0] = grid[0][0];
        for (int j = 1; j < n; j++) dp[j] = grid[0][j] + dp[j - 1];

        for (int i = 1; i < m; i++) {
            dp[0] += grid[i][0];
            for (int j = 1; j < n; j++) {
                dp[j] = grid[i][j] + Math.min(dp[j - 1], dp[j]);
            }
        }

        return dp[n - 1];
    }
}
