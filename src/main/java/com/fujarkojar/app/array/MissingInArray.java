package com.fujarkojar.app.array;

import java.util.Arrays;

// Missing in Array
// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions
public class MissingInArray {

    /**
     * @param arr An array of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
     * @return The missing element
     */
    public static int solve(int[] arr) {
        // code here
        int n = arr.length;
        int[] map = new int[n + 2];
        Arrays.fill(map, 0);
        for (int x : arr) {
            map[x] = 1;
        }
        for (int i = 1; i < n + 2; i++) {
            if (map[i] == 0) return i;
        }
        return -1;
    }

    /**
     * @param arr An array of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
     * @return The missing element
     */
    public static int solveByOptimal(int[] arr) {
        long n = arr.length + 1;
        long missingSum = 0;
        for (int x : arr) {
            missingSum += x;
        }
        return (int) (n * (n + 1) / 2 - missingSum);
    }
}
