package com.fujarkojar.app.meta;

import java.util.Arrays;

public class SpiralArray {

    public static int[][] solve(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be >0");
        }
        if (n == 1) {
            return new int[][]{{1}};
        }
        int[][] result = new int[n][n];
        int count = 0;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int lineSize = n - 1;
        while (count < n * n) {
            for (int j = 0; j < lineSize; j++) {
                result[top][left + j] = count + 1;
                count++;
            }
            if (count >= n * n) {
                break;
            }
            for (int i = 0; i < lineSize; i++) {
                result[top + i][right] = count + 1;
                count++;
            }
            if (count >= n * n) {
                break;
            }
            for (int j = 0; j < lineSize; j++) {
                result[bottom][right - j] = count + 1;
                count++;
            }
            if (count >= n * n) {
                break;
            }
            for (int i = 0; i < lineSize; i++) {
                result[bottom - i][left] = count + 1;
                count++;
            }
            top++;
            right--;
            bottom--;
            left++;
            if (lineSize == 2) {
                lineSize = 1;
            } else {
                lineSize -= 2;
            }
        }
        return result;
    }

    public static int[][] solveByGreedy(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be >0");
        }
        int[] dirCol = new int[]{1, 0, -1, 0};
        int[] dirRow = new int[]{0, 1, 0, -1};
        int curDir = 0, val = 1, row = 0, col = 0, limit = n * n;
        int[][] matrix = new int[n][n];
        for (int[] arr : matrix) {
            Arrays.fill(arr, -1);
        }
        while (val <= limit) {
            matrix[row][col] = val++;
            row += dirRow[curDir];
            col += dirCol[curDir];
            if (isInvalid(matrix, n, row, col)) {
                // Rollback
                row -= dirRow[curDir];
                col -= dirCol[curDir];
                // Change direction.
                curDir = (curDir + 1) % 4;
                row += dirRow[curDir];
                col += dirCol[curDir];
            }
        }
        return matrix;
    }

    private static boolean isInvalid(int[][] matrix, int n, int row, int col) {
        return row < 0 || col < 0 || row > n - 1 || col > n - 1 || matrix[row][col] != -1;
    }
}
