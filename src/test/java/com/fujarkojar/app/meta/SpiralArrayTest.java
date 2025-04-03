package com.fujarkojar.app.meta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralArrayTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int n = 3;
        int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        assertArrayEquals(expected, SpiralArray.solve(n));
    }

    @Test
    void solve2() {
        int n = 4;
        int[][] expected = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        assertArrayEquals(expected, SpiralArray.solve(n));
    }

    @Test
    void solve3() {
        int n = 8;
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {28, 29, 30, 31, 32, 33, 34, 9},
                {27, 48, 49, 50, 51, 52, 35, 10},
                {26, 47, 60, 61, 62, 53, 36, 11},
                {25, 46, 59, 64, 63, 54, 37, 12},
                {24, 45, 58, 57, 56, 55, 38, 13},
                {23, 44, 43, 42, 41, 40, 39, 14},
                {22, 21, 20, 19, 18, 17, 16, 15}
        };
        assertArrayEquals(expected, SpiralArray.solve(n));
    }

    @Test
    void solveByGreedy1() {
        int n = 3;
        int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        assertArrayEquals(expected, SpiralArray.solveByGreedy(n));
    }

    @Test
    void solveByGreedy2() {
        int n = 4;
        int[][] expected = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        assertArrayEquals(expected, SpiralArray.solveByGreedy(n));
    }

    @Test
    void solveByGreedy3() {
        int n = 8;
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {28, 29, 30, 31, 32, 33, 34, 9},
                {27, 48, 49, 50, 51, 52, 35, 10},
                {26, 47, 60, 61, 62, 53, 36, 11},
                {25, 46, 59, 64, 63, 54, 37, 12},
                {24, 45, 58, 57, 56, 55, 38, 13},
                {23, 44, 43, 42, 41, 40, 39, 14},
                {22, 21, 20, 19, 18, 17, 16, 15}
        };
        assertArrayEquals(expected, SpiralArray.solveByGreedy(n));
    }
}