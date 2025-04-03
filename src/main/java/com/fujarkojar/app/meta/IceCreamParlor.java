package com.fujarkojar.app.meta;

import java.util.*;

// Ice Cream Parlor
// https://www.hackerrank.com/challenges/icecream-parlor/problem
public class IceCreamParlor {

    /**
     * @param m   The amount of money they have to spend
     * @param arr The cost of each flavor of ice cream
     * @return The indices of the prices of the two flavors they buy, sorted ascending
     */
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        HashMap<Integer, Integer> hasMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int dif = m - arr.get(i);
            if (hasMap.containsKey(dif)) {
                return Arrays.asList(new Integer[]{hasMap.get(dif) + 1, i + 1});
            }
            hasMap.put(arr.get(i), i);
        }
        return null;
    }
}
