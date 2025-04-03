package com.fujarkojar.app.matrix;

import java.util.HashSet;

// 36. Valid Sudoku
// https://leetcode.com/problems/valid-sudoku/description/?envType=study-plan-v2&envId=top-interview-150
public class ValidSudoku {

    /**
     * @param board A 9x9 Sudoku board
     * @return The Sudoku board is valid or not.
     */
    public static boolean solve(char[][] board) {
        // Validate rows.
        for (int i = 0; i < 9; i++) {
            HashSet<Character> numSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (numSet.contains(board[i][j])) {
                        return false;
                    }
                    numSet.add(board[i][j]);
                }
            }
        }
        // Validate columns.
        for (int j = 0; j < 9; j++) {
            HashSet<Character> numSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    if (numSet.contains(board[i][j])) {
                        return false;
                    }
                    numSet.add(board[i][j]);
                }
            }
        }
        // Validate nine 3x3 sub-boxes.
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                HashSet<Character> numSet = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[i + k][j + l] != '.') {
                            if (numSet.contains(board[i + k][j + l])) {
                                return false;
                            }
                            numSet.add(board[i + k][j + l]);
                        }
                    }
                }
            }
        }
        return true;
    }

//    def isValidSudoku(board):
//        # Create sets to track seen numbers in rows, columns, and sub-boxes
//        rows = [set() for _ in range(9)]
//        cols = [set() for _ in range(9)]
//        sub_boxes = [set() for _ in range(9)]
//
//        for i in range(9):
//            for j in range(9):
//                num = board[i][j]
//                if num == '.':
//                continue
//
//                # Calculate the index of the sub-box using (i // 3) * 3 + (j // 3)
//                sub_box_index = (i // 3) * 3 + (j // 3)
//
//                if num in rows[i] or num in cols[j] or num in sub_boxes[sub_box_index]:
//                return False
//
//                # Add the number to the appropriate sets
//                rows[i].add(num)
//                cols[j].add(num)
//                sub_boxes[sub_box_index].add(num)
//
//        return True

}
