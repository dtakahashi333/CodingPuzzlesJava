package com.fujarkojar.app.kadanesalgorithm;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubarray {

    public static int solveByBruteForce(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            maxSum = Math.max(maxSum, sum);
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static int solve(int[] nums) {
        int sum = nums[0], maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (sum + nums[i] < nums[i]) {
                sum = 0;
            }
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
