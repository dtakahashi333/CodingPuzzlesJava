package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakesAndLaddersTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[][] board = {
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };
        int expected = 4;
        assertEquals(expected, SnakesAndLadders.solve(board));
    }

    @Test
    void solve2() {
        int[][] board = {
                {-1, -1},
                {-1, 3}
        };
        int expected = 1;
        assertEquals(expected, SnakesAndLadders.solve(board));
    }

    @Test
    void solve3() {
        int[][] board = {
                {-1, -1, -1},
                {-1, 9, 8},
                {-1, 8, 9}
        };
        int expected = 1;
        assertEquals(expected, SnakesAndLadders.solve(board));
    }

    @Test
    void solve4() {
        int[][] board = {
                {-1, -1, -1, 46, 47, -1, -1, -1},
                {51, -1, -1, 63, -1, 31, 21, -1},
                {-1, -1, 26, -1, -1, 38, -1, -1},
                {-1, -1, 11, -1, 14, 23, 56, 57},
                {11, -1, -1, -1, 49, 36, -1, 48},
                {-1, -1, -1, 33, 56, -1, 57, 21},
                {-1, -1, -1, -1, -1, -1, 2, -1},
                {-1, -1, -1, 8, 3, -1, 6, 56}
        };
        int expected = 4;
        assertEquals(expected, SnakesAndLadders.solve(board));
    }
}