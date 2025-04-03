package com.fujarkojar.app.meta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSort2Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve() {
        int n = 7;
        Integer[] arr = {3, 4, 7, 5, 6, 2, 1};
        InsertionSort2.solve(n, Arrays.asList(arr));
    }
}