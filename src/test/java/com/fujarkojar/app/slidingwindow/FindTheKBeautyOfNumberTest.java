package com.fujarkojar.app.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheKBeautyOfNumberTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int num = 240;
        int k = 2;
        int expected = 2;
        assertEquals(expected, FindTheKBeautyOfNumber.solve(num, k));
    }

    @Test
    void solve2() {
        int num = 430043;
        int k = 2;
        int expected = 2;
        assertEquals(expected, FindTheKBeautyOfNumber.solve(num, k));
    }

    @Test
    void solve3() {
        int num = 765;
        int k = 3;
        int expected = 1;
        assertEquals(expected, FindTheKBeautyOfNumber.solve(num, k));
    }
}