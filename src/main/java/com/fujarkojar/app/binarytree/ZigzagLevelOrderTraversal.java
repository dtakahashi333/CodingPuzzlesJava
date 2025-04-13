package com.fujarkojar.app.binarytree;

import java.util.*;

// 103. Binary Tree Zigzag Level Order Traversal
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/?envType=study-plan-v2&envId=top-interview-150
public class ZigzagLevelOrderTraversal {

    /**
     * @param root The root of a binary tree
     * @return The zigzag level order traversal of its nodes' values
     */
    public static List<List<Integer>> solve(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        if (root == null) return levelOrder;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            List<Integer> order = new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                order.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            // Alternatively we can use a Deque data structure to store values in a reverse order.
            if (level % 2 != 0) Collections.reverse(order);
            levelOrder.add(order);
            level++;
        }
        return levelOrder;
    }
}
