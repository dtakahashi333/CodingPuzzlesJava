package com.fujarkojar.app.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAverageSubarray1Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected = 12.75000;
        assertEquals(expected, MaxAverageSubarray1.solve(nums, k));
    }

    @Test
    void solve2() {
        int[] nums = {5};
        int k = 1;
        double expected = 5.00000;
        assertEquals(expected, MaxAverageSubarray1.solve(nums, k));
    }

    @Test
    void solve3() {
        int[] nums = {-1};
        int k = 1;
        double expected = -1.00000;
        assertEquals(expected, MaxAverageSubarray1.solve(nums, k));
    }
}