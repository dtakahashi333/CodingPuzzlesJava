package com.fujarkojar.app.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] digits = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        assertArrayEquals(expected, PlusOne.solve(digits));
    }

    @Test
    void solve2() {
        int[] digits = {9};
        int[] expected = {1, 0};
        assertArrayEquals(expected, PlusOne.solve(digits));
    }
}