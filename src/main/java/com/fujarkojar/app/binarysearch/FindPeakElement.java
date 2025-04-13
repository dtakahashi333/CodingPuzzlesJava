package com.fujarkojar.app.binarysearch;

// 162. Find Peak Element
// https://leetcode.com/problems/find-peak-element/description/?envType=study-plan-v2&envId=top-interview-150
public class FindPeakElement {

    /**
     * @param nums A 0-indexed integer array
     * @return An index of a peak element in the array
     */
    public static int solve(int[] nums) {
        return divideAndConquer(nums, 0, nums.length - 1);
    }

    private static int divideAndConquer(int[] nums, int start, int end) {
        if (start == end) {
            return start;
        }
        int middle = (start + end) / 2;
        int left = divideAndConquer(nums, start, middle);
        int right = divideAndConquer(nums, middle + 1, end);
        if (nums[left] < nums[right]) {
            return right;
        } else {
            return left;
        }
    }
}
