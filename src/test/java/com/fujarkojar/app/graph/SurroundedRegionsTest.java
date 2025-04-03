package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegionsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        char[][] expected = {{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}};
        SurroundedRegions.solve(board);
        assertArrayEquals(expected, board);
    }

    @Test
    void solve2() {
        char[][] board = {{'X', 'O', 'X', 'O', 'X', 'O'}, {'O', 'X', 'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'O', 'X', 'O'}, {'O', 'X', 'O', 'X', 'O', 'X'}};
        char[][] expected = {{'X', 'O', 'X', 'O', 'X', 'O'}, {'O', 'X', 'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X', 'X', 'O'}, {'O', 'X', 'O', 'X', 'O', 'X'}};
        SurroundedRegions.solve(board);
        assertArrayEquals(expected, board);
    }
//    {'X', 'O', 'X', 'O', 'X', 'O'},
//    {'O', 'X', 'O', 'X', 'O', 'X'},
//    {'X', 'O', 'X', 'O', 'X', 'O'},
//    {'O', 'X', 'O', 'X', 'O', 'X'}
}