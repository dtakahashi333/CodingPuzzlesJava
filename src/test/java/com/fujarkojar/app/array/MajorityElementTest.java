package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve() {
    }

    @Test
    void solveByBoyerMoore() {
        int[] nums = {1, 1, 2, 3, 2, 1};
        int expected = 1;
        assertEquals(expected, MajorityElement.solveByBoyerMoore(nums));
    }
}