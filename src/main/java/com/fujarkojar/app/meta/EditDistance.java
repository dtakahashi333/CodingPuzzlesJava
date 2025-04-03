package com.fujarkojar.app.meta;

public class EditDistance {

    public static boolean solve(String s1, String s2) {
        if (s1.length() - s2.length() > 1) {
            return false;
        }
        int i = 0;
        while (i < s1.length() && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }
        if (s1.length() == s2.length()) {
            if (i == s1.length()) {
                return false;
            }
            // Replace
            if (s2.equals(s1.substring(0, i) + s2.charAt(i) + s1.substring(i + 1))) {
                return true;
            }
            if (s2.equals(s2.substring(0, i) + s1.charAt(i) + s2.substring(i + 1))) {
                return true;
            }
        } else {
            if (s1.length() > s2.length()) {
                // Remove
                if (s2.equals(s1.substring(0, i) + s1.substring(i + 1))) {
                    return true;
                }
                // Insert
                if (s1.equals(s2.substring(0, i) + s1.charAt(i) + s2.substring(i + 1))) {
                    return true;
                }
            } else {
                // Remove
                if (s1.equals(s2.substring(0, i) + s2.substring(i + 1))) {
                    return true;
                }
                // Insert
                if (s2.equals(s1.substring(0, i) + s2.charAt(i) + s1.substring(i + 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean solve2(String s1, String s2) {
        if (s1.length() > s2.length()) {
            // Swap the strings to make the length of s2 can be longer than s1.
            String tmp = s1;
            s1 = s2;
            s2 = tmp;
        }
        if (s2.length() - s1.length() > 1) {
            return false;
        }
        boolean sawDifference = false;
        for (int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (sawDifference) {
                    return false;
                }
                sawDifference = true;
                if (s2.length() > s1.length()) {
                    // Only progress index j.
                    i--;
                }
            }
        }
        return true;
    }
}
