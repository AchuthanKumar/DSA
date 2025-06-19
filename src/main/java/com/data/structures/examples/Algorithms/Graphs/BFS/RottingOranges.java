package com.data.structures.examples.Algorithms.Graphs.BFS;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int minutes = 0;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) queue.offer(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;
            }
        }

        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();

                for (int[] dir : directions) {
                    int nx = curr[0] + dir[0], ny = curr[1] + dir[1];
                    if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2;
                        queue.add(new int[]{nx, ny});
                        fresh--;
                    }
                }
            }

            minutes++;
        }


        return fresh == 0 ? minutes : -1;
    }
}
