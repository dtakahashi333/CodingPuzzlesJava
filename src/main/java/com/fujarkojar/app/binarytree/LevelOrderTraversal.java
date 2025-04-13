package com.fujarkojar.app.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 102. Binary Tree Level Order Traversal
// https://leetcode.com/problems/binary-tree-level-order-traversal/description/?envType=study-plan-v2&envId=top-interview-150
public class LevelOrderTraversal {

    /**
     * @param root The root of a binary tree
     * @return The level order traversal of its nodes' values
     */
    public static List<List<Integer>> solve(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        if (root == null) return levelOrder;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            List<Integer> order = new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                order.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            levelOrder.add(order);
        }
        return levelOrder;
    }
}
