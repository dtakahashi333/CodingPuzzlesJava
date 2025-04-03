package com.fujarkojar.app.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

// 530. Minimum Absolute Difference in BST
// https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/?envType=study-plan-v2&envId=top-interview-150
public class MinimumAbsoluteDifference {

    /**
     * @param root The root of a Binary Search Tree (BST)
     * @return The minimum absolute difference between the values of any two different nodes in the tree
     */
    public static int solve(TreeNode root) {
        if (root == null) return 0;
        List<Integer> ar = new ArrayList<>();
        inorder(root, ar);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < ar.size(); i++) {
            minDifference = Math.min(minDifference, Math.abs(ar.get(i - 1) - ar.get(i)));
        }
        return minDifference;
    }

    private static void inorder(TreeNode node, List<Integer> ar) {
        if (node.left != null) {
            inorder(node.left, ar);
        }
        ar.add(node.val);
        if (node.right != null) {
            inorder(node.right, ar);
        }
    }
}
