package com.fujarkojar.app.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSizeSubarraySumTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int expected = 2;
        assertEquals(expected, MinSizeSubarraySum.solve(target, nums));
    }

    @Test
    void solve2() {
        int target = 4;
        int[] nums = {1, 4, 4};
        int expected = 1;
        assertEquals(expected, MinSizeSubarraySum.solve(target, nums));
    }

    @Test
    void solve3() {
        int target = 11;
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 0;
        assertEquals(expected, MinSizeSubarraySum.solve(target, nums));
    }
}