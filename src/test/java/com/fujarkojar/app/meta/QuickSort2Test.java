package com.fujarkojar.app.meta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSort2Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve() {
        int[] ar = {5, 8, 1, 3, 7, 9, 2};
        int[] expected = {1, 2, 3, 5, 7, 8, 9};
        QuickSort2.solve(ar);
        assertArrayEquals(expected, ar);
    }
}