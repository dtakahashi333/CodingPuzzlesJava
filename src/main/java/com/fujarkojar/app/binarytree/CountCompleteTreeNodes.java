package com.fujarkojar.app.binarytree;

// 222. Count Complete Tree Nodes
// https://leetcode.com/problems/count-complete-tree-nodes/description/?envType=study-plan-v2&envId=top-interview-150
public class CountCompleteTreeNodes {

    /**
     * @param root The root of a complete binary tree
     * @return The number of the nodes in the tree
     */
    public static int solve(TreeNode root) {
        if (root == null) return 0;
        // Count the height of the tree.
        TreeNode current = root;
        int height = 0;
        while (current.left != null) {
            current = current.left;
            height++;
        }
        // Binary search for the last level nodes.
        int left = 0, right = (1 << height) - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nodeExists(root, middle, height)) {
                left = middle + 1; // If node exists, search the right half
            } else {
                right = middle - 1; // If node doesn't exist, search the left half
            }
        }
        // Total nodes = nodes in full levels + nodes in last level
        return (1 << height) - 1 + left;
    }

    // Checks if the node at index `index` exists in the last level
    private static boolean nodeExists(TreeNode root, int index, int height) {
        TreeNode current = root;
        int left = 0, right = (1 << height) - 1;

        // Traverse down the tree while narrowing the search to the correct node
        for (int i = 0; i < height; i++) {
            int middle = (left + right) / 2;
            if (index <= middle) {
                current = current.left;  // Move left
                right = middle;  // Narrow the search range to the left half
            } else {
                current = current.right; // Move right
                left = middle + 1;  // Narrow the search range to the right half
            }
        }

        // Check if current node is not null
        return current != null;
    }
}
