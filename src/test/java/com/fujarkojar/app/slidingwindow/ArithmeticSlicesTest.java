package com.fujarkojar.app.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSlicesTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByBruteForce1() {
        int[] nums = {1, 2, 3, 4};
        int expected = 3;
        assertEquals(expected, ArithmeticSlices.solveByBruteForce(nums));
    }

    @Test
    void solveByBruteForce2() {
        int[] nums = {1};
        int expected = 0;
        assertEquals(expected, ArithmeticSlices.solveByBruteForce(nums));
    }

    @Test
    void solveByBruteForce3() {
        int[] nums = {1,2,3,4,8,9,10};
        int expected = 4;
        assertEquals(expected, ArithmeticSlices.solveByBruteForce(nums));
    }
}