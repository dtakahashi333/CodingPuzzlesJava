package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame2Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] nums = {2, 3, 1, 1, 4};
        int expected = 2;
        assertEquals(expected, JumpGame2.solve(nums));
    }

    @Test
    void solve2() {
        int[] nums = {2, 3, 0, 1, 4};
        int expected = 2;
        assertEquals(expected, JumpGame2.solve(nums));
    }

    @Test
    void solve3() {
        int[] nums = {1, 1, 1, 1, 1};
        int expected = 4;
        assertEquals(expected, JumpGame2.solve(nums));
    }

    @Test
    void solveByGreedy1() {
        int[] nums = {2, 3, 1, 1, 4};
        int expected = 2;
        assertEquals(expected, JumpGame2.solveByGreedy(nums));
    }

    @Test
    void solveByGreedy3() {
        int[] nums = {1};
        int expected = 0;
        assertEquals(expected, JumpGame2.solveByGreedy(nums));
    }

    @Test
    void solveByGreedy4() {
        int[] nums = {7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3};
        int expected = 2;
        assertEquals(expected, JumpGame2.solveByGreedy(nums));
    }

    @Test
    void solveByGreedy5() {
        int[] nums = {1, 2};
        int expected = 1;
        assertEquals(expected, JumpGame2.solveByGreedy(nums));
    }
}