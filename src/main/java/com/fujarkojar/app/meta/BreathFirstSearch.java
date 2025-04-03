package com.fujarkojar.app.meta;

import java.util.*;

// Breadth First Search: Shortest Reach
// https://www.hackerrank.com/challenges/bfsshortreach/problem
public class BreathFirstSearch {

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }
    }

    /**
     * @param n     The number of nodes
     * @param m     The number of edges
     * @param edges Start and end nodes for edges
     * @param s     The node to start traversals from
     * @return The distances to nodes in increasing node number order, not including the start node (-1 if a node is not reachable)
     */
    public static List<Integer> solve(int n, int m, List<List<Integer>> edges, int s) {
        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int j = 0; j < m; j++) {
            List<Integer> edge = edges.get(j);
            graph.get(edge.get(0)).add(edge.get(1));
            graph.get(edge.get(1)).add(edge.get(0));
        }
        Queue<Pair<Integer, Integer>> frontiers = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        frontiers.add(new Pair<>(s, 0));
        visited.put(s, 0);
        while (!frontiers.isEmpty()) {
            Pair<Integer, Integer> current = frontiers.poll();
            for (Integer node : graph.get(current.getKey())) {
                if (!visited.containsKey(node)) {
                    int distance = current.getValue() + 6;
                    frontiers.add(new Pair<>(node, distance));
                    visited.put(node, distance);
                }
            }
        }
        List<Integer> distances = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i != s) {
                distances.add(visited.getOrDefault(i, -1));
            }
        }
        return distances;
    }
}
