package com.fujarkojar.app.binarysearch;

// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class FindFirstAndLastPosition {

    /**
     * @param nums   An array of integers sorted in non-decreasing order
     * @param target A target integer value
     * @return The starting and ending position of a given target value
     */
    public static int[] solve(int[] nums, int target) {
        int index = binarySearch(nums, target, 0, nums.length - 1);
        if (index < 0) return new int[]{-1, -1};
        int first = index, last = index;
        for (; first >= 0 && nums[first] == target; first--) ;
        for (; last <= nums.length - 1 && nums[last] == target; last++) ;
        if (first < 0 || nums[first] != target) first++;
        if (last > nums.length - 1 || nums[last] != target) last--;
        return new int[]{first, last};
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = start + (end - start) / 2;
        if (nums[middle] == target) return middle;
        if (nums[middle] > target) return binarySearch(nums, target, start, middle - 1);
        else return binarySearch(nums, target, middle + 1, end);
    }

    public static int[] solveByChatGPT(int[] nums, int target) {
        int first = findBound(nums, target, true);
        if (first == -1) return new int[]{-1, -1};
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    // Helper method for binary search boundary
    private static int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                if (isFirst) {
                    right = mid - 1; // Keep searching left
                } else {
                    left = mid + 1;  // Keep searching right
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
