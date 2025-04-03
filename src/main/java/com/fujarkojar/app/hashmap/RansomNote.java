package com.fujarkojar.app.hashmap;

import java.util.HashMap;

// 383. Ransom Note
// https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
public class RansomNote {

    /**
     * @param ransomNote Characters in a ransom note
     * @param magazine   Characters in a magazine
     * @return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
     */
    public static boolean solve(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null) return false;
        if (ransomNote.length() > magazine.length()) return false;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) - 1);
            if (freqMap.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}
