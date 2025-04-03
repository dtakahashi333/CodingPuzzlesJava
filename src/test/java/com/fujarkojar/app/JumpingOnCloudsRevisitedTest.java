package com.fujarkojar.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class JumpingOnCloudsRevisitedTest {

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testSolve() {
        int t = 2;
        int[] n = {8, 10};
        int[] k = {2, 3};
        int[][] c = {{0, 0, 1, 0, 0, 1, 1, 0}, {1, 1, 1, 0, 1, 1, 0, 0, 0, 0}};
        int[] a = {92, 80};
        int[] output = new int[t];
        for (int i = 0; i < t; ++i) {
            output[i] = JumpingOnCloudsRevisited.solve(c[i], k[i]);
        }
        assertArrayEquals(a, output);
    }
}