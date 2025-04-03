package com.fujarkojar.app.divideandconquer;

// 108. Convert Sorted Array to Binary Search Tree
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/?envType=study-plan-v2&envId=top-interview-150
public class SortedArrayToBST {

    /**
     * @param nums An integer array nums where the elements are sorted in ascending order
     * @return A height-balanced binary search tree
     */
    public static TreeNode solve(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private static TreeNode helper(int[] nums, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return null;
        }
        int middleIndex = (startIndex + endIndex) / 2;
        TreeNode node = new TreeNode(nums[middleIndex]);
        node.left = helper(nums, startIndex, middleIndex - 1);
        node.right = helper(nums, middleIndex + 1, endIndex);
        return node;
    }
}
