package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.springframework.stereotype.Service;

@Service
public class SameTreeValidation {
    public boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q) {
        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if(q.data != p.data) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
