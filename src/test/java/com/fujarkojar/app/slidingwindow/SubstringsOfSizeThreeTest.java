package com.fujarkojar.app.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringsOfSizeThreeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        String s = "xyzzaz";
        int expected = 1;
        assertEquals(expected, SubstringsOfSizeThree.solve(s));
    }

    @Test
    void solve2() {
        String s = "aababcabc";
        int expected = 4;
        assertEquals(expected, SubstringsOfSizeThree.solve(s));
    }

    @Test
    void solve3() {
        String s = "ylqosyvvmroovnulaesxeghhhcvuagiicrbujm";
        int expected = 27;
        assertEquals(expected, SubstringsOfSizeThree.solve(s));
    }

    @Test
    void solveByOptimal1() {
        String s = "xyzzaz";
        int expected = 1;
        assertEquals(expected, SubstringsOfSizeThree.solveByOptimal(s));
    }

    @Test
    void solveByOptimal2() {
        String s = "aababcabc";
        int expected = 4;
        assertEquals(expected, SubstringsOfSizeThree.solveByOptimal(s));
    }

    @Test
    void solveByOptimal3() {
        String s = "ylqosyvvmroovnulaesxeghhhcvuagiicrbujm";
        int expected = 27;
        assertEquals(expected, SubstringsOfSizeThree.solveByOptimal(s));
    }
}