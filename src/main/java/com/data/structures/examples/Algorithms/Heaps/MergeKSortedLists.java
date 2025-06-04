package com.data.structures.examples.Algorithms.Heaps;

import com.data.structures.examples.DataStructures.SinglyLinkedLists.SLLNode;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.PriorityQueue;

@Service
public class MergeKSortedLists {
    public SLLNode mergeKLists(SLLNode[] lists) {
        SLLNode root = new SLLNode(-1);

        PriorityQueue<SLLNode> sortedNodes = new PriorityQueue<>(
                Comparator.comparingInt(n -> n.value)
        );

        for (SLLNode rootOfList : lists) {
            while (rootOfList != null) {
                sortedNodes.offer(rootOfList);
                rootOfList = rootOfList.next;
            }
        }

        SLLNode curr = root;
        while (!sortedNodes.isEmpty()) {
            SLLNode currMin = sortedNodes.poll();
            currMin.next = null;
            curr.next = currMin;
            curr = curr.next;
        }

        return root.next;
    }
}
