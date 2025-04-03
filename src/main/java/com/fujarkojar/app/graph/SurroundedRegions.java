package com.fujarkojar.app.graph;

import java.util.*;

// 130. Surrounded Regions
// https://leetcode.com/problems/surrounded-regions/description/?envType=study-plan-v2&envId=top-interview-150
public class SurroundedRegions {

    /**
     * @param board An m x n matrix board containing letters 'X' and 'O'
     */
    public static void solve(char[][] board) {
        int m = board.length;
        if (m < 3) {
            return;
        }
        int n = board[0].length;
        if (n < 3) {
            return;
        }
        int[][] visited = new int[m][n];
        for (int[] ar : visited) {
            Arrays.fill(ar, 0);
        }
        int regNum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && visited[i][j] == 0) {
                    regNum++;
                    Queue<Map.Entry<Integer, Integer>> frontiers = new LinkedList<>();
                    frontiers.add(new AbstractMap.SimpleEntry<Integer, Integer>(i, j));
                    visited[i][j] = regNum;
                    while (!frontiers.isEmpty()) {
                        Map.Entry<Integer, Integer> cell = frontiers.poll();
                        int x = cell.getValue();
                        int y = cell.getKey();
                        if (cell.getKey() > 0) {
                            if (board[y - 1][x] == 'O' && visited[y - 1][x] == 0) {
                                frontiers.add(new AbstractMap.SimpleEntry<Integer, Integer>(y - 1, x));
                                visited[y - 1][x] = regNum;
                            }
                        }
                        if (cell.getKey() < m - 1) {
                            if (board[y + 1][x] == 'O' && visited[y + 1][x] == 0) {
                                frontiers.add(new AbstractMap.SimpleEntry<Integer, Integer>(y + 1, x));
                                visited[y + 1][x] = regNum;
                            }
                        }
                        if (cell.getValue() > 0) {
                            if (board[y][x - 1] == 'O' && visited[y][x - 1] == 0) {
                                frontiers.add(new AbstractMap.SimpleEntry<Integer, Integer>(y, x - 1));
                                visited[y][x - 1] = regNum;
                            }
                        }
                        if (cell.getValue() < n - 1) {
                            if (board[y][x + 1] == 'O' && visited[y][x + 1] == 0) {
                                frontiers.add(new AbstractMap.SimpleEntry<Integer, Integer>(y, x + 1));
                                visited[y][x + 1] = regNum;
                            }
                        }
                    }
                }
            }
        }
        // Check which regions touch edges.
        HashSet<Integer> touched = new HashSet<>();
        for (int i = 0; i < m; i++) {
            if (visited[i][0] != 0) {
                touched.add(visited[i][0]);
            }
            if (visited[i][n - 1] != 0) {
                touched.add(visited[i][n - 1]);
            }
        }
        for (int j = 0; j < n; j++) {
            if (visited[0][j] != 0) {
                touched.add(visited[0][j]);
            }
            if (visited[m - 1][j] != 0) {
                touched.add(visited[m - 1][j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] != 0 && !touched.contains(visited[i][j])) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
