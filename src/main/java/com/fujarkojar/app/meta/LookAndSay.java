package com.fujarkojar.app.meta;

public class LookAndSay {

    public static String[] solve(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        String[] result = new String[n];
        String curStr = "1";
        for (int i = 0; i < n; i++) {
            result[i] = curStr;
            // Generate a next digit sequence.
            int curDig = (int) curStr.charAt(0) - 48;
            int count = 1;
            StringBuilder nextStr = new StringBuilder();
            for (int j = 1; j < curStr.length(); j++) {
                int nextDig = (int) curStr.charAt(j) - 48;
                if (curDig == nextDig) {
                    count++;
                } else {
                    nextStr.append(Integer.toString(count)).append(Integer.toString(curDig));
                    count = 1;
                    curDig = nextDig;
                }
            }
            nextStr.append(Integer.toString(count)).append(Integer.toString(curDig));
            curStr = nextStr.toString();
        }
        return result;
    }
}
