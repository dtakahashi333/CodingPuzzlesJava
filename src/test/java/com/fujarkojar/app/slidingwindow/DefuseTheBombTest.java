package com.fujarkojar.app.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefuseTheBombTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] code = {5, 7, 1, 4};
        int k = 3;
        int[] expected = {12, 10, 16, 13};
        assertArrayEquals(expected, DefuseTheBomb.solve(code, k));
    }

    @Test
    void solve2() {
        int[] code = {1, 2, 3, 4};
        int k = 0;
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, DefuseTheBomb.solve(code, k));
    }

    @Test
    void solve3() {
        int[] code = {2, 4, 9, 3};
        int k = -2;
        int[] expected = {12, 5, 6, 13};
        assertArrayEquals(expected, DefuseTheBomb.solve(code, k));
    }
}