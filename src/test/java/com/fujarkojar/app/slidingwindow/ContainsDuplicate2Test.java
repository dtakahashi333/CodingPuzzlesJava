package com.fujarkojar.app.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicate2Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByBruteForce1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean expected = true;
        assertEquals(expected, ContainsDuplicate2.solveByBruteForce(nums, k));
    }

    @Test
    void solveByBruteForce2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        boolean expected = true;
        assertEquals(expected, ContainsDuplicate2.solveByBruteForce(nums, k));
    }

    @Test
    void solveByBruteForce3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean expected = false;
        assertEquals(expected, ContainsDuplicate2.solveByBruteForce(nums, k));
    }

    @Test
    void solveByBruteForce4() {
        int[] nums = {99, 99};
        int k = 2;
        boolean expected = true;
        assertEquals(expected, ContainsDuplicate2.solveByBruteForce(nums, k));
    }

    @Test
    void solve1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean expected = true;
        assertEquals(expected, ContainsDuplicate2.solve(nums, k));
    }

    @Test
    void solve2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        boolean expected = true;
        assertEquals(expected, ContainsDuplicate2.solve(nums, k));
    }

    @Test
    void solve3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean expected = false;
        assertEquals(expected, ContainsDuplicate2.solve(nums, k));
    }

    @Test
    void solve4() {
        int[] nums = {99, 99};
        int k = 2;
        boolean expected = true;
        assertEquals(expected, ContainsDuplicate2.solve(nums, k));
    }
}