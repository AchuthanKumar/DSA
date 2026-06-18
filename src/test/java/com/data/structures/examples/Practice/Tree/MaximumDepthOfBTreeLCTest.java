package com.data.structures.examples.Practice.Tree;

import com.data.structures.examples.Practice.Trees.MaximumDepthOfBTreeLC;
import com.data.structures.examples.Practice.Trees.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MaximumDepthOfBTreeLCTest {

    @Autowired
    MaximumDepthOfBTreeLC maximumDepthOfBTree;

    @Test
    public void testMaximumDepthOfBTreeCase1() {
        TreeNode root = new TreeNode(3);
        root.setLeft(new TreeNode(9));
        root.setRight(new TreeNode(20));
        root.getRight().setLeft(new TreeNode(15));
        root.getRight().setRight(new TreeNode(7));

        int result = maximumDepthOfBTree.maxDepth(root);
        System.out.println("Result: " + result);
        assertEquals(3, result);
    }
}
