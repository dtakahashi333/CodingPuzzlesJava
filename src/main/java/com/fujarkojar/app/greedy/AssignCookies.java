package com.fujarkojar.app.greedy;

import java.util.Arrays;

// 455. Assign Cookies
// https://leetcode.com/problems/assign-cookies/description/
public class AssignCookies {

    /**
     * @param g An array of greedy factors of each child
     * @param s An array of cookie sizes
     * @return The maximum number of your content children
     */
    public static int solve(int[] g, int[] s) {
        Arrays.sort(g); // sort greedy factors
        Arrays.sort(s); // sort cookie sizes
        int i = 0; // beginning of greedy factors
        int j = 0; // beginning of cookie sizes
        int count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
                j++;
                count++;
            } else {
                i++;
            }
        }
        return count;
    }
}
