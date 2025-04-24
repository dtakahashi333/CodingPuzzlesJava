package com.fujarkojar.app.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, FindFirstAndLastPosition.solve(nums, target));
    }

    @Test
    void solve2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, FindFirstAndLastPosition.solve(nums, target));
    }

    @Test
    void solve3() {
        int[] nums = {};
        int target = 0;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, FindFirstAndLastPosition.solve(nums, target));
    }

    @Test
    void solve4() {
        int[] nums = {1};
        int target = 1;
        int[] expected = {0, 0};
        assertArrayEquals(expected, FindFirstAndLastPosition.solve(nums, target));
    }
}