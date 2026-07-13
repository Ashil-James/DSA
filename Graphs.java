package DSA;
import java.util.*;
class Graphs_AdjEdge {

    private int vertices;
    private int[][] matrix;

    public Graphs_AdjEdge(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    // Undirected Graph
    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    public void removeEdge(int source, int destination) {
        matrix[source][destination] = 0;
        matrix[destination][source] = 0;
    }

    public boolean hasEdge(int source, int destination) {
        return matrix[source][destination] == 1;
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Graphs {
    public static void main(String[] args) {

        Graphs_AdjEdge g = new Graphs_AdjEdge(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 4);

        g.printGraph();

        System.out.println(g.hasEdge(0,1));
        System.out.println(g.hasEdge(2,4));
    }
}