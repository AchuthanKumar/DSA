package com.data.structures.examples.Practice.Graphs;

public class NumberOfIslandsLC {
    public int numIslands(char[][] grid) {
        int numIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    traverseGraph(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    private void traverseGraph(char[][] grid, int i, int j) {
        if (grid[i][j] == '0') return;

        grid[i][j] = '0';

        if (i > 0)
            traverseGraph(grid, i - 1, j);
        if (i < grid.length - 1)
            traverseGraph(grid, i + 1, j);
        if (j > 0)
            traverseGraph(grid, i, j - 1);
        if (j < grid[i].length - 1)
            traverseGraph(grid, i, j + 1);
    }
}
