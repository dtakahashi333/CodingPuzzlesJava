package com.fujarkojar.app.slidingwindow;

import java.util.HashMap;

// 219. Contains Duplicate II
// https://leetcode.com/problems/contains-duplicate-ii/description/
public class ContainsDuplicate2 {

    public static boolean solveByBruteForce(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j <= i + k && j < n; ++j) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean solve(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            if (hashMap.containsKey(nums[i]) && Math.abs(hashMap.get(nums[i]) - i) <= k) {
                return true;
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}
