package com.fujarkojar.app.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogestNiceSubstringTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        String s = "YazaAay";
        String expected = "aAa";
        assertEquals(expected, LogestNiceSubstring.solve(s));
    }

    @Test
    void solve2() {
        String s = "Bb";
        String expected = "Bb";
        assertEquals(expected, LogestNiceSubstring.solve(s));
    }

    @Test
    void solve3() {
        String s = "c";
        String expected = "";
        assertEquals(expected, LogestNiceSubstring.solve(s));
    }

    @Test
    void solveByChatGPT1() {
        String s = "YazaAay";
        String expected = "aAa";
        assertEquals(expected, LogestNiceSubstring.solveByChatGPT(s));
    }

    @Test
    void solveByChatGPT2() {
        String s = "Bb";
        String expected = "Bb";
        assertEquals(expected, LogestNiceSubstring.solveByChatGPT(s));
    }

    @Test
    void solveByChatGPT3() {
        String s = "c";
        String expected = "";
        assertEquals(expected, LogestNiceSubstring.solveByChatGPT(s));
    }
}