package com.fujarkojar.app.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintAllPermutationsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] ar = {1, 2, 3, 4};
        PrintAllPermutations.solve(ar);
    }
}