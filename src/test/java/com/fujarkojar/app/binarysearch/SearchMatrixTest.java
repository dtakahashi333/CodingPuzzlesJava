package com.fujarkojar.app.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchMatrixTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean expected = true;
        assertEquals(expected, SearchMatrix.solve(matrix, target));
    }

    @Test
    void solve2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        boolean expected = false;
        assertEquals(expected, SearchMatrix.solve(matrix, target));
    }
}