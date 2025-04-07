package com.fujarkojar.app.heap;

import java.util.*;

// 373. Find K Pairs with Smallest Sums
// https://leetcode.com/problems/find-k-pairs-with-smallest-sums/description/?envType=study-plan-v2&envId=top-interview-150
public class KSmallestPairs {

    /**
     * @param nums1 An array of integers
     * @param nums2 An array of integers
     * @param k     An integer
     * @return Return the k pairs with the smallest sums.
     */
    public static List<List<Integer>> solve(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0) {
            return result;
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> nums1[a[0]] + nums2[a[1]]));
        minHeap.offer(new int[]{0, 0});
        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        for (int count = 0; count < k; count++) {
            int[] indices = minHeap.poll();
            result.add(Arrays.asList(nums1[indices[0]], nums2[indices[1]]));
            if (indices[0] + 1 < nums1.length && !visited.contains((indices[0] + 1) + "," + indices[1])) {
                minHeap.offer(new int[]{indices[0] + 1, indices[1]});
                visited.add((indices[0] + 1) + "," + indices[1]);
            }
            if (indices[1] + 1 < nums2.length && !visited.contains(indices[0] + "," + (indices[1] + 1))) {
                minHeap.offer(new int[]{indices[0], indices[1] + 1});
                visited.add(indices[0] + "," + (indices[1] + 1));
            }
        }
        return result;
    }
}
