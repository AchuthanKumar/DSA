package com.data.structures.examples.Algorithms.Graphs;

import com.data.structures.examples.Algorithms.Graphs.TopologicalSort.CourseSchedule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CourseScheduleTest {
    @Autowired
    CourseSchedule courseSchedule;

    @Test
    public void testCourseSchedule() {
        Assertions.assertTrue(courseSchedule.canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    public void testCourseSchedule1() {
        Assertions.assertFalse(courseSchedule.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}
