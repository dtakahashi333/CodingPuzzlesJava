package com.fujarkojar.app.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 117. Populating Next Right Pointers in Each Node II
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class PopulatingNextRightPointers {

    /**
     * @param root The root of a binary tree
     * @return The root of a binary tree whose nodes populate each next pointer to point to its next right node
     */
    public static Node solve(Node root) {
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            //Stack<Node> stack = new Stack<>();
            Node prevNode = null;
            for (int i = 0; i < queueSize; i++) {
                Node node = queue.poll();
                //stack.push(node);
                if (prevNode != null) {
                    prevNode.next = node;
                }
                prevNode = node;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (prevNode != null) {
                prevNode.next = null;
            }
            //if (!stack.isEmpty()) {
            //    Node rightNode = stack.pop();
            //    rightNode.next = null;
            //    while (!stack.isEmpty()) {
            //        Node leftNode = stack.pop();
            //        leftNode.next = rightNode;
            //        rightNode = leftNode;
            //    }
            //}
         }
        return root;
    }
}
