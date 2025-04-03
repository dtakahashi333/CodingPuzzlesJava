package com.fujarkojar.app.slidingwindow;

import java.util.HashMap;

// 1876. Substrings of Size Three with Distinct Characters
// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
public class SubstringsOfSizeThree {

    public static int solve(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i + 2 < n; ++i) {
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i + 2) && s.charAt(i + 1) != s.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }

    public static int solveByOptimal(String s) {
        int n = s.length();
        int count = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < 3; ++i) {
            char c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        if (freqMap.size() == 3) {
            count++;
        }
        for (int i = 3; i < n; ++i) {
            // Reduce the frequency of the left most character in the frequency map.
            char leftChar = s.charAt(i - 3);
            freqMap.put(leftChar, freqMap.get(leftChar) - 1);
            if (freqMap.get(leftChar) == 0) {
                freqMap.remove(leftChar);
            }
            char rightChar = s.charAt(i);
            freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
            if (freqMap.size() == 3) {
                count++;
            }
        }
        return count;
    }
}
