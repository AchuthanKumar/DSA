package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostOrderTraversal {
    public List<Integer> postOrderTraversal(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        performRecursivePostOrderTraversal(root, list);
        return list;
    }

    private void performRecursivePostOrderTraversal(BinaryTreeNode root, List<Integer> list) {
        if (root.left != null)
            performRecursivePostOrderTraversal(root.left, list);
        if (root.right != null)
            performRecursivePostOrderTraversal(root.right, list);
        list.add(root.data);
    }
}
