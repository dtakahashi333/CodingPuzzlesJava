package com.fujarkojar.app.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestHarmoniousSubsequenceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByBruteForce1() {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int expected = 5;
        assertEquals(expected, LongestHarmoniousSubsequence.solveByBruteForce(nums));
    }

    @Test
    void solveByBruteForce2() {
        int[] nums = {1, 2, 3, 4};
        int expected = 2;
        assertEquals(expected, LongestHarmoniousSubsequence.solveByBruteForce(nums));
    }

    @Test
    void solveByBruteForce3() {
        int[] nums = {1, 1, 1, 1};
        int expected = 0;
        assertEquals(expected, LongestHarmoniousSubsequence.solveByBruteForce(nums));
    }

    @Test
    void solve1() {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int expected = 5;
        assertEquals(expected, LongestHarmoniousSubsequence.solve(nums));
    }

    @Test
    void solve2() {
        int[] nums = {1, 2, 3, 4};
        int expected = 2;
        assertEquals(expected, LongestHarmoniousSubsequence.solve(nums));
    }

    @Test
    void solve3() {
        int[] nums = {1, 1, 1, 1};
        int expected = 0;
        assertEquals(expected, LongestHarmoniousSubsequence.solve(nums));
    }
}