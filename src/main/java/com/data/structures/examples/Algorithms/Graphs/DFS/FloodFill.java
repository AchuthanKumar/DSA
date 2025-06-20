package com.data.structures.examples.Algorithms.Graphs.DFS;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int currColor = image[sr][sc];

        Stack<int[]> stack = new Stack<>();

        if (currColor != color){
            stack.push(new int[]{sr, sc});
            image[sr][sc] = color;
        }

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();

            for (int[] dir : directions) {
                int nx = curr[0] + dir[0], ny = curr[1] + dir[1];
                if (nx >= 0 && nx < image.length && ny >= 0 && ny < image[0].length && image[nx][ny] == currColor) {
                    image[nx][ny] = color;
                    stack.push(new int[]{nx, ny});
                }
            }
        }

        return image;
    }
}
