package com.fujarkojar.app.meta;

import java.util.List;
import java.util.stream.Collectors;

// Insertion Sort - Part 2
// https://www.hackerrank.com/challenges/insertionsort2/problem
public class InsertionSort2 {

    /**
     * @param n   The length of arr
     * @param arr An array of integers
     */
    public static void solve(int n, List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
//            for (int j = 0; j < i; j++) {
//                if (arr.get(i) < arr.get(j)) {
//                    int val = arr.get(i);
//                    // Shift the values.
//                    for (int k = i; k > j; k--) {
//                        arr.set(k, arr.get(k - 1));
//                    }
//                    arr.set(j, val);
//                    break;
//                }
//            }
            int current = arr.get(i);
            int j = i - 1;
            while (j >= 0 && current < arr.get(j)) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, current);
            System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}
