package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Service
public class PreOrderTraversal {

    public List<Integer> preOrderTraversal(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        performRecursivePreOrderTraversal(root, list);
        return list;
    }

    private void performRecursivePreOrderTraversal(BinaryTreeNode root, List<Integer> output) {
        output.add(root.data);
        if (root.left != null)
            performRecursivePreOrderTraversal(root.left, output);
        if (root.right != null)
            performRecursivePreOrderTraversal(root.right, output);
    }

    public List<Integer> performIterativePreOrderTraversal(BinaryTreeNode root) {
        List<Integer> output = new ArrayList<>();

        if (root == null)
            return output;

        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            BinaryTreeNode currentNode = stack.pop();
            output.add(currentNode.data);

            if (currentNode.right != null)
                stack.push(currentNode.right);

            if (currentNode.left != null)
                stack.push(currentNode.left);
        }

        return output;
    }
}
