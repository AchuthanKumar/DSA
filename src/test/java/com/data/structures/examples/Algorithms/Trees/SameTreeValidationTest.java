package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SameTreeValidationTest {
    @Autowired
    SameTreeValidation sameTreeValidation;

    @Test
    public void testSameTreeValidation() {
        BinaryTreeNode root1 = new BinaryTreeNode(1);
        root1.left = new BinaryTreeNode(2);
        root1.right = new BinaryTreeNode(3);

        BinaryTreeNode root2 = new BinaryTreeNode(1);
        root2.left = new BinaryTreeNode(2);
        root2.right = new BinaryTreeNode(3);

        assertTrue(sameTreeValidation.isSameTree(root1, root2));
    }

    @Test
    public void testSameTreeValidation2() {
        BinaryTreeNode root1 = new BinaryTreeNode(1);
        root1.left = new BinaryTreeNode(2);

        BinaryTreeNode root2 = new BinaryTreeNode(1);
        root2.right = new BinaryTreeNode(2);

        assertFalse(sameTreeValidation.isSameTree(root1, root2));
    }

    @Test
    public void testSameTreeValidation3() {
        BinaryTreeNode root1 = new BinaryTreeNode(1);
        root1.left = new BinaryTreeNode(2);
        root1.right = new BinaryTreeNode(1);

        BinaryTreeNode root2 = new BinaryTreeNode(1);
        root2.left = new BinaryTreeNode(1);
        root2.right = new BinaryTreeNode(2);

        assertFalse(sameTreeValidation.isSameTree(root1, root2));
    }
}
