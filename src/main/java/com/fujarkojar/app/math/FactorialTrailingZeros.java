package com.fujarkojar.app.math;

import java.math.BigInteger;

// 172. Factorial Trailing Zeroes
// https://leetcode.com/problems/factorial-trailing-zeroes/description/?envType=study-plan-v2&envId=top-interview-150
public class FactorialTrailingZeros {

    /**
     * @param n An integer
     * @return The number of trailing zeroes in n!
     */
    public static int solveByBruteForce(int n) {
        if (n == 0) return 0;
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        String factorialString = String.valueOf(factorial);
        int counter = 0;
        for (int i = factorialString.length() - 1; i >= 0; i--) {
            if (factorialString.charAt(i) != '0') {
                break;
            }
            counter++;
        }
        return counter;
    }

    //To calculate the number of trailing zeroes in the factorial of an integer n (denoted as n!),
    // you need to count how many times 10 is a factor in n!. Since 10 is the product of 2 and 5,
    // and there are always more factors of 2 than factors of 5 in n!, the number of trailing zeroes
    // is determined by how many times 5 is a factor in n!.
    /**
     * @param n An integer
     * @return The number of trailing zeroes in n!
     */
    public static int solve(int n) {
        int count = 0;
        while (n >= 5) {
            n = n / 5;
            count += n;
        }
        return count;
    }
}
