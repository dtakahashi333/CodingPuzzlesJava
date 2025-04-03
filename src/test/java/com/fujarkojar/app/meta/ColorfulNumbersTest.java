package com.fujarkojar.app.meta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorfulNumbersTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int number = 3245;
        boolean expected = true;
        assertEquals(expected, ColorfulNumbers.solve(number));
    }

    @Test
    void solve2() {
        int number = 326;
        boolean expected = true;
        assertEquals(expected, ColorfulNumbers.solve(number));
    }
}