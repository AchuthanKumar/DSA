package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InOrderTraversal {
    public List<Integer> inOrderTraversal(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        performRecursiveInOrderTraversal(root, list);
        return list;
    }

    private void performRecursiveInOrderTraversal(BinaryTreeNode root, List<Integer> list) {
        if (root.left != null)
            performRecursiveInOrderTraversal(root.left, list);
        list.add(root.data);
        if (root.right != null)
            performRecursiveInOrderTraversal(root.right, list);
    }
}
