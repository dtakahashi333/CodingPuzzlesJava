package com.fujarkojar.app.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static int solve1(int[] nums, int k) {
        if (k > nums.length) throw new IllegalArgumentException();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            queue.offer(num);
        }
        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }
        return queue.poll();
    }

    public static int solve2(int[] nums, int k) {
        if (k > nums.length) throw new IllegalArgumentException();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
