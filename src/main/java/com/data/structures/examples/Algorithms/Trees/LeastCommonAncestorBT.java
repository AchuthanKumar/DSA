package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.springframework.stereotype.Service;

@Service
public class LeastCommonAncestorBT {
    public BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root == null || root == p || root == q)
            return root;

        BinaryTreeNode leftLca = lowestCommonAncestor(root.left, p, q);
        BinaryTreeNode rightLca = lowestCommonAncestor(root.right, p, q);

        if (leftLca != null && rightLca != null)
            return root;

        return leftLca != null ? leftLca : rightLca;
    }
}
