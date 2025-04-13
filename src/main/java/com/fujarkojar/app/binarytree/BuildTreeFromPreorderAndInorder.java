package com.fujarkojar.app.binarytree;

// 105. Construct Binary Tree from Preorder and Inorder Traversal
// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/?envType=study-plan-v2&envId=top-interview-150
public class BuildTreeFromPreorderAndInorder {

    /**
     * @param preorder An array of integers representing preorder binary tree traversal
     * @param inorder  An array of integers representing inorder binary tree traversal
     * @return A binary tree
     */
    public static TreeNode solve(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length)
            throw new IllegalArgumentException("The sizes of preorder and inorder arrays must be the same.");
        return buildTree(inorder, 0, inorder.length - 1, preorder, 0);
    }

    private static TreeNode buildTree(int[] inorder, int inorderStartIndex, int inorderEndIndex, int[] preorder, int preorderStartIndex) {
        if (inorderStartIndex > inorderEndIndex) {
            return null;
        }
        int rootVal = preorder[preorderStartIndex];
        int i = inorderStartIndex;
        while (i <= inorderEndIndex && inorder[i] != rootVal) {
            i++;
        }
        int leftSubtreeSize = i - inorderStartIndex;
        return new TreeNode(
                inorder[i],
                // Left subtree
                buildTree(inorder, inorderStartIndex, i - 1, preorder, preorderStartIndex + 1),
                // Right subtree
                buildTree(inorder, i + 1, inorderEndIndex, preorder, leftSubtreeSize + preorderStartIndex + 1)
        );
    }
}
