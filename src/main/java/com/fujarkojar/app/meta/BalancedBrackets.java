package com.fujarkojar.app.meta;


import java.util.Stack;

// Balanced Brackets
// https://www.hackerrank.com/challenges/balanced-brackets/problem
public class BalancedBrackets {

    /**
     * @param s A string of brackets
     * @return Either YES or NO
     */
    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return "NO";
                }
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return "NO";
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return "NO";
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
