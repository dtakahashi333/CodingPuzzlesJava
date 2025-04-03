package com.fujarkojar.app.slidingwindow;

import java.util.Collections;
import java.util.HashMap;

// 594. Longest Harmonious Subsequence
// https://leetcode.com/problems/longest-harmonious-subsequence/description/
public class LongestHarmoniousSubsequence {

    public static int solveByBruteForce(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        for (int i = 0; i < n; ++i) {
            int len = 1;
            int dif = 0;
            for (int j = 0; j < n; ++j) {
                if (i != j) {
                    if (nums[i] == nums[j] || nums[i] - nums[j] == 1) {
                        len++;
                        if (nums[i] - nums[j] == 1) {
                            dif = 1;
                        }
                    }
                }
            }
            if (len > 1 && dif == 1) {
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }

    public static int solve(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int x : nums) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        int maxLen = 0;
        for (int x : hashMap.keySet()) {
            if (hashMap.containsKey(x + 1)) {
                int len = hashMap.get(x) + hashMap.get(x + 1);
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}