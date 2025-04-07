package com.fujarkojar.app.intervals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, MergeIntervals.solve(intervals));
    }

    @Test
    void solve2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        assertArrayEquals(expected, MergeIntervals.solve(intervals));
    }

    @Test
    void solve3() {
        int[][] intervals = {{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};
        int[][] expected = {{1, 10}};
        assertArrayEquals(expected, MergeIntervals.solve(intervals));
    }
}