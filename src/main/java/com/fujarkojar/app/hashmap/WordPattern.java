package com.fujarkojar.app.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// 290. Word Pattern
// https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
public class WordPattern {

    /**
     * @param pattern A character sequence
     * @param s       A word sequence
     * @return true if there is a bijection between a letter in pattern and a non-empty word in s, false otherwise
     */
    public static boolean solve(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        Map<Character, String> letterToWord = new HashMap<>();
        Map<String, Character> wordToLetter = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (letterToWord.containsKey(c) && !word.equals(letterToWord.get(c))) return false;
            if (wordToLetter.containsKey(word) && wordToLetter.get(word) != c) return false;
            letterToWord.put(c, words[i]);
            wordToLetter.put(word, c);
        }
        return true;
    }

    /**
     * @param pattern A character sequence
     * @param s       A word sequence
     * @return true if there is a bijection between a letter in pattern and a non-empty word in s, false otherwise
     */
    public static boolean solveByChatGPT(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Object, Integer> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Compare previous index mapping
            if (!Objects.equals(map.put(c, i), map.put(word, i))) {
                return false;
            }
        }
        return true;
    }
}
