package com.fujarkojar.app.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

// 98. Validate Binary Search Tree
// https://leetcode.com/problems/validate-binary-search-tree/description/?envType=study-plan-v2&envId=top-interview-150
public class ValidateBST {

    /**
     * @param root The root of a binary tree
     * @return true if it is a valid binary search tree (BST)
     */
    public static boolean solve(TreeNode root) {
        if (root == null) return true;
        List<Integer> children = new ArrayList<>();
        return dfs(root, children);
    }

    private static boolean dfs(TreeNode node, List<Integer> children) {
        boolean isValid = true;
        if (node.left != null) {
            List<Integer> leftChildren = new ArrayList<>();
            isValid = dfs(node.left, leftChildren);
            for (int child : leftChildren) {
                if (child >= node.val) {
                    return false;
                }
            }
            children.addAll(leftChildren);
        }
        if (isValid && node.right != null) {
            List<Integer> rightChildren = new ArrayList<>();
            isValid = dfs(node.right, rightChildren);
            for (int child : rightChildren) {
                if (child <= node.val) {
                    return false;
                }
            }
            children.addAll(rightChildren);
        }
        children.add(node.val);
        return isValid;
    }

    /**
     * @param root The root of a binary tree
     * @return true if it is a valid binary search tree (BST)
     */
    public static boolean solveByChatGPT(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBST(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
