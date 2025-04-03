package com.fujarkojar.app.meta;

import java.util.List;

// Designer PDF Viewer
// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
public class DesignerPdfViewer {

    /**
     * @param h    The heights of each letter
     * @param word A string
     * @return The size of the highlighted area
     */
    public static int solve(List<Integer> h, String word) {
        int maxHeight = 0;
        for (int i = 0; i < word.length(); i++) {
            maxHeight = Math.max(maxHeight, h.get((int) word.charAt(i) - 97));
        }
        return maxHeight * word.length();
    }
}
