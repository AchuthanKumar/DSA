package com.data.structures.examples.Practice.Trees;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Service
public class BTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightViewResults = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) q.offer(root);

        while (!q.isEmpty()) {
            int currLevelSize = q.size();

            while(currLevelSize > 0){
                root = q.poll();
                if(currLevelSize==1) rightViewResults.add(root.val); //To pick last node of the level
                if(root.left != null) q.offer(root.left);
                if(root.right != null) q.offer(root.right);
                currLevelSize--;
            }

        }

        return rightViewResults;
    }
}
