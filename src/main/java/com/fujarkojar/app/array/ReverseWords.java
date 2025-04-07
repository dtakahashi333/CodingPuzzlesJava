package com.fujarkojar.app.array;

// 151. Reverse Words in a String
// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
public class ReverseWords {

    /**
     * @param s A string of words
     * @return A string where words are reversed.
     */
    public static String solve(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                if (!reversedString.isEmpty()) reversedString.append(" ");
                reversedString.append(words[i]);
            }
        }
        return reversedString.toString();
    }

    /**
     * @param s A string of words
     * @return A string where words are reversed.
     */
    public static String solve0(String s) {
        StringBuilder reversedString = new StringBuilder();
        int currentIndex = s.length() - 1;
        while (currentIndex >= 0) {
            if (s.charAt(currentIndex) == ' ') {
                reversedString.append(s.charAt(currentIndex));
                currentIndex--;
                continue;
            }
            int wordEnd = currentIndex;
            int wordStart = currentIndex;
            while (wordStart >= 0 && s.charAt(wordStart) != ' ') {
                wordStart--;
            }
            reversedString.append(s, wordStart + 1, wordEnd + 1);
            currentIndex = wordStart;
        }
        return reversedString.toString();
    }
}
