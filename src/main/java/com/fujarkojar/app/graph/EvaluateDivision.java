package com.fujarkojar.app.graph;

import java.util.*;

// 399. Evaluate Division
// https://leetcode.com/problems/evaluate-division/?envType=study-plan-v2&envId=top-interview-150
public class EvaluateDivision {

    /**
     * @param equations An array of variable pairs
     * @param values    An array of real numbers
     * @param queries   An array of queries
     * @return The answers to all queries. If a single answer cannot be determined, return -1.0
     */
    public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        if (equations.size() != values.length) throw new IllegalArgumentException();
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());
            graph.get(a).put(b, values[i]);
            graph.get(b).put(a, 1 / values[i]);
        }
        int querySize = queries.size();
        double[] result = new double[querySize];
        for (int j = 0; j < querySize; j++) {
            result[j] = bfs(graph, queries.get(j).get(0), queries.get(j).get(1));
        }
        return result;
    }

    private static double bfs(Map<String, Map<String, Double>> graph, String src, String dst) {
        if (!graph.containsKey(src) || !graph.containsKey(dst)) return -1.0;
        Queue<Map.Entry<String, Double>> queue = new LinkedList<>();
        queue.offer(new AbstractMap.SimpleEntry<>(src, 1.0));
        Set<String> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            Map.Entry<String, Double> current = queue.poll();
            if (dst.equals(current.getKey())) return current.getValue();
            visited.add(current.getKey());
            Map<String, Double> neighbors = graph.get(current.getKey());
            for (String neighbor : neighbors.keySet()) {
                if (!visited.contains(neighbor)) {
                    queue.offer(new AbstractMap.SimpleEntry<>(neighbor, current.getValue() * neighbors.get(neighbor)));
                }
            }
        }
        return -1.0;
    }
}
