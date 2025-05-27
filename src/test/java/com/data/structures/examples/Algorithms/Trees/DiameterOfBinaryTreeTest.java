package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DiameterOfBinaryTreeTest {
    @Autowired
    DiameterOfBinaryTree diameterOfBinaryTree;

    @Test
    public void testDiameterOfBinaryTree() {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);

        assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTree(root));
    }
}
