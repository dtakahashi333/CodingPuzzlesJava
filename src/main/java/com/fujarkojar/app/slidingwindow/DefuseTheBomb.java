package com.fujarkojar.app.slidingwindow;

import java.util.Arrays;

// 1652. Defuse the Bomb
// https://leetcode.com/problems/defuse-the-bomb/description/
public class DefuseTheBomb {

    public static int[] solve(int[] code, int k) {
        int n = code.length;
        int[] decrypted = new int[n];
        if (k > 0) {
            int sum = 0;
            for (int i = 1; i <= k; ++i) {
                sum += code[i];
            }
            for (int i = 0; i < n; ++i) {
                decrypted[i] = sum;
                sum -= code[(i + 1) % n];
                sum += code[(i + k + 1) % n];
            }
        } else if (k < 0) {
            int sum = 0;
            for (int i = n - 1 + k; i <= n - 2; ++i) {
                sum += code[i];
            }
            for (int i = n - 1; i < 2 * n - 1; ++i) {
                decrypted[i % n] = sum;
                sum -= code[(i + k) % n];
                sum += code[i % n];
            }
        } else {
            Arrays.fill(decrypted, 0);
        }
        return decrypted;
    }
}
