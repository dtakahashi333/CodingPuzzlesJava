package com.fujarkojar.app.slidingwindow;

// 643. Maximum Average Subarray I
// https://leetcode.com/problems/maximum-average-subarray-i/description/
public class MaxAverageSubarray1 {

    public static double solve(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        double maxAve = Integer.MIN_VALUE;
        for (; right < n; ++right) {
            sum += nums[right];
            int size = right - left + 1;
            if (size > k) {
                sum -= nums[left];
                left++;
                size--;
            }
            if (size == k) {
                maxAve = Math.max(maxAve, (double) sum / k);
            }
        }
        return maxAve;
    }

    public static double solveByChatGPT(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        double maxAve = Integer.MIN_VALUE;

        // Initializing the sum of the first 'k' elements
        for (int i = 0; i < k; ++i) {
            sum += nums[i];
        }

        // Initialize maxAve with the average of the first window
        maxAve = (double) sum / k;

        // Use the sliding window technique
        for (int i = k; i < n; ++i) {
            // Slide the window: subtract the element going out, and add the new element
            sum += nums[i] - nums[i - k];
            maxAve = Math.max(maxAve, (double) sum / k);
        }

        return maxAve;
    }
}
