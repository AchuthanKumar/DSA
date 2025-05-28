package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ValidateBSTTest {
    @Autowired
    ValidateBST validateBST;

    @Test
    public void validateBST() {
        BinaryTreeNode root = new BinaryTreeNode(2);
        root.left = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(3);

        assertTrue(validateBST.isValidBST(root));
    }

    @Test
    public void validateBST2() {
        BinaryTreeNode root = new BinaryTreeNode(5);
        root.left = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(4);
        root.left.left = new BinaryTreeNode(3);
        root.left.right = new BinaryTreeNode(6);

        assertFalse(validateBST.isValidBST(root));
    }

    @Test
    public void validateBST3() {
        BinaryTreeNode root = new BinaryTreeNode(2);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(2);

        assertFalse(validateBST.isValidBST(root));
    }
}
