package com.fujarkojar.app.array;

import java.util.HashMap;
import java.util.Map;

// 169. Majority Element
// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
public class MajorityElement {

    /**
     * @param nums An array of integers
     * @return The majority element
     */
    public static int solve(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE, keyWithMaxFreq = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                keyWithMaxFreq = entry.getKey();
            }
        }
        return keyWithMaxFreq;
    }

    /**
     * @param nums An array of integers
     * @return The majority element
     */
    public static int solveByBoyerMoore(int[] nums) {
        int candidate = nums[0], count = 1;

        // First pass to find a candidate
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Optional: Second pass to verify the candidate (not necessary here, as the problem guarantees majority)
        // int countVerify = 0;
        // for (int num : nums) {
        //     if (num == candidate) countVerify++;
        // }
        // if (countVerify > nums.length / 2) {
        //     return candidate;
        // }

        return candidate;  // We return the candidate since we are guaranteed a majority element exists
    }
}
