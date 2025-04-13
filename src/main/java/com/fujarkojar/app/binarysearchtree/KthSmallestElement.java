package com.fujarkojar.app.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

// 230. Kth Smallest Element in a BST
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/?envType=study-plan-v2&envId=top-interview-150
public class KthSmallestElement {

    private int count;

    /**
     * @param root The root of a binary search tree
     * @param k    An integer value to indicate the position of a node in the tree
     * @return The kth smallest value (1-indexed) of all the values of the nodes in the tree
     */
    public static int solveByList(TreeNode root, int k) {
        if (root == null) throw new IllegalArgumentException();
        List<Integer> inorderList = new ArrayList<>();
        buildInorderList(root, inorderList);
        return inorderList.get(k - 1);
    }

    private static void buildInorderList(TreeNode node, List<Integer> inorderList) {
        if (node == null) return;
        buildInorderList(node.left, inorderList);
        inorderList.add(node.val);
        buildInorderList(node.right, inorderList);
    }

    /**
     * @param root The root of a binary search tree
     * @param k    An integer value to indicate the position of a node in the tree
     * @return The kth smallest value (1-indexed) of all the values of the nodes in the tree
     */
    public int solveByCounter(TreeNode root, int k) {
        if (root == null) throw new IllegalArgumentException();
        List<Integer> result = new ArrayList<>();
        this.count = k;
        helper(root, result);
        return result.get(0);
    }

    private void helper(TreeNode node, List<Integer> result) {
        if (node == null || !result.isEmpty()) return;
        helper(node.left, result);
        this.count--;
        if (this.count == 0) {
            result.add(node.val);
            return;
        }
        helper(node.right, result);
    }
}
