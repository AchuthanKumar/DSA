package com.data.structures.examples.Practice.Trees;

import org.springframework.stereotype.Service;

@Service
public class ValidateBinarySearchTreeLC {
    public boolean isValidBST(TreeNode root) {
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validateBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;

        if (root.val <= minVal || root.val >= maxVal) return false;

        return validateBST(root.left, minVal, root.val) && validateBST(root.right, root.val, maxVal);
    }
}
