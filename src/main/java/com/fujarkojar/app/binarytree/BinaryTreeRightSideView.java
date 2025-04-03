package com.fujarkojar.app.binarytree;


import java.util.*;

// 199. Binary Tree Right Side View
// https://leetcode.com/problems/binary-tree-right-side-view/description/?envType=study-plan-v2&envId=top-interview-150
public class BinaryTreeRightSideView {

    /**
     * @param root The root of a binary tree
     * @return The values of the nodes ordered from top to bottom from the right side view
     */
    public static List<Integer> solve(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        Queue<AbstractMap.SimpleEntry<TreeNode, Integer>> frontiers = new LinkedList<>();
        frontiers.add(new AbstractMap.SimpleEntry<>(root, 0));
        TreeMap<Integer, List<Integer>> visited = new TreeMap<>();
        while (!frontiers.isEmpty()) {
            Map.Entry<TreeNode, Integer> current = frontiers.poll();
            List<Integer> nodeList = visited.getOrDefault(current.getValue(), new ArrayList<>());
            nodeList.add(current.getKey().val);
            visited.put(current.getValue(), nodeList);
            if (current.getKey().left != null) {
                frontiers.add(new AbstractMap.SimpleEntry<>(current.getKey().left, current.getValue() + 1));
            }
            if (current.getKey().right != null) {
                frontiers.add(new AbstractMap.SimpleEntry<>(current.getKey().right, current.getValue() + 1));
            }
        }
        List<Integer> rightSideView = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : visited.entrySet()) {
            rightSideView.add(entry.getValue().get(entry.getValue().size() - 1));
        }
        return rightSideView;
    }

    /**
     * @param root The root of a binary tree
     * @return The values of the nodes ordered from top to bottom from the right side view
     */
    public static List<Integer> solveByRecursion(TreeNode root) {
        List<Integer> rightSideView = new ArrayList<>();
        if (root == null) return rightSideView;
        helperByRecursion(root, 0, rightSideView);
        return rightSideView;
    }

    private static void helperByRecursion(TreeNode node, int level, List<Integer> rightSideView) {
        if (rightSideView.size() == level) {
            rightSideView.add(node.val);
        }
        if (node.right != null) {
            helperByRecursion(node.right, level + 1, rightSideView);
        }
        if (node.left != null) {
            helperByRecursion(node.left, level + 1, rightSideView);
        }
    }
}
