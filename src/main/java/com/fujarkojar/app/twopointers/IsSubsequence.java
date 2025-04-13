package com.fujarkojar.app.twopointers;

// 392. Is Subsequence
// https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
public class IsSubsequence {

    /**
     * @param s A string
     * @param t A string
     * @return true if s is a subsequence of t, or false otherwise
     */
    public static boolean solve(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i >= s.length();
    }
}
