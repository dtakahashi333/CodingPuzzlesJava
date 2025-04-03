package com.fujarkojar.app.meta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        String s1 = "cat";
        String s2 = "dog";
        boolean expected = false;
        assertEquals(expected, EditDistance.solve(s1, s2));
    }

    @Test
    void solve2() {
        String s1 = "cat";
        String s2 = "cats";
        boolean expected = true;
        assertEquals(expected, EditDistance.solve(s1, s2));
    }

    @Test
    void solve3() {
        String s1 = "cat";
        String s2 = "cut";
        boolean expected = true;
        assertEquals(expected, EditDistance.solve(s1, s2));
    }

    @Test
    void solve4() {
        String s1 = "cat";
        String s2 = "cast";
        boolean expected = true;
        assertEquals(expected, EditDistance.solve(s1, s2));
    }

    @Test
    void solve5() {
        String s1 = "cat";
        String s2 = "at";
        boolean expected = true;
        assertEquals(expected, EditDistance.solve(s1, s2));
    }

    @Test
    void solve6() {
        String s1 = "cat";
        String s2 = "act";
        boolean expected = false;
        assertEquals(expected, EditDistance.solve(s1, s2));
    }
    
    @Test
    void solve2_1() {
        String s1 = "cat";
        String s2 = "dog";
        boolean expected = false;
        assertEquals(expected, EditDistance.solve2(s1, s2));
    }

    @Test
    void solve2_2() {
        String s1 = "cat";
        String s2 = "cats";
        boolean expected = true;
        assertEquals(expected, EditDistance.solve2(s1, s2));
    }

    @Test
    void solve2_3() {
        String s1 = "cat";
        String s2 = "cut";
        boolean expected = true;
        assertEquals(expected, EditDistance.solve2(s1, s2));
    }

    @Test
    void solve2_4() {
        String s1 = "cat";
        String s2 = "cast";
        boolean expected = true;
        assertEquals(expected, EditDistance.solve2(s1, s2));
    }

    @Test
    void solve2_5() {
        String s1 = "cat";
        String s2 = "at";
        boolean expected = true;
        assertEquals(expected, EditDistance.solve2(s1, s2));
    }

    @Test
    void solve2_6() {
        String s1 = "cat";
        String s2 = "act";
        boolean expected = false;
        assertEquals(expected, EditDistance.solve2(s1, s2));
    }
}