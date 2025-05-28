package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.springframework.stereotype.Service;

@Service
public class ValidateBST {
    public boolean isValidBST(BinaryTreeNode root) {
        return treeNodeValidationHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean treeNodeValidationHelper(BinaryTreeNode root, long min, long max) {
        if (root == null) return true; //Empty tree is always BST

        if (root.data <= min || root.data >= max) return false; //node value out of allowed range

        return treeNodeValidationHelper(root.left, min, root.data) && treeNodeValidationHelper(root.right, root.data, max);
    }
}
