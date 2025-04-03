package com.fujarkojar.app.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int n = 4;
        int k = 2;
        List<List<Integer>> combinations = Combinations.solve(n, k);
    }
}