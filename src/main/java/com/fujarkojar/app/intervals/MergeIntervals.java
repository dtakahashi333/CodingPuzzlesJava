package com.fujarkojar.app.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/?envType=study-plan-v2&envId=top-interview-150
public class MergeIntervals {

//    /**
//     * @param intervals An array of intervals where intervals[i] = [starti, endi]
//     * @return An array of the non-overlapping intervals that cover all the intervals in the input
//     */
//    public static int[][] solve(int[][] intervals) {
//        if (intervals.length <= 1) return intervals;
//        Arrays.sort(intervals, Comparator.comparingInt(value -> value[0]));
//        List<List<Integer>> mergedIntervals = new ArrayList<>();
//        int[] first = helper(intervals, mergedIntervals);
//        mergedIntervals.add(0, Arrays.stream(first).boxed().collect(Collectors.toList()));
//        int[][] result = new int[mergedIntervals.size()][2];
//        for (int i = 0; i < mergedIntervals.size(); i++) {
//            result[i] = new int[]{mergedIntervals.get(i).get(0), mergedIntervals.get(i).get(1)};
//        }
//        return result;
//    }
//
//    private static int[] helper(int[][] intervals, List<List<Integer>> mergedIntervals) {
//        if (intervals.length == 1) {
//            return intervals[0];
//        }
//        int[] first = intervals[0];
//        int[] second = helper(Arrays.copyOfRange(intervals, 1, intervals.length), mergedIntervals);
//        if (canMerge(first, second)) {
//            return merge(first, second);
//        } else {
//            mergedIntervals.add(0, Arrays.stream(second).boxed().collect(Collectors.toList()));
//            return intervals[0];
//        }
//    }
//


    /**
     * @param intervals An array of intervals where intervals[i] = [starti, endi]
     * @return An array of the non-overlapping intervals that cover all the intervals in the input
     */
    public static int[][] solve(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(value -> value[0]));
        List<List<Integer>> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        for (int j = 1; j < intervals.length; j++) {
            if (canMerge(currentInterval, intervals[j])) {
                currentInterval = merge(currentInterval, intervals[j]);
            } else {
                mergedIntervals.add(Arrays.stream(currentInterval).boxed().collect(Collectors.toList()));
                currentInterval = intervals[j];
            }
        }
        // Add the last interval.
        mergedIntervals.add(Arrays.stream(currentInterval).boxed().collect(Collectors.toList()));
        int[][] result = new int[mergedIntervals.size()][2];
        for (int i = 0; i < mergedIntervals.size(); i++) {
            result[i] = new int[]{mergedIntervals.get(i).get(0), mergedIntervals.get(i).get(1)};
        }
        return result;
    }

    private static boolean canMerge(int[] a, int[] b) {
        return b[0] <= a[1];
    }

    private static int[] merge(int[] a, int[] b) {
        int min = Math.min(a[0], b[0]);
        int max = Math.max(a[1], b[1]);
        return new int[]{min, max};
    }
}
