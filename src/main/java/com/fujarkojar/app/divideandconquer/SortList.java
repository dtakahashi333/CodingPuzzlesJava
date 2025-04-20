package com.fujarkojar.app.divideandconquer;

import java.util.List;

// 148. Sort List
// https://leetcode.com/problems/sort-list/description/?envType=study-plan-v2&envId=top-interview-150
public class SortList {

    /**
     * @param head The head of a linked list
     * @return The list after sorting it in ascending order
     */
    public static ListNode solve(ListNode head) {
        if (head == null) return null;
        return sortList(head);
    }

    private static ListNode sortList(ListNode node) {
        if (node.next == null) {
            return node;
        }
        // Divide the list to half.
        ListNode fast = node;
        ListNode slow = node;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode half1 = node;
        ListNode half2 = slow;
        half1 = sortList(half1);
        half2 = sortList(half2);
        // Merge two lists.
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (half1 != null && half2 != null) {
            if (half1.val < half2.val) {
                curr.next = half1;
                half1 = half1.next;
            } else {
                curr.next = half2;
                half2 = half2.next;
            }
            curr = curr.next;
        }
        if (half1 != null) {
            curr.next = half1;
        }
        if (half2 != null) {
            curr.next = half2;
        }
        return dummy.next;
    }
}
