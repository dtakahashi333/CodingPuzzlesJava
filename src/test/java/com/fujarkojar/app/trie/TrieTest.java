package com.fujarkojar.app.trie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void test1() {
        Trie trie = new Trie();
        trie.insert("apple");
        assertEquals(true, trie.search("apple")); // return True
        assertEquals(false, trie.search("app")); // return False
        assertEquals(true, trie.startsWith("app")); // return True
        trie.insert("app");
        assertEquals(true, trie.search("app")); // return True
    }
}