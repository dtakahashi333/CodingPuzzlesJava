package com.fujarkojar.app.bitmanipulation;

// 67. Add Binary
// https://leetcode.com/problems/add-binary/description/?envType=study-plan-v2&envId=top-interview-150
public class AddBinary {

    /**
     * @param a A binary string
     * @param b A binary string
     * @return A sum as a binary string
     */
    public static String solve(String a, String b) {
        if (a.isEmpty()) return b;
        if (b.isEmpty()) return a;
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder binSum = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int da = 0, db = 0;
            if (i >= 0) da = a.charAt(i) - '0';
            if (j >= 0) db = b.charAt(j) - '0';
            int sum = da + db + carry;
            binSum.insert(0, sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        if (carry > 0) binSum.insert(0, carry);
        return binSum.toString();
    }
}
