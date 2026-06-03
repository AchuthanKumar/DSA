package com.data.structures.examples.Practice.Arrays.TwoPointers;

import org.springframework.stereotype.Service;

@Service
public class ContainerWithMostWaterLC {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int currArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(currArea, maxArea);
            if (height[left] > height[right]) right--;
            else left++;
        }

        return maxArea;
    }
}
