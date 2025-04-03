package com.fujarkojar.app.linkedlist;

import java.util.HashSet;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

// 141. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-interview-150
public class LinkedListCycle {

    /**
     * @param head The head of a linked list
     * @return true if the linked list has a cycle in it
     */
    public static boolean solve(ListNode head) {
        if (head == null) return false;
        HashSet<ListNode> nodeSet = new HashSet<>();
        ListNode current = head;
        while (current.next != null) {
            if (nodeSet.contains(current)) {
                return true;
            }
            nodeSet.add(current);
            current = current.next;
        }
        return false;
    }

    /**
     * @param head The head of a linked list
     * @return true if the linked list has a cycle in it
     */
    public static boolean solveByTortoiseAndHare(ListNode head) {
        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null && slow.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
