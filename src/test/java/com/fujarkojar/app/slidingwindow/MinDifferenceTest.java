package com.fujarkojar.app.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinDifferenceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] nums = {90};
        int k = 1;
        int expected = 0;
        assertEquals(expected, MinDifference.solve(nums, k));
    }

    @Test
    void solve2() {
        int[] nums = {9,4,1,7};
        int k = 2;
        int expected = 2;
        assertEquals(expected, MinDifference.solve(nums, k));
    }
}