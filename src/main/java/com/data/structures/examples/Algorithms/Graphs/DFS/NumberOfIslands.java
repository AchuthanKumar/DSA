package com.data.structures.examples.Algorithms.Graphs.DFS;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

@Service
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int numOfIsland = 0;
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    Stack<int[]> stack = new Stack<>();
                    stack.push(new int[]{i, j});
                    grid[i][j] = '0';

                    while (!stack.isEmpty()) {
                        int[] curr = stack.pop();

                        for (int[] dir : directions) {
                            int nx = curr[0] + dir[0];
                            int ny = curr[1] + dir[1];

                            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length && grid[nx][ny] == '1') {
                                grid[nx][ny] = '0';
                                stack.push(new int[]{nx, ny});
                            }
                        }
                    }

                    numOfIsland++;
                }
            }
        }


        return numOfIsland;
    }
}
