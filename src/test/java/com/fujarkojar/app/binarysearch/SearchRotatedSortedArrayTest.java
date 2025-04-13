package com.fujarkojar.app.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRotatedSortedArrayTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int nums[] = {4, 5, 6, 7, 8, 1, 2, 3};
        int target = 8;
        int expected = 4;
        assertEquals(expected, SearchRotatedSortedArray.solve(nums, target));
    }

    @Test
    void solve2() {
        int nums[] = {1, 3};
        int target = 3;
        int expected = 1;
        assertEquals(expected, SearchRotatedSortedArray.solve(nums, target));
    }
}