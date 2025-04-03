package com.fujarkojar.app.meta;

import java.util.Stack;

// Queue using Two Stacks
// https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
public class QueueUsingTwoStacks {

    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();

    public void enqueue(int data) {
        st1.push(data);
    }

    public void dequeue() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        if (!st2.isEmpty()) {
            st2.pop();
        }
    }

    public void print() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        if (!st2.isEmpty()) {
            System.out.println(st2.peek());
        }
    }
}
