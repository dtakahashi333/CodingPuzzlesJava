package com.fujarkojar.app.binarysearch;

// 33. Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class SearchRotatedSortedArray {

    /**
     * @param nums   An sorted array of integers which possibly rotated at an unknown pivot index
     * @param target An integer
     * @return The index of target if it is in nums, or -1 if it is not in nums
     */
    public static int solve(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (target < nums[middle]) {
            if (nums[end] < nums[middle] && target <= nums[end]) {
                return binarySearch(nums, target, middle + 1, end);
            } else {
                return binarySearch(nums, target, start, middle - 1);
            }
        } else { // (nums[middle] < target)
            if (nums[middle] < nums[start] && nums[start] <= target) {
                return binarySearch(nums, target, start, middle - 1);
            } else {
                return binarySearch(nums, target, middle + 1, end);
            }
        }
    }
}
