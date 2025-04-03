package com.fujarkojar.app.greedy;

import java.util.HashMap;
import java.util.Map;

// 409. Longest Palindrome
// https://leetcode.com/problems/longest-palindrome/description/
public class LongestPalindrome {

    public static int solve(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        // Create a frequency map.
        for (int i = 0; i < s.length(); i++) {
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        int length = 0;
        boolean oddFreqFound = false;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                length += entry.getValue();
            } else {
                length += entry.getValue() - 1;
                oddFreqFound = true;
            }
        }
        if (oddFreqFound) {
            length++;
        }
        return length;
    }
}
