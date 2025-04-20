package com.fujarkojar.app.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 207. Course Schedule
// https://leetcode.com/problems/course-schedule/description/?envType=study-plan-v2&envId=top-interview-150
public class CourseSchedule {

    /**
     * @param numCourses    The number of courses
     * @param prerequisites An array of course and prerequisite pairs
     * @return true if you can finish all courses. Otherwise, return false
     */
    public static boolean solve(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }
        Set<Integer> visited = new HashSet<>(); // fully explored
        Set<Integer> recStack = new HashSet<>(); // find cycle
        for (int i = 0; i < numCourses; i++) {
            if (!visited.contains(i)) {
                if (!dfs(graph, i, visited, recStack)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean dfs(List<List<Integer>> graph, int node, Set<Integer> visited, Set<Integer> recStack) {
        if (recStack.contains(node)) return false;
        if (visited.contains(node)) return true;
        recStack.add(node);
        for (int neighbor : graph.get(node)) {
            if (!dfs(graph, neighbor, visited, recStack)) {
                return false;
            }
        }
        recStack.remove(node);
        visited.add(node);
        return true;
    }
}
