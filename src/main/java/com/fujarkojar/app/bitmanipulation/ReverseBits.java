package com.fujarkojar.app.bitmanipulation;

// 190. Reverse Bits
// https://leetcode.com/problems/reverse-bits/description/?envType=study-plan-v2&envId=top-interview-150
public class ReverseBits {

    /**
     * @param n A 32-bits unsigned integer
     * @return A reversed 32-bits unsigned integer
     */
    public static int solve(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            result += n & 1;
            n = n >> 1;
        }
        return result;
    }
}
