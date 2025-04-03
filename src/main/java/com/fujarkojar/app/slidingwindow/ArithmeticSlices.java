package com.fujarkojar.app.slidingwindow;

// 413. Arithmetic Slices
// https://leetcode.com/problems/arithmetic-slices/description/
public class ArithmeticSlices {

    public static int solveByBruteForce(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; ++i) {
            // Check if the difference between any two consecutive elements is the same
            // for the first three elements in the array.
            if (i + 2 < n && nums[i + 1] - nums[i] == nums[i + 2] - nums[i + 1]) {
                count++;
                int dif = nums[i + 1] - nums[i];
                int j = i + 2;
                for (; j + 1 < n; ++j) {
                    if (nums[j + 1] - nums[j] == dif) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static int solve(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Edge case: if there are fewer than 3 elements, no arithmetic subarray is possible.
        if (n < 3) {
            return 0;
        }

        int length = 0;  // This will track the length of the current arithmetic subarray

        // Traverse through the array starting from index 2 (since we're comparing three elements at a time)
        for (int i = 2; i < n; i++) {
            // Check if the current element continues the arithmetic sequence
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                length++;  // Extend the current arithmetic subarray
                count += length;  // Add the number of subarrays that can be formed from this length
            } else {
                length = 0;  // Reset the length if it's not an arithmetic sequence
            }
        }

        return count;
    }
}
