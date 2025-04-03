package com.fujarkojar.app.slidingwindow;

// 2379. Minimum Recolors to Get K Consecutive Black Blocks
// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
public class MinimumRecolors {

    /**
     * @param blocks A 0-indexed string blocks
     * @param k      The desired number of consecutive black blocks
     * @return The minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
     */
    public static int solveByBruteForce(String blocks, int k) {
        int start = 0, end = k - 1;
        int minOperations = Integer.MAX_VALUE;
        while (end < blocks.length()) {
            int operations = 0;
            for (int i = start; i <= end; i++) {
                if (blocks.charAt(i) == 'W') {
                    operations++;
                }
            }
            minOperations = Math.min(minOperations, operations);
            if (minOperations == 0) {
                return 0;
            }
            start++;
            end++;
        }
        return minOperations;
    }

    public static int solve(String blocks, int k) {
        int start = 0, end = k - 1;
        int minOperations = 0;
        for (int i = start; i <= end; i++) {
            if (blocks.charAt(i) == 'W') {
                minOperations++;
            }
        }
        int operations = minOperations;
        while (end < blocks.length() - 1) {
            if (blocks.charAt(start) == 'W') {
                operations--;
            }
            if (blocks.charAt(end + 1) == 'W') {
                operations++;
            }
            minOperations = Math.min(minOperations, operations);
            if (minOperations == 0) {
                return 0;
            }
            start++;
            end++;
        }
        return minOperations;
    }
}
