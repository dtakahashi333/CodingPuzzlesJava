package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinGeneticMutationTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        String startGene = "AACCGGTT";
        String endGene = "AACCGGTA";
        String[] bank = {"AACCGGTA"};
        int expected = 1;
        assertEquals(expected, MinGeneticMutation.solve(startGene, endGene, bank));
    }

    @Test
    void solve2() {
        String startGene = "AACCGGTT";
        String endGene = "AAACGGTA";
        String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        int expected = 2;
        assertEquals(expected, MinGeneticMutation.solve(startGene, endGene, bank));
    }
}