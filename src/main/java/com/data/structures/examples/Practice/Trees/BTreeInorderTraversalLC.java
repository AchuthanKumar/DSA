package com.data.structures.examples.Practice.Trees;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Service
public class BTreeInorderTraversalLC {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            results.add(root.getVal());

            root = root.right;
        }

        return results;
    }

    public List<Integer> inorderTraversalRecursively(TreeNode root) {
        List<Integer> results = new ArrayList<>();

        return traverseRecursively(root, results);
    }

    private List<Integer> traverseRecursively(TreeNode root, List<Integer> results) {
        //        Base Case
        if (root == null) return results;

        traverseRecursively(root.left, results);
        results.add(root.val);
        traverseRecursively(root.right, results);

        return results;
    }
}
