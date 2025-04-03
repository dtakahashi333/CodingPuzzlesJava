package com.fujarkojar.app.meta;

import java.util.ArrayList;
import java.util.List;

// QHEAP1
// https://www.hackerrank.com/challenges/qheap1/problem
public class HeapSort {

    List<Integer> ar = new ArrayList<>();

    public void insert(int v) {
        ar.add(v);
    }


    public void delete(int v) {
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) == v) {
                ar.remove(i);
                break;
            }
        }
    }

    public int getMinimum() {
        buildHeap();
        return ar.get(0);
    }

    private void buildHeap() {
        for (int i = ar.size() / 2; i >= 0; i--) {
            minHeapify(i);
        }
    }

    private void minHeapify(int i) {
        int l = 2 * (i + 1) - 1;
        int r = 2 * (i + 1);
        int largest = -1;
        if (l < ar.size()) {
            if (ar.get(i) > ar.get(l)) {
                largest = l;
            } else {
                largest = i;
            }
        }
        if (r < ar.size()) {
            if (largest > ar.get(r)) {
                largest = r;
            }
        }
        if (largest >= 0 && i != largest) {
            int tmp = ar.get(i);
            ar.set(i, ar.get(largest));
            ar.set(largest, tmp);
            minHeapify(largest);
        }
    }
}
