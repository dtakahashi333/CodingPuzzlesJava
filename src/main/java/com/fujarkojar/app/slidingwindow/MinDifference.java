package com.fujarkojar.app.slidingwindow;

import java.util.Arrays;

// 1984. Minimum Difference Between Highest and Lowest of K Scores
// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/
public class MinDifference {

    public static int solve(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int startIndex = 0;
        int endIndex = startIndex + k - 1;
        int minDifference = Integer.MAX_VALUE;
        for (; endIndex < n; startIndex++, endIndex++) {
            minDifference = Math.min(minDifference, nums[endIndex] - nums[startIndex]);
        }
        return minDifference == Integer.MAX_VALUE ? 0 : minDifference;
    }
}
