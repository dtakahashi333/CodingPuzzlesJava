package com.fujarkojar.app.bitmanipulation;

// 191. Number of 1 Bits
// https://leetcode.com/problems/number-of-1-bits/description/?envType=study-plan-v2&envId=top-interview-150
public class NumberOfOneBits {

    /**
     * @param n A positive integer
     * @return The number of set bits in its binary representation
     */
    public static int solve(int n) {
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if ((n & 1) > 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
