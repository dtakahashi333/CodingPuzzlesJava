package com.fujarkojar.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RandomShuffleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve() {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] shuffled = RandomShuffle.solve(ar);
        System.out.println(Arrays.toString(shuffled));
    }
}