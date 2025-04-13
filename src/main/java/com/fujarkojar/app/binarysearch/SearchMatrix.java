package com.fujarkojar.app.binarysearch;

// 74. Search a 2D Matrix
// https://leetcode.com/problems/search-a-2d-matrix/description/?envType=study-plan-v2&envId=top-interview-150
public class SearchMatrix {

    /**
     * @param matrix An m x n integer matrix
     * @param target An integer
     * @return true if target is in matrix or false otherwise
     */
    public static boolean solve(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        return binarySearch(matrix, m, n, target, 0, m * n - 1);
    }

    private static boolean binarySearch(int[][] matrix, int m, int n, int target, int start, int end) {
        if (start > end) {
            return false;
        }
        int middle = (start + end) / 2;
        int row = middle / n;
        int col = middle % n;
        if (target == matrix[row][col]) {
            return true;
        } else if (target < matrix[row][col]) {
            return binarySearch(matrix, m, n, target, start, middle - 1);
        } else {
            return binarySearch(matrix, m, n, target, middle + 1, end);
        }
    }
}
