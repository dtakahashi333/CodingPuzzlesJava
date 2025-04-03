package com.fujarkojar.app.meta;

import java.util.ArrayList;
import java.util.List;

// 253. Print all subarrays of a given array
// https://tutorialhorizon.com/algorithms/print-all-subarrays-of-a-given-array/
public class PrintAllSubarrays {

    /**
     * @param a An array of integers
     */
    public static void solve(int[] a) {
        for (int i = 0; i < a.length; i++) {
            List<Integer> subarray = new ArrayList<>();
            for (int j = i; j < a.length; j++) {
                subarray.add(a[j]);
                System.out.println(subarray);
            }
        }
    }
}
