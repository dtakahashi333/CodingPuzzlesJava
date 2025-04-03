package com.fujarkojar.app.graph;

import java.util.*;

// 909. Snakes and Ladders
// https://leetcode.com/problems/snakes-and-ladders/description/?envType=study-plan-v2&envId=top-interview-150
public class SnakesAndLadders {

    /**
     * @param board An n x n integer matrix board where the cells are labeled from 1 to n2 in a Boustrophedon style
     * @return The least number of dice rolls required to reach the square n^2
     */
    public static int solve(int[][] board) {
        if (board == null) return -1;
        if (board.length < 1) return -1;
        if (board[0].length < 1) return -1;
        int n = board.length;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> frontiers = new LinkedList<>();
        frontiers.offer(1);
        visited.add(1);
        int moves = 0;
        while (!frontiers.isEmpty()) {
            int size = frontiers.size();
            for (int i = 0; i < size; i++) {
                int curr = frontiers.poll();
                if (curr == n * n) {
                    return moves;
                }
                for (int next = curr + 1; next <= Math.min(curr + 6, n * n); next++) {
                    int row = n - 1 - (next - 1) / n;
                    int col = ((n - 1 - row) % 2 == 0) ? (next - 1) % n : n - 1 - (next - 1) % n;
                    int destination = (board[row][col] != -1) ? board[row][col] : next;
                    if (!visited.contains(destination)) {
                        visited.add(destination);
                        frontiers.offer(destination);
                    }
                }
            }
            moves++;
        }
        return -1;
    }

//    def snakesAndLadders(self, board: List[List[int]]) -> int:
//        n = len(board)
//        # Convert the 2D board to a 1D array for easier indexing
//        def get_pos(num):
//            # Convert number to 2D board position (row, col)
//            row = n - 1 - (num - 1) // n
//            col = (num - 1) % n if (n - row) % 2 == 1 else n - 1 - (num - 1) % n
//            return row, col
//
//        # BFS setup
//        queue = deque([1])  # Start from square 1
//        visited = set([1])  # Keep track of visited squares
//        moves = 0  # Number of dice rolls
//
//        while queue:
//            for _ in range(len(queue)):
//                curr = queue.popleft()
//
//                if curr == n * n:  # If we reach the final square, return the number of moves
//                    return moves
//
//                # Explore the next 6 possible dice rolls
//                for dice_roll in range(1, 7):
//                    next_square = curr + dice_roll
//                    if next_square > n * n:
//                        continue
//
//                    # Get the destination from the board (due to snake or ladder)
//                    row, col = get_pos(next_square)
//                    destination = board[row][col] if board[row][col] != -1 else next_square
//
//                    # If not visited, add to queue
//                    if destination not in visited:
//                        visited.add(destination)
//                        queue.append(destination)
//
//                moves += 1  # Increment moves after each BFS level (dice roll)
//
//        return -1  # If no solution exists

    /**
     * @param board An n x n integer matrix board where the cells are labeled from 1 to n2 in a Boustrophedon style
     * @return The least number of dice rolls required to reach the square n^2
     */
    // Greedy approach does not work here.
    public static int solveByGreedy(int[][] board) {
        if (board == null) return -1;
        if (board.length < 1) return -1;
        if (board[0].length < 1) return -1;
        int n = board.length;
        int count = 0;
        int farthest = 7;
        int currentEnd = 7;
        for (int curr = 1; curr <= n * n; curr++) {
            int i = n - 1 - (curr - 1) / n;
            int j = (((curr - 1) / n) % 2 == 0) ? (curr - 1) % n : n - 1 - (curr - 1) % n;
            farthest = Math.max(farthest, board[i][j]);
            if (curr == currentEnd) {
                currentEnd = Math.max(farthest, curr + 6);
                count++;
                if (farthest >= n * n) {
                    break;
                }
            }
        }
        return count;
    }
}
