package com.fujarkojar.app.bitmanipulation;

// 136. Single Number
// https://leetcode.com/problems/single-number/?envType=study-plan-v2&envId=top-interview-150
public class SingleNumber {

    /**
     * @param nums A non-empty array of integers
     * @return A single one where every element appears twice except for one
     */
    public static int solve(int[] nums) {
        // XOR Property:
        // The XOR operator (^ in Java) has some key properties that make it ideal for this problem:
        //  1. a ^ a = 0: XORing a number with itself always results in 0.
        //  2. a ^ 0 = a: XORing a number with 0 leaves the number unchanged.
        //  3. XOR is commutative and associative: The order in which you apply XOR doesn't matter.
        //     That is, a ^ b ^ c is the same as c ^ a ^ b.
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
