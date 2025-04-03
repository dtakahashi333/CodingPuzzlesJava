package com.fujarkojar.app;

import java.util.Arrays;
import java.util.Collections;

// Flatland Space Stations
// https://www.hackerrank.com/challenges/flatland-space-stations/problem?isFullScreen=false
public class FlatlandSpaceStations {

    /**
     * @param n The number of cities
     * @param c The indices of cities with a space station
     * @return The maximum distance any city is from a space station
     */
    public static int solveByBruteForce(int n, int[] c) {
        Integer[] distances = new Integer[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < n; j++) {
                distances[j] = Math.min(distances[j], Math.abs(c[i] - j));
            }
        }
        return Collections.max(Arrays.asList(distances));
    }

    /**
     * @param n The number of cities
     * @param c The indices of cities with a space station
     * @return The maximum distance any city is from a space station
     */
    public static int solve(int n, int[] c) {
        if (c.length == 1) {
            return Math.max(c[0], n - 1 - c[0]);
        }
        Arrays.sort(c);
        int maxDistance = 0;
        for (int i = 0; i < c.length; i++) {
            if (i == 0) {
                maxDistance = Math.max(maxDistance, c[i]);
            } else if (i == c.length - 1) {
                maxDistance = Math.max(maxDistance, Math.max((c[i] - c[i - 1]) / 2, n - 1 - c[i]));
            } else {
                maxDistance = Math.max(maxDistance, (c[i] - c[i - 1]) / 2);
            }
        }
        return maxDistance;
    }
}
