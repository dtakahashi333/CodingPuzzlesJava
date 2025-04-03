package com.fujarkojar.app.array;

import java.util.Arrays;

// 45. Jump Game II
// https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class JumpGame2 {

    /**
     * @param nums 0-indexed array of integers
     * @return The minimum number of jumps to reach nums[n - 1]
     */
    public static int solve(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }

    private static int helper(int[] nums, int i, int[] dp) {
        if (i >= nums.length - 1) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int jumps = nums[i];
        int minCount = (int) Math.pow(10, 9);
        for (int j = 1; j <= jumps; j++) {
            minCount = Math.min(minCount, 1 + helper(nums, i + j, dp));
        }
        dp[i] = minCount;
        return minCount;
    }

    /**
     * @param nums 0-indexed array of integers
     * @return The minimum number of jumps to reach nums[n - 1]
     */
    public static int solveByGreedy(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int count = 0;
        int currentEnd = 0; // end of the current jump range
        int farthest = 0; // farthest index we can reach
        for (int i = 0; i < nums.length; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                currentEnd = farthest;
                count++;
                if (farthest >= nums.length - 1) {
                    break;
                }
            }
        }
        return count;
    }
}
