package com.fujarkojar.app.backtracking;

import java.util.ArrayList;
import java.util.List;

// 77. Combinations
// https://leetcode.com/problems/combinations/description/?envType=study-plan-v2&envId=top-interview-150
public class Combinations {

    /**
     * @param n A range of integers between 1 and n
     * @param k Combinations of k numbers
     * @return All possible combinations of k numbers of a range between 1 and n
     */
    public static List<List<Integer>> solve(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        List<Integer> currentCombination = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, k, 0, currentCombination, result);
        return result;
    }

    private static void backtrack(int[] nums, int k, int index, List<Integer> currentCombination, List<List<Integer>> result) {
        if (currentCombination.size() == k) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        if (index > nums.length - 1) {
            return;
        }
        // Take
        currentCombination.add(nums[index]);
        backtrack(nums, k, index + 1, currentCombination, result);
        currentCombination.remove(currentCombination.size() - 1);
        // Not take
        backtrack(nums, k, index + 1, currentCombination, result);
    }
}
