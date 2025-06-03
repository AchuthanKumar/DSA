package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LeastCommonAncestorBTTest {
    @Autowired
    LeastCommonAncestorBT leastCommonAncestorBT;

    @Test
    public void testLeastCommonAncestorBT() {
        BinaryTreeNode root = new BinaryTreeNode(3);
        root.left = new BinaryTreeNode(5);
        root.left.left = new BinaryTreeNode(6);
        root.left.right = new BinaryTreeNode(2);
        root.left.right.left = new BinaryTreeNode(7);
        root.left.right.right = new BinaryTreeNode(4);
        root.right = new BinaryTreeNode(1);
        root.right.left = new BinaryTreeNode(0);
        root.right.right = new BinaryTreeNode(8);

        BinaryTreeNode p = root.left;
        BinaryTreeNode q = root.right;

        assertEquals(3, leastCommonAncestorBT.lowestCommonAncestor(root, p, q).data);
    }

    @Test
    public void testLeastCommonAncestorBT2() {
        BinaryTreeNode root = new BinaryTreeNode(3);
        root.left = new BinaryTreeNode(5);
        root.left.left = new BinaryTreeNode(6);
        root.left.right = new BinaryTreeNode(2);
        root.left.right.left = new BinaryTreeNode(7);
        root.left.right.right = new BinaryTreeNode(4);
        root.right = new BinaryTreeNode(1);
        root.right.left = new BinaryTreeNode(0);
        root.right.right = new BinaryTreeNode(8);

        BinaryTreeNode p = root.left;
        BinaryTreeNode q = root.left.right.right;

        assertEquals(5, leastCommonAncestorBT.lowestCommonAncestor(root, p, q).data);
    }
}
