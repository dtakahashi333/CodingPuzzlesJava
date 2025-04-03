package com.fujarkojar.app.slidingwindow;

public class FindTheKBeautyOfNumber {

    public static int solve(int num, int k) {
        String numStr = String.valueOf(num);
        // Calculate the initial value.
        int subNum = 0;
        for (int i = numStr.length() - k; i < numStr.length(); i++) {
            subNum = subNum * 10 + (numStr.charAt(i) - '0');
        }
        int count = 0;
        if (subNum != 0 && num % subNum == 0) {
            count++;
        }
        for (int i = numStr.length() - k - 1; i >= 0; i--) {
            subNum /= 10;
            subNum += (int) Math.pow(10, k - 1) * (numStr.charAt(i) - '0');
            if (subNum != 0 && num % subNum == 0) {
                count++;
            }
        }
        return count;
    }
}
