package com.fujarkojar.app.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// 1763. Longest Nice Substring
// https://leetcode.com/problems/longest-nice-substring/description/
public class LogestNiceSubstring {

    public static String solve(String s) {
        int n = s.length();
        for (int i = n - 1; i >= 1; i--) {
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            for (int j = 0; j <= i; j++) {
                int code = (int) s.charAt(j);
                freqMap.put(code, freqMap.getOrDefault(code, 0) + 1);
            }
            int startIndex = 0;
            int endIndex = i;
            while (endIndex < n) {
                boolean isNice = true;
                for (int code : freqMap.keySet()) {
                    if ((65 <= code && code <= 90 && !freqMap.containsKey(code + 32)) ||
                            (97 <= code && code <= 122 && !freqMap.containsKey(code - 32))) {
                        isNice = false;
                        break;
                    }
                }
                if (isNice) {
                    return s.substring(startIndex, endIndex + 1);
                }
                int startChar = s.charAt(startIndex);
                startIndex++;
                freqMap.put(startChar, freqMap.get(startChar) - 1);
                if (freqMap.get(startChar) == 0) {
                    freqMap.remove(startChar);
                }
                endIndex++;
                if (endIndex < n) {
                    int endChar = s.charAt(endIndex);
                    freqMap.put(endChar, freqMap.getOrDefault(endChar, 0) + 1);
                }
            }
        }
        return "";
    }

    public static String solveByChatGPT(String s) {
        int n = s.length();
        if (n < 2) return "";  // Single character cannot be nice

        // Try all substrings and check if they are nice
        for (int length = n; length >= 2; length--) {
            for (int start = 0; start <= n - length; start++) {
                String sub = s.substring(start, start + length);
                if (isNice(sub)) {
                    return sub;
                }
            }
        }
        return "";
    }

    private static boolean isNice(String s) {
        // Use a set to check if both uppercase and lowercase versions of each letter exist
        Set<Character> seenLower = new HashSet<>();
        Set<Character> seenUpper = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                seenLower.add(c);
            } else {
                seenUpper.add(c);
            }
        }

        // Check that for each lowercase letter, the corresponding uppercase letter exists, and vice versa
        for (char c : seenLower) {
            if (!seenUpper.contains(Character.toUpperCase(c))) {
                return false;
            }
        }
        for (char c : seenUpper) {
            if (!seenLower.contains(Character.toLowerCase(c))) {
                return false;
            }
        }

        return true;
    }
}
