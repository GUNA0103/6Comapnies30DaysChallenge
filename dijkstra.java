import java.util.*;
import java.io.*;

public class dijkstra {
    public static int vertices = 5;

    public static int minkey(int key[], boolean visited[]) {
        int min = Integer.MAX_VALUE;
        int minindex = -1;
        for (int j = 0; j < vertices; j++) {
            if (visited[j] == false && key[j] < min) {
                min = key[j];
                minindex = j;
            }
        }
        System.out.println(minindex);

        return minindex;
    }

    public void primmst(int graph[][]) {
        int parent[] = new int[vertices];
        int key[] = new int[vertices];
        boolean visited[] = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            key[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        key[0] = 0;
        parent[0] = -1;
        for (int i = 0; i < vertices - 1; i++) {
            int u = minkey(key, visited);
            visited[u] = true;
            for (int j = 0; j < vertices; j++) {
                if (graph[u][j] != 0 && visited[j] == false && (key[u] + graph[u][j]) < key[j]) {
                    key[j] = (key[u] + graph[u][j]);
                    parent[j] = u;
                }
            }

        }
        for (int i = 1; i < vertices; i++) {
            System.out.println(parent[i] + "-" + i + "\t" + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        dijkstra t = new dijkstra();
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, { 2, 0, 3, 8, 5 }, { 0, 3, 0, 0, 7 }, { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };
        t.primmst(graph);
    }

}
