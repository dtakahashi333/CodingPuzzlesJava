package com.fujarkojar.app.bitmanipulation;

// 137. Single Number II
// https://leetcode.com/problems/single-number-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class SingleNumber2 {

    /**
     * @param nums A non-empty array of integers
     * @return A single one where every element appears twice except for one
     */
    public static int solve(int[] nums) {
        int ones = 0, twos = 0;
        for (int i = 0; i < nums.length; i++) {
            twos = twos ^ (ones & nums[i]);
            ones = nums[i] ^ ones;

            int commonBits = ones & twos;
            ones = ones & ~commonBits;
            twos = twos & ~commonBits;
        }
        return ones;
    }
}
