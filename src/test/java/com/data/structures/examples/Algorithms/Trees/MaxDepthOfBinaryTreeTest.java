package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MaxDepthOfBinaryTreeTest {
    @Autowired
    MaxDepthOfBinaryTree maxDepthOfBinaryTree;

    @Test
    public void testMaxDepthOfBinaryTree() {
        BinaryTreeNode root = new BinaryTreeNode(3);
        root.left = new BinaryTreeNode(9);
        root.right = new BinaryTreeNode(20);
        root.right.left = new BinaryTreeNode(15);
        root.right.right = new BinaryTreeNode(7);

        assertEquals(3, maxDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    public void testMaxDepthOfBinaryTree2() {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(2);

        assertEquals(2, maxDepthOfBinaryTree.maxDepth(root));
    }
}
