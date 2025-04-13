package com.fujarkojar.app.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] nums = {1, 2, 3, 1};
        int expected = 2;
        assertEquals(expected, FindPeakElement.solve(nums));
    }

    @Test
    void solve2() {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int expected = 5;
        assertEquals(expected, FindPeakElement.solve(nums));
    }
}