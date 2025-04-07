package com.fujarkojar.app.twopointers;

// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
public class ValidPalindrome {

    /**
     * @param s A string
     * @return true if it is a palindrome, or false otherwise
     */
    public static boolean solve(String s) {
        s = s.trim();
        if (s.isEmpty()) return true;
        int startIndex = 0;
        int endIndex = s.length() - 1;
        while (startIndex < endIndex) {
            while (startIndex < s.length() && !Character.isLetterOrDigit(s.charAt(startIndex))) {
                startIndex++;
            }
            if (startIndex > s.length() - 1) break;
            while (endIndex >= 0 && !Character.isLetterOrDigit(s.charAt(endIndex))) {
                endIndex--;
            }
            if (endIndex < 0) break;
            if (startIndex <= endIndex) {
                if (Character.toLowerCase(s.charAt(startIndex)) != Character.toLowerCase(s.charAt(endIndex))) {
                    return false;
                }
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
