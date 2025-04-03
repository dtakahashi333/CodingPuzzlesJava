package com.fujarkojar.app.meta;

public class QuickSort2 {

    public static void solve(int[] ar) {
        helper(ar, 0, ar.length - 1);
    }

    private static void helper(int[] ar, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(ar, start, end);
            helper(ar, start, pivotIndex - 1);
            helper(ar, pivotIndex + 1, end);
        }
        print(ar, start, end);
    }

    private static int partition(int[] ar, int start, int end) {
        int pivot = ar[start];
        int i = start;
        for (int j = start + 1; j <= end; j++) {
            if (ar[j] < pivot) {
                i++;
                int tmp = ar[i];
                ar[i] = ar[j];
                ar[j] = tmp;
            }
        }
        // Put the pivot to the proper position.
        int tmp = ar[start];
        ar[start] = ar[i];
        ar[i] = tmp;
        return i;
    }

    private static void print(int[] ar, int start, int end) {
        if (start < end) {
            for (int i = start; i <= end; i++) {
                if (i > start) {
                    System.out.print(" ");
                }
                System.out.print(ar[i]);
            }
            System.out.println();
        }
    }
}
