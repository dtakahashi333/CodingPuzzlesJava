package com.fujarkojar.app.binarytree;

import java.util.*;

// 637. Average of Levels in Binary Tree
// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
public class AverageOfLevels {

    /**
     * @param root The root of a binary tree
     * @return The average value of the nodes on each level in the form of an array
     */
    public static List<Double> solve(TreeNode root) {
        if (root == null) return new ArrayList<>(Arrays.asList(new Double[]{0.0}));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Double> averages = new ArrayList<>();
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            double sum = 0;
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            averages.add(sum / queueSize);
        }
        return averages;
    }
}
