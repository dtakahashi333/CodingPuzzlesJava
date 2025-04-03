package com.fujarkojar.app.meta;

import com.fujarkojar.app.slidingwindow.LogestNiceSubstring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookAndSayTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve() {
        int n = 10;
        String[] expected = {
                "1",
                "11",
                "21",
                "1211",
                "111221",
                "312211",
                "13112221",
                "1113213211",
                "31131211131221",
                "13211311123113112211"
        };
        assertArrayEquals(expected, LookAndSay.solve(n));
    }
}