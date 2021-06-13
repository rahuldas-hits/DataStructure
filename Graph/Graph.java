package Graph;

import java.util.LinkedList;

public class Graph {

    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //adjacent lines

    Graph(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i){
            adj[i] = new LinkedList();
        }
    }
    
}
