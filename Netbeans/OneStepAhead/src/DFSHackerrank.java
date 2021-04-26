/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author Aikacchii
 */
public class DFSHackerrank {
    private int V;
    private LinkedList<Integer> adj[];

    public DFSHackerrank(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i = 0;i<v; i++){
            adj[i] = new LinkedList();
        }
    }
    
    void addEdge(int v, int w){
        adj[v].add(w);
    }
}
