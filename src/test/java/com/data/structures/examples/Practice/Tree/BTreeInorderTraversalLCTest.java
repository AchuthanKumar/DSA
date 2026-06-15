package com.data.structures.examples.Practice.Tree;

import com.data.structures.examples.Practice.Trees.BTreeInorderTraversalLC;
import com.data.structures.examples.Practice.Trees.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class BTreeInorderTraversalLCTest {
    @Autowired
    BTreeInorderTraversalLC binaryTreeInorderTraversal;

    @Test
    public void testBTreeInorderTraversalRecursivelyCase1() {
        TreeNode root = new TreeNode(1);
        root.setRight(new TreeNode(2));
        root.getRight().setLeft(new TreeNode(3));
        List<Integer> results = binaryTreeInorderTraversal.inorderTraversalRecursively(root);
        System.out.println(results);
        assertArrayEquals(new int[]{1, 3, 2}, results.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void testBTreeInorderTraversalRecursivelyCase2() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));

        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));

        root.getLeft().getRight().setLeft(new TreeNode(6));
        root.getLeft().getRight().setRight(new TreeNode(7));

        root.getRight().setRight(new TreeNode(8));
        root.getRight().getRight().setLeft(new TreeNode(9));

        List<Integer> results = binaryTreeInorderTraversal.inorderTraversalRecursively(root);
        System.out.println(results);
        assertArrayEquals(new int[]{4,2,6,5,7,1,3,9,8}, results.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void testBTreeInorderTraversalIterativelyCase1() {
        TreeNode root = new TreeNode(1);
        root.setRight(new TreeNode(2));
        root.getRight().setLeft(new TreeNode(3));
        List<Integer> results = binaryTreeInorderTraversal.inorderTraversal(root);
        System.out.println(results);
        assertArrayEquals(new int[]{1, 3, 2}, results.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void testBTreeInorderTraversalIterativelyCase2() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));

        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));

        root.getLeft().getRight().setLeft(new TreeNode(6));
        root.getLeft().getRight().setRight(new TreeNode(7));

        root.getRight().setRight(new TreeNode(8));
        root.getRight().getRight().setLeft(new TreeNode(9));

        List<Integer> results = binaryTreeInorderTraversal.inorderTraversal(root);
        System.out.println(results);
        assertArrayEquals(new int[]{4,2,6,5,7,1,3,9,8}, results.stream().mapToInt(Integer::intValue).toArray());
    }
}
