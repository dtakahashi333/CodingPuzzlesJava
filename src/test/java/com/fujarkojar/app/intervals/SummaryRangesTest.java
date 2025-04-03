package com.fujarkojar.app.intervals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] nums = {0, 1, 2, 4, 5, 7, 9, 10, 12, 14, 15, 16, 27, 28};
        List<String> expected = Arrays.asList(new String[]{"0->2", "4->5", "7", "9->10", "12", "14->16", "27->28"});
        assertIterableEquals(expected, SummaryRanges.solve(nums));
    }
}