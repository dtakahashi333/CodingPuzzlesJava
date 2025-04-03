package com.fujarkojar.app.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        assertEquals(expected, SearchInsertPosition.solve(nums, target));
    }

    @Test
    void solve2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;
        assertEquals(expected, SearchInsertPosition.solve(nums, target));
    }

    @Test
    void solve3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        assertEquals(expected, SearchInsertPosition.solve(nums, target));
    }
}