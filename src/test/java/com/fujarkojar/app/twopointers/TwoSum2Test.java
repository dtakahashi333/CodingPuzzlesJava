package com.fujarkojar.app.twopointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum2Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        assertArrayEquals(expected, TwoSum2.solve(numbers, target));
    }

    @Test
    void solve2() {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] expected = {1, 3};
        assertArrayEquals(expected, TwoSum2.solve(numbers, target));
    }

    @Test
    void solve3() {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] expected = {1, 2};
        assertArrayEquals(expected, TwoSum2.solve(numbers, target));
    }

    @Test
    void solveByTwoPointers1() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        assertArrayEquals(expected, TwoSum2.solve(numbers, target));
    }

    @Test
    void solveByTwoPointers2() {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] expected = {1, 3};
        assertArrayEquals(expected, TwoSum2.solve(numbers, target));
    }

    @Test
    void solveByTwoPointers3() {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] expected = {1, 2};
        assertArrayEquals(expected, TwoSum2.solve(numbers, target));
    }
}