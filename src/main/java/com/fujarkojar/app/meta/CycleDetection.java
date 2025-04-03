package com.fujarkojar.app.meta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Cycle Detection
// https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
public class CycleDetection {

    /**
     * @param head A reference to the head of the list
     * @return true if there is a cycle or false if there is not
     */
    public static boolean solve(SinglyLinkedListNode head) {
        if (head == null) {
            return false;
        }
        SinglyLinkedListNode current = head;
        HashSet<SinglyLinkedListNode> visited = new HashSet<>();
        while (current.next != null) {
            if (!visited.isEmpty()) {
                if (visited.contains(current)) {
                    return true;
                }
            }
            visited.add(current);
            current = current.next;
        }
        return false;
    }
}
