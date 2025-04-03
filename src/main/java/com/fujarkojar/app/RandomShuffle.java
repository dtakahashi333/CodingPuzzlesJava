package com.fujarkojar.app;

import java.util.Random;

public class RandomShuffle {

    /**
     * @param ar An array of integers
     * @return An array of integers whose contents are shuffled.
     */
    public static int[] solve(int[] ar) {
        Random random = new Random();
        for (int j = 0; j < ar.length; j++) {
            int index = random.nextInt(ar.length);
            int tmp = ar[j];
            ar[j] = ar[index];
            ar[index] = tmp;
        }
        return ar;
    }
}
