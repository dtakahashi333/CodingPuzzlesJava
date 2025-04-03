package com.fujarkojar.app.kadanesalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByBruteForce1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        assertEquals(expected, MaximumSubarray.solveByBruteForce(nums));
    }

    @Test
    void solve1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        assertEquals(expected, MaximumSubarray.solve(nums));
    }
}