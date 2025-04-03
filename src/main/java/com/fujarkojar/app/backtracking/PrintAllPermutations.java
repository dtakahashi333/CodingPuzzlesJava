package com.fujarkojar.app.backtracking;

import java.util.Arrays;

// 46. Permutations
// https://leetcode.com/problems/permutations/?envType=study-plan-v2&envId=top-interview-150
// https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems
public class PrintAllPermutations {

    public static void solve(int[] nums) {
        helper(nums, 0);
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private static void helper(int[] nums, int currentIndex) {
        if (currentIndex > nums.length - 1) {
            System.out.println(Arrays.toString(nums));
        }
        for (int i = currentIndex; i < nums.length; i++) {
            // Swap values.
            swap(nums, i, currentIndex);
            helper(nums, currentIndex + 1);
            // Roll back the array order.
            swap(nums, i, currentIndex);
        }
    }
}
