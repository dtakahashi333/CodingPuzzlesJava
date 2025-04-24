package com.fujarkojar.app.hashmap;

import java.util.HashMap;
import java.util.Map;

// 1399. Count Largest Group
// https://leetcode.com/problems/count-largest-group/description/?envType=daily-question&envId=2025-04-23
public class CountLargestGroup {

    /**
     * @param n An integer
     * @return The number of groups that have the largest size.
     */
    public static int solve(int n) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String numString = String.valueOf(i);
            int sum = 0;
            for (int j = 0; j < numString.length(); j++) {
                sum += numString.charAt(j) - '0';
            }
            freqMap.put(sum, freqMap.getOrDefault(sum, 0) + 1);
        }
        int maxSize = 0, count = 0;
        for (int freq : freqMap.values()) {
            if (freq > maxSize) {
                maxSize = freq;
                count = 1;
            } else if (freq == maxSize) {
                count++;
            }
        }
        return count;
    }
}
