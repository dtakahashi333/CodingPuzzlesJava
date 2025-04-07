package com.fujarkojar.app.bitmanipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        String a = "11";
        String b = "1";
        String expected = "100";
        assertEquals(expected, AddBinary.solve(a, b));
    }

    @Test
    void solve2() {
        String a = "1010";
        String b = "1011";
        String expected = "10101";
        assertEquals(expected, AddBinary.solve(a, b));
    }
}