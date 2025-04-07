package com.fujarkojar.app.twopointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;
        assertEquals(expected, ValidPalindrome.solve(s));
    }
}