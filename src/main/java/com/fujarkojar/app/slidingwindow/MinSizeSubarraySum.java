package com.fujarkojar.app.slidingwindow;

// 209. Minimum Size Subarray Sum
// https://leetcode.com/problems/minimum-size-subarray-sum/description/
public class MinSizeSubarraySum {

    public static int solve(int target, int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = 0;
        int sum = 0;
        int maxSize = Integer.MAX_VALUE;
        for (; end < n; ++end) {
            sum += nums[end];

            while (sum >= target) {
                int size = end - start + 1;
                maxSize = Integer.min(maxSize, size);
                sum -= nums[start];
                start++;
            }
        }
        return (maxSize == Integer.MAX_VALUE) ? 0 : maxSize;
    }
}
