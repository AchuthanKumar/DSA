package com.data.structures.examples.Practice.Trees;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Service
public class BTreePreOrderTraversalLC {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root!=null) stack.push(root);

        while(!stack.isEmpty()){
            TreeNode currNode = stack.pop();
            results.add(currNode.val);

            if(currNode.right != null) stack.push(currNode.right);
            if(currNode.left != null) stack.push(currNode.left);
        }

        return results;
    }
}
