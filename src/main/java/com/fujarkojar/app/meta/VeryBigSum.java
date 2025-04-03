package com.fujarkojar.app.meta;

import java.util.List;

// A Very Big Sum
// https://www.hackerrank.com/challenges/a-very-big-sum/problem
public class VeryBigSum {

    /**
     * @param ar An array of integers
     * @return The sum of the array elements
     */
    public static long solve(List<Long> ar) {
        long sum = 0;
        for (long num : ar) {
            sum += num;
        }
        return sum;
    }
}
