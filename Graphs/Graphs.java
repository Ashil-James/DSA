package DSA.Graphs;
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

    public void dfs(){
        boolean visited[] = new boolean[vertices];

        for(int i=0; i<vertices; i++) {
            if(!visited[i]){
                dfsHelper(i, visited);
            }
        }
    }

    private void dfsHelper(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for(int neighbor=0; neighbor<vertices; neighbor++) {
            if(matrix[node][neighbor] == 1 && !visited[neighbor]) {
                dfsHelper(neighbor, visited);
            }
        }
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

        Graphs_AdjEdge graph = new Graphs_AdjEdge(6);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(4,5);

        graph.printGraph();

        System.out.println("\nDFS:");

        graph.dfs();
    }
}