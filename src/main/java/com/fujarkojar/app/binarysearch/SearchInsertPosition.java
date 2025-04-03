package com.fujarkojar.app.binarysearch;

// 35. Search Insert Position
// https://leetcode.com/problems/search-insert-position/description/?envType=study-plan-v2&envId=top-interview-150
public class SearchInsertPosition {

    /**
     * @param nums   A sorted array of distinct integers
     * @param target A target value
     * @return The index where it would be if it were inserted in order
     */
    public static int solve(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if (nums[start] < target) {
            return start + 1;
        } else {
            return start;
        }
    }
}
