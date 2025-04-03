package com.fujarkojar.app.meta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Arrays: Left Rotation
// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
public class LeftRotation {

    /**
     * @param a The array to rotate
     * @param d The number of rotations
     * @return The rotated array
     */
    public static List<Integer> solve(List<Integer> a, int d) {
        List<Integer> result = new ArrayList<>(a);
        for (int i = 0; i < a.size(); i++) {
            int j = i - d;
            if (j < 0) {
                j += a.size();
            }
            result.set(j, a.get(i));
        }
        return result;
    }

    /**
     * @param a The array to rotate
     * @param d The number of rotations
     * @return The rotated array
     */
    public static List<Integer> solveByOptimal(List<Integer> a, int d) {
        reverse(a, 0, a.size() - 1);
        reverse(a, 0, a.size() - d - 1);
        reverse(a, a.size() - d, a.size() - 1);
        return a;
    }

    private static void reverse(List<Integer> a, int start, int end) {
        while (start < end) {
            int tmp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, tmp);
            start++;
            end--;
        }
    }
}
