package com.fujarkojar.app.array;

import java.util.Arrays;

// 2145. Count the Hidden Sequences
// https://leetcode.com/problems/count-the-hidden-sequences/description/?envType=daily-question&envId=2025-04-21
public class HiddenSequence {

    /**
     * @param differences A 0-indexed array of n integers differences
     * @param lower       A lower bound (inclusive)
     * @param upper       A upper bound (inclusive)
     * @return The number of possible hidden sequences there are. If there are no possible sequences, return 0
     */
    public static int solve(int[] differences, int lower, int upper) {
        int n = differences.length;
        long[] hidden = new long[n + 1];
        hidden[0] = 0;
        for (int i = 0; i < n; i++) {
            hidden[i + 1] = hidden[i] + differences[i];
        }
        long minVal = Arrays.stream(hidden).min().orElseThrow();
        long maxVal = Arrays.stream(hidden).max().orElseThrow();
        long count = (upper - lower + 1) - (maxVal - minVal + 1) + 1;
        return (int) Math.max(count, 0);
    }

    /**
     * @param differences A 0-indexed array of n integers differences
     * @param lower       A lower bound (inclusive)
     * @param upper       A upper bound (inclusive)
     * @return The number of possible hidden sequences there are. If there are no possible sequences, return 0
     */
    public static int solveByChatGPT(int[] differences, int lower, int upper) {
        // Optimize space complexity to O(1).
        long sum = 0;
        long minSum = 0;
        long maxSum = 0;

        for (int diff : differences) {
            sum += diff;
            minSum = Math.min(minSum, sum);
            maxSum = Math.max(maxSum, sum);
        }

        long rangeLength = upper - lower + 1;
        long requiredRange = maxSum - minSum + 1;
        long count = rangeLength - requiredRange + 1;

        return (int) Math.max(count, 0);
    }
}
