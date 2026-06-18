package com.data.structures.examples.Practice.Trees;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class MaximumDepthOfBTreeLC {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
