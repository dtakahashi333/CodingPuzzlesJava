package com.fujarkojar.app.binarytree;

import java.util.ArrayList;
import java.util.List;

// 236. Lowest Common Ancestor of a Binary Tree
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
public class LowestCommonAnscestor {

    /**
     * @param root The root of a binary tree
     * @param p    A descendant node
     * @param q    A descendant node
     * @return The lowest common ancestor (LCA) of two given nodes in the tree
     */
    public static TreeNode solve(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || (root.left == null && root.right == null)) {
            throw new IllegalArgumentException("Tree must have at least a child.");
        }
        List<TreeNode> lca = new ArrayList<>();
        search(root, p.val, q.val, lca);
        return lca.get(0);
    }

    private static int search(TreeNode node, int p, int q, List<TreeNode> lca) {
        if (!lca.isEmpty()) {
            return 3;
        }
        int left = (node.left != null) ? search(node.left, p, q, lca) : 0;
        int current = (node.val == p) ? 1 : (node.val == q) ? 2 : 0;
        int right = (node.right != null) ? search(node.right, p, q, lca) : 0;
        if (left + current + right == 3) lca.add(node);
        return left + current + right;
    }

    /**
     * @param root The root of a binary tree
     * @param p    A descendant node
     * @param q    A descendant node
     * @return The lowest common ancestor (LCA) of two given nodes in the tree
     */
    public static TreeNode solveByChatGPT(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        TreeNode left = solve(root.left, p, q);
        TreeNode right = solve(root.right, p, q);

        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }
}
