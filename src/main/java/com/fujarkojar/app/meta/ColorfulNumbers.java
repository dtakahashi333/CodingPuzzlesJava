package com.fujarkojar.app.meta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// 123. Colorful Numbers
// https://tutorialhorizon.com/algorithms/colorful-numbers/
public class ColorfulNumbers {

    /**
     * @param number An integer number
     * @return The product of every contiguous sub-sequence is different
     */
    public static boolean solve(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        if (digits.size() <= 1) {
            return false;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < digits.size(); i++) {
            int product = 1;
            for (int j = i; j < digits.size(); j++) {
                product *= digits.get(j);
                if (hashSet.contains(product)) {
                    return false;
                }
                hashSet.add(product);
            }
        }
        return true;
    }
}
