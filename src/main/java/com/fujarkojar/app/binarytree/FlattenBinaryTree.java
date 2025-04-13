package com.fujarkojar.app.binarytree;

// 114. Flatten Binary Tree to Linked List
// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/?envType=study-plan-v2&envId=top-interview-150
public class FlattenBinaryTree {

    /**
     * @param root The root of a binary tree
     * @return The root of a binary tree which is flattened into a "linked list"
     */
    public static void solve(TreeNode root) {
        if (root == null) return;
        buildLinkedList(root);
    }

    private static TreeNode buildLinkedList(TreeNode subtree) {
        TreeNode rightList = null;
        if (subtree.right != null) {
            rightList = buildLinkedList(subtree.right);
        }
        TreeNode leftList = null;
        if (subtree.left != null) {
            leftList = buildLinkedList(subtree.left);
            subtree.right = leftList;
            while (leftList.right != null) {
                leftList = leftList.right;
            }
        }
        if (rightList != null) {
            if (leftList != null) {
                leftList.right = rightList;
            } else {
                subtree.right = rightList;
            }
        }
        subtree.left = null;
        return subtree;
    }

    private static TreeNode buildLinkedListByOptimized(TreeNode node) {
        if (node == null) return null;

        TreeNode leftTail = buildLinkedList(node.left);
        TreeNode rightTail = buildLinkedList(node.right);

        if (node.left != null) {
            // Move left subtree to the right
            TreeNode tempRight = node.right;
            node.right = node.left;
            node.left = null;

            // Connect original right subtree to the end of the new right
            if (leftTail != null) {
                leftTail.right = tempRight;
            }
        }

        // Return the tail of the flattened subtree
        if (rightTail != null) return rightTail;
        if (leftTail != null) return leftTail;
        return node;  // leaf node
    }

    /**
     * @param root The root of a binary tree
     * @return The root of a binary tree which is flattened into a "linked list"
     */
    public static void solveByMorrisTraversal(TreeNode root) {
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left != null) {
                // Find the rightmost node of the left subtree
                TreeNode rightmost = curr.left;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }

                // Rewire the connections
                rightmost.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }

            // Move to the next node
            curr = curr.right;
        }
    }
}
