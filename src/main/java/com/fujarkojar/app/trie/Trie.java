package com.fujarkojar.app.trie;

import java.util.HashMap;

// 208. Implement Trie (Prefix Tree)
// https://leetcode.com/problems/implement-trie-prefix-tree/description/?envType=study-plan-v2&envId=top-interview-150
public class Trie {

    HashMap<Character, Trie> root = new HashMap<>();

    public Trie() {

    }

    public void insert(String word) {
        if (word.isEmpty()) {
            if (!this.root.containsKey(null)) {
                this.root.put(null, null);
            }
            return;
        }
        if (!this.root.containsKey(word.charAt(0))) {
            this.root.put(word.charAt(0), new Trie());
        }
        this.root.get(word.charAt(0)).insert(word.substring(1));
    }

    public boolean search(String word) {
        if (word.isEmpty()) {
            return this.root.containsKey(null);
        }
        if (this.root.containsKey(word.charAt(0))) {
            return this.root.get(word.charAt(0)).search(word.substring(1));
        } else {
            return false;
        }
    }

    public boolean startsWith(String prefix) {
        if (prefix.isEmpty()) {
            return true;
        }
        if (this.root.containsKey(prefix.charAt(0))) {
            return this.root.get(prefix.charAt(0)).startsWith(prefix.substring(1));
        } else {
            return false;
        }
    }
}
