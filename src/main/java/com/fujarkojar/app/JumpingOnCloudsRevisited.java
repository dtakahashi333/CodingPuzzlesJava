package com.fujarkojar.app;

public class JumpingOnCloudsRevisited {

    public static int solve(int[] c, int k) {
        int n = c.length;
        int e = 100;
        int i = 0;
        do {
            i = (i + k) % n; // Next index.
            e--;
            if (c[i] == 1) {
                e -= 2;
            }
        } while (i != 0);

        return e;
    }
}
