package com.fujarkojar.app.slidingwindow;

// 2760. Longest Even Odd Subarray With Threshold
// https://leetcode.com/problems/longest-even-odd-subarray-with-threshold/description/
public class LongestAlternatingSubarray {

    /**
     * @param nums      A 0-indexed integer array
     * @param threshold An integer
     * @return The length of the longest alternating subarray
     */
    public static int solve(int[] nums, int threshold) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0;
        int longest = 0;
        while (l < nums.length) {
            if (nums[l] <= threshold && nums[l] % 2 == 0) {
                int r = l;
                while (r + 1 < nums.length && nums[r + 1] <= threshold && nums[r] % 2 != nums[r + 1] % 2) {
                    r++;
                }
                longest = Math.max(longest, r - l + 1);
            }
            l++;
        }
        return longest;
    }
}
