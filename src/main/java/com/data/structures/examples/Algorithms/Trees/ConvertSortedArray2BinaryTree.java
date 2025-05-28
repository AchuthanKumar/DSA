package com.data.structures.examples.Algorithms.Trees;

import com.data.structures.examples.DataStructures.Trees.BinaryTreeNode;
import org.springframework.stereotype.Service;

@Service
public class ConvertSortedArray2BinaryTree {
    public BinaryTreeNode sortedArrayToBST(int[] nums) {
        return generateBinaryTree(nums, 0, nums.length - 1);
    }

    private BinaryTreeNode generateBinaryTree(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;

        BinaryTreeNode node = new BinaryTreeNode(nums[mid]);
        node.left = generateBinaryTree(nums, left, mid - 1);
        node.right = generateBinaryTree(nums, mid + 1, right);
        return node;
    }

//    public String displayBinaryTree(BinaryTreeNode root) {
//        if (root == null) return "";
//
//        StringBuilder sb = new StringBuilder();
//        while (root != null) {
//            sb.append(root.data + " ");
//            if (root.left != null)
//                root = root.left;
//            else if (root.right != null)
//                root = root.right;
//        }
//    }
}
