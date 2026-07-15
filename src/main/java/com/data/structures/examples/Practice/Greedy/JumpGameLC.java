package com.data.structures.examples.Practice.Greedy;

import org.springframework.stereotype.Service;

//[2,3,1,1,4]
//[2,1,0,2,4]

@Service
public class JumpGameLC {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;

        int maxReach = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) return true;
        }

        return false;
    }
}
