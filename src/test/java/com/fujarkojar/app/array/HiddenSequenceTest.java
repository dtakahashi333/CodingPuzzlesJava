package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HiddenSequenceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] differences = {1, -3, 4};
        int lower = 1, upper = 6;
        int expected = 2;
        assertEquals(expected, HiddenSequence.solve(differences, lower, upper));
    }
}