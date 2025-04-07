package com.fujarkojar.app.math;

public class PlusOne {

    public static int[] solve(int[] digits) {
        if (digits.length == 0) throw new IllegalArgumentException();
        int sum = digits[digits.length - 1] + 1;
        int carry = sum / 10;
        digits[digits.length - 1] = sum % 10;
        for (int i = digits.length - 2; i >= 0; i--) {
            sum = digits[i] + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
            if (carry == 0) {
                break;
            }
        }
        if (carry > 0) {
            int[] tmp = new int[digits.length + 1];
            tmp[0] = carry;
            System.arraycopy(digits, 0, tmp, 1, digits.length);
            digits = tmp;
        }
        return digits;
    }
}
