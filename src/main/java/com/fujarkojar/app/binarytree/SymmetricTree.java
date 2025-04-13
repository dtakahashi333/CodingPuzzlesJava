package com.fujarkojar.app.binarytree;

import java.util.*;

// 101. Symmetric Tree
// https://leetcode.com/problems/symmetric-tree/description/?envType=study-plan-v2&envId=top-interview-150
public class SymmetricTree {

    /**
     * @param root The root of a binary tree
     * @return true if the tree is symmetric around its center, false otherwise
     */
    public static boolean solve(TreeNode root) {
        if (root == null) throw new IllegalArgumentException("Tree root must not be null.");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> nodeList = new ArrayList<>();
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    nodeList.add(node.left.val);
                } else {
                    nodeList.add(null);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    nodeList.add(node.right.val);
                } else {
                    nodeList.add(null);
                }
            }
            for (int j = 0; j < nodeList.size() / 2; j++) {
                if (!Objects.equals(nodeList.get(j), nodeList.get(nodeList.size() - 1 - j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
