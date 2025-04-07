package com.fujarkojar.app.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTrailingZerosTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int n = 5;
        int expected = 1;
        assertEquals(expected, FactorialTrailingZeros.solve(n));
    }

    @Test
    void solve2() {
        int n = 13;
        int expected = 2;
        assertEquals(expected, FactorialTrailingZeros.solve(n));
    }

    @Test
    void solve3() {
        int n = 7;
        int expected = 1;
        assertEquals(expected, FactorialTrailingZeros.solve(n));
    }
}