package com.fujarkojar.app.binarytree;

import java.util.LinkedList;
import java.util.Queue;

// 129. Sum Root to Leaf Numbers
// https://leetcode.com/problems/sum-root-to-leaf-numbers/description/?envType=study-plan-v2&envId=top-interview-150
public class SumRootToLeafNumbers {

    public static int solve(TreeNode root) {
        return helper(root, 0);
    }

    private static int helper(TreeNode node, int sum) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return sum * 10 + node.val;
        return helper(node.left, sum * 10 + node.val) + helper(node.right, sum * 10 + node.val);
    }

//    public static int solve(TreeNode root) {
//        if (root == null) return 0;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        int sum = 0;
//        while (!queue.isEmpty()) {
//            int queueSize = queue.size();
//            sum *= 10;
//            for (int i = 0; i < queueSize; i++) {
//                TreeNode node = queue.poll();
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//                sum += node.val;
//                if (node.left != null && node.right != null) {
//                    sum += node.val;
//                }
//            }
//        }
//        return sum;
//    }
}
