package com.data.structures.examples.Practice.Trees;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Service
public class BTreeLevelOrderTraversalLC {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) q.offer(root);

        while (!q.isEmpty()) {
            List<Integer> currLevelVals = new ArrayList<>();
            int currLevelSize = q.size();

            while (currLevelSize > 0) {
                root = q.poll();
                currLevelVals.add(root.val);
                if (root.left != null) q.offer(root.left);
                if (root.right != null) q.offer(root.right);
                currLevelSize--;
            }

            results.add(currLevelVals);
        }

        return results;
    }

}
