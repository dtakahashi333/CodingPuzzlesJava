package com.fujarkojar.app.twopointers;

import java.util.Arrays;

// 167. Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150
public class TwoSum2 {

    public static int[] solve(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            int j = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            if (j >= 0) {
                return new int[]{i + 1, j + 1};
            }
        }
        return null;
    }

    public static int[] solveByTwoPointers(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int sum = numbers[left] + numbers[right];
        while (left < right) {
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return null;
    }
}
