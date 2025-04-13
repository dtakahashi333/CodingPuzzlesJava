package com.fujarkojar.app.binarytree;

// 112. Path Sum
// https://leetcode.com/problems/path-sum/description/?envType=study-plan-v2&envId=top-interview-150
public class PathSum {

    /**
     * @param root      The root of a binary tree
     * @param targetSum An integer
     * @return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum
     */
    public static boolean solve(TreeNode root, int targetSum) {
        if (root == null) return false;
        return DFS(root, targetSum, 0);
    }

    private static boolean DFS(TreeNode node, int targetSum, int currentSum) {
        if (node.left == null && node.right == null) { // Leaf
            return targetSum == currentSum + node.val;
        }
        boolean leftResult = false;
        if (node.left != null) {
            leftResult = DFS(node.left, targetSum, currentSum + node.val);
        }
        if (leftResult) {
            return leftResult;
        } else {
            boolean rightResult = false;
            if (node.right != null) {
                rightResult = DFS(node.right, targetSum, currentSum + node.val);
            }
            return rightResult;
        }
    }
}
