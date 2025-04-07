package com.fujarkojar.app.hashmap;

import java.util.HashMap;

// 205. Isomorphic Strings
// https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan-v2&envId=top-interview-150
public class IsomorphicStrings {

    public static boolean solve(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> charMap1 = new HashMap<>();
        HashMap<Character, Character> charMap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charMap1.containsKey(s.charAt(i))) {
                if (charMap1.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            if (charMap2.containsKey(t.charAt(i))) {
                if (charMap2.get(t.charAt(i)) != s.charAt(i)) return false;
            }
            charMap1.put(s.charAt(i), t.charAt(i));
            charMap2.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}
