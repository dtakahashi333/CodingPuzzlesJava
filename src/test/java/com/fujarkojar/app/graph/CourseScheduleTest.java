package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int numCourses = 2;
        int[][] prerequisites = {{0, 1}};
        boolean expected = true;
        assertEquals(expected, CourseSchedule.solve(numCourses, prerequisites));
    }
}