package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.springframework.stereotype.Service;

@Service
public class DiameterOfBinaryTree {

    int diameter = 0;

    public int diameterOfBinaryTree(BinaryTreeNode root) {
        if (root != null)
            calculateDiameterOfBinaryTree(root);
        return diameter;
    }

    private int calculateDiameterOfBinaryTree(BinaryTreeNode root) {
        if (root == null) return 0;

        int leftDepth = calculateDiameterOfBinaryTree(root.left);
        int rightDepth = calculateDiameterOfBinaryTree(root.right);

        //calculate diameter at each node
        diameter = Math.max(diameter, leftDepth + rightDepth);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
