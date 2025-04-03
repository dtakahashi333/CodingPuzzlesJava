package com.fujarkojar.app.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignCookiesTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] g = {1,2,3};
        int[] s = {1,1};
        int expected = 1;
        assertEquals(expected, AssignCookies.solve(g, s));
    }
}