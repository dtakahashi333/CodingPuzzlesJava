package com.fujarkojar.app.graph;

import java.awt.color.ICC_ColorSpace;
import java.util.*;

// 433. Minimum Genetic Mutation
// https://leetcode.com/problems/minimum-genetic-mutation/description/?envType=study-plan-v2&envId=top-interview-150
public class MinGeneticMutation {

    /**
     * @param startGene A start gene string
     * @param endGene   A end gene string
     * @param bank      An array of all the valid gene mutations
     * @return The minimum number of mutations needed to mutate from startGene to endGene. If there is no such a mutation, return -1
     */
    public static int solve(String startGene, String endGene, String[] bank) {
        if (bank.length == 0) return -1;
        Queue<String> queue = new LinkedList<>();
        queue.offer(startGene);
        Set<String> visited = new HashSet<>();
        visited.add(startGene);
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                String currGene = queue.poll();
                List<String> oneMutations = getOneMutations(currGene, bank);
                for (String oneMutation : oneMutations) {
                    if (oneMutation.equals(endGene)) {
                        return count;
                    }
                    if (!visited.contains(oneMutation)) {
                        queue.offer(oneMutation);
                        visited.add(oneMutation);
                    }
                }
            }
        }
        return -1;
    }

    // O(n^2)
    private static List<String> getOneMutations(String gene, String[] bank) {
        List<String> oneMutations = new ArrayList<>();
        for (String mutation : bank) {
            int i = 0, j = 0;
            int numDifferences = 0;
            while (i < gene.length() && j < mutation.length()) {
                if (gene.charAt(i++) != mutation.charAt(j++)) numDifferences++;
                if (numDifferences == 2) break;
            }
            if (numDifferences == 1) {
                oneMutations.add(mutation);
            }
        }
        return oneMutations;
    }

    private static List<String> getOneMutationsByChatGPT(String gene, Set<String> bankSet) {
        List<String> result = new ArrayList<>();
        char[] chars = {'A', 'C', 'G', 'T'};
        char[] arr = gene.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char original = arr[i];
            for (char c : chars) {
                if (c != original) {
                    arr[i] = c;
                    String mutated = new String(arr);
                    if (bankSet.contains(mutated)) {
                        result.add(mutated);
                    }
                }
            }
            arr[i] = original; // restore
        }
        return result;
    }
}
