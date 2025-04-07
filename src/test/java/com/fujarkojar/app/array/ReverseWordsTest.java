package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        String s = "the sky is blue";
        String expected = "blue is sky the";
        assertEquals(expected, ReverseWords.solve(s));
    }

    @Test
    void solve2() {
        String s = "  hello world  ";
        String expected = "world hello";
        assertEquals(expected, ReverseWords.solve(s));
    }

    @Test
    void solve3() {
        String s = "a good   example";
        String expected = "example good a";
        assertEquals(expected, ReverseWords.solve(s));
    }
}