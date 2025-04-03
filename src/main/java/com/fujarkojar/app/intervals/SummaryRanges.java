package com.fujarkojar.app.intervals;

import java.util.*;

// 228. Summary Ranges
// https://leetcode.com/problems/summary-ranges/?envType=study-plan-v2&envId=top-interview-150
public class SummaryRanges {

    /**
     * @param nums A sorted unique integer array nums
     * @return
     */
    public static List<String> solve(int[] nums) {
        if (nums.length == 0) return new ArrayList<String>();
        TreeMap<Integer, Integer> ranges = new TreeMap<>();
        ranges.put(nums[0], null);
        int startNum = nums[0];
        int prevNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - prevNum == 1) {
                ranges.put(startNum, nums[i]);
            } else {
                startNum = nums[i];
                ranges.put(startNum, null);
            }
            prevNum = nums[i];
        }
        List<String> summaryRanges = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : ranges.entrySet()) {
            if (entry.getValue() == null) {
                summaryRanges.add(String.valueOf(entry.getKey()));
            } else {
                summaryRanges.add(String.valueOf(entry.getKey()) + "->" + String.valueOf(entry.getValue()));
            }
        }
        return summaryRanges;
    }

    public static List<String> solveByChatGPT(int[] nums) {
        List<String> summaryRanges = new ArrayList<>();

        if (nums.length == 0) return summaryRanges;

        int startNum = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            // Check if we've reached the end of the array or the current number is not consecutive
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (startNum == nums[i - 1]) {
                    summaryRanges.add(String.valueOf(startNum));
                } else {
                    summaryRanges.add(startNum + "->" + nums[i - 1]);
                }
                // If not at the end, start a new range
                if (i < nums.length) {
                    startNum = nums[i];
                }
            }
        }

        return summaryRanges;
    }
}
