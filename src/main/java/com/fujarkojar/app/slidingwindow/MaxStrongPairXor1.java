package com.fujarkojar.app.slidingwindow;

// 2932. Maximum Strong Pair XOR I
// https://leetcode.com/problems/maximum-strong-pair-xor-i/description/
public class MaxStrongPairXor1 {

    /**
     * @param nums A 0-indexed integer array
     * @return The maximum XOR value out of all possible strong pairs in the array
     */
    public static int solve(int[] nums) {
        if (nums == null || nums.length <= 0) throw new IllegalArgumentException("Array must not be empty or null.");
        int maxXor = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                    maxXor = Math.max(maxXor, nums[i] ^ nums[j]);
                }
            }
        }
        return maxXor;
    }
}
