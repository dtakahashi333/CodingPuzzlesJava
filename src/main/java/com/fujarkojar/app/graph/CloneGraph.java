package com.fujarkojar.app.graph;

import java.util.*;

// 133. Clone Graph
// https://leetcode.com/problems/clone-graph/description/?envType=study-plan-v2&envId=top-interview-150
public class CloneGraph {

    private Map<Node, Node> visited = new HashMap<>();

    /**
     * @param node A reference of a node in a connected undirected graph
     * @return A deep copy (clone) of the graph
     */
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        // If the node was already visited before
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        // Clone the node
        Node cloneNode = new Node(node.val);
        visited.put(node, cloneNode);

        // Clone the neighbors recursively
        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        return cloneNode;
    }
}
