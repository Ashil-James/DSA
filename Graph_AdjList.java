package DSA;

import java.util.*;
class Graph {

    private int vertices;
    private ArrayList<ArrayList<Integer>> adj;

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();

        // Create an empty adjacency list for each vertex
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add an edge
    public void addEdge(int source, int destination) {
        adj.get(source).add(destination);
        adj.get(destination).add(source); // Remove this line for directed graph
    }

    // Remove an edge
    public void removeEdge(int source, int destination) {
        adj.get(source).remove(Integer.valueOf(destination));
        adj.get(destination).remove(Integer.valueOf(source));
    }

    // Check if an edge exists
    public boolean hasEdge(int source, int destination) {
        return adj.get(source).contains(destination);
    }

    public void dfs() {
        boolean visited[] = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {

        if (!visited[i]) {
            dfsHelper(i, visited);
            }
        }
    }

    private void dfsHelper(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for(int neighbor: adj.get(node)) {
            if(!visited[neighbor]) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    // Print the graph
    public void printGraph() {
        System.out.println("Adjacency List:");

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }
}

public class Graph_AdjList {

    public static void main(String[] args) {

        Graph graph = new Graph(10);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);

        graph.addEdge(7, 8);
        graph.addEdge(8, 9);

        graph.printGraph();

        System.out.println("\nDFS Traversal:");

        graph.dfs();
    }
}