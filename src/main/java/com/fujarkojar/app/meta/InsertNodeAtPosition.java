package com.fujarkojar.app.meta;

// Insert a node at a specific position in a linked list
// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
public class InsertNodeAtPosition {

    /**
     * @param llist    A reference to the head of the list
     * @param data     An integer value to insert as data in the new node
     * @param position An integer position to insert the new node, zero-based indexing
     * @return A reference to the head of the revised list
     */
    public static SinglyLinkedListNode solve(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        if (llist == null) {
            return null;
        }
        if (position == 0) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next = llist;
            return newNode;
        }
        SinglyLinkedListNode current = llist;
        while (current.next != null) {
            if (position == 1) {
                SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
            position--;
        }
        return llist;
    }
}
