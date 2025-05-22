package com.fujarkojar.app.binarysearch;

// 153. Find Minimum in Rotated Sorted Array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class FindMinimum {

    /**
     * You must write an algorithm that runs in O(log n) time.
     * @param nums A sorted rotated array of unique elements
     * @return The minimum element of this array
     */
    public static int solve(int[] nums) {
        return binarySearch(nums, 0, nums.length - 1);
    }

    public static int binarySearch(int[] nums, int start, int end) {
        if (start >= end) {
            return nums[start];
        }

        int middle = start + (end - start) / 2;

        if (nums[middle] < nums[end]) {
            return binarySearch(nums, start, middle); // include middle
        } else {
            return binarySearch(nums, middle + 1, end);
        }
    }
}
