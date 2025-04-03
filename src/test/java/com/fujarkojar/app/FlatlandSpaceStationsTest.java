package com.fujarkojar.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatlandSpaceStationsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByBruteForce() {
    }

    @Test
    void solve1() {
        int n = 100;
        int[] c = {93, 41, 91, 61, 30, 6, 25, 90, 97};
        int expected = 14;
        assertEquals(expected, FlatlandSpaceStations.solve(n, c));
    }

    @Test
    void solve2() {
        int n = 100;
        int[] c = {0};
        int expected = 99;
        assertEquals(expected, FlatlandSpaceStations.solve(n, c));
    }
}