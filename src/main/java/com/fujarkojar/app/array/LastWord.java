package com.fujarkojar.app.array;

public class LastWord {

    public static int solve(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int lastSpaceIndex = s.lastIndexOf(' ');
        if (lastSpaceIndex < 0) return s.length();
        return s.substring(lastSpaceIndex + 1).length();
    }
}
