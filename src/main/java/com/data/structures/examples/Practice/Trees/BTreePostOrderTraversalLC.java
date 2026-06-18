package com.data.structures.examples.Practice.Trees;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Service
public class BTreePostOrderTraversalLC {

    //    Traverse Tree nodes: left -> right -> root
    //    Solve as Pre-Order : root -> right -> left, then invert the solution in order
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> resultStack = new Stack<>();

        if (root != null) stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            resultStack.add(root.val);

            if (root.left != null) stack.push(root.left);
            if (root.right != null) stack.push(root.right);
        }

        while (!resultStack.isEmpty()) {
            results.add(resultStack.pop());
        }

        return results;
    }
}
