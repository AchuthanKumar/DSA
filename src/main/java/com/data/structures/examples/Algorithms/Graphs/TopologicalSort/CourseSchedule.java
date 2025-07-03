package com.data.structures.examples.Algorithms.Graphs.TopologicalSort;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Service
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int course2complete = 0;

        for (int i = 0; i < numCourses; i++) {
            graph.add(new LinkedList<>());
        }

        for (int[] preRequisite : prerequisites) {
            int course = preRequisite[0], prereq = preRequisite[1];
            graph.get(prereq).add(course);
            indegree[course]++;
        }

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0)
                queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            course2complete++;

            for (int neighbor : graph.get(curr)) {
                indegree[neighbor]--;

                if (indegree[neighbor] == 0)
                    queue.offer(neighbor);
            }
        }

        return course2complete == numCourses;
    }
}
