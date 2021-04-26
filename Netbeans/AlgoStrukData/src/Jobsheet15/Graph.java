/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet15;

/**
 *
 * @author Aikacchii
 */
public class Graph {
    int vertex;
    LinkedLists list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for(int i=0;i<vertex;i++){
            list[i]= new LinkedLists();
        }
    }
    
    public void addEdge(int source, int destination){
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }
    
    public void degree(int source) throws Exception{
        System.out.println("degree vertex " + source + " : " + list[source].size());
        int k, totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex;i++){
            for(int j = 0; j<list[i].size(); j++){
                if(list[i].get(j)==source){
                    ++totalIn;
                }
            }
            
            for(k = 0; k<list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree from vertex " + source + " : " + totalIn);
        System.out.println("Outdegree from vertex " + source + " : " + totalOut);
        System.out.println("Degree vertex " + source + " : " + (totalIn+totalOut));
    }
    
    public void removeEdge(int source, int destination)  throws Exception{
        for(int i=0;i<list[source].size();i++){
            if(list[source].get(i) == destination){
                list[source].remove(i);
            }
        }
        for(int j=0;j<list[destination].size();j++){
            if(list[destination].get(j) == source){
                list[destination].remove(j);
            }
        }
    }
    
    public void removeALlEdges(){
        for(int i=0; i < vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph cleared successfully");
    }
    
    public void printGraph() throws Exception{
        for(int i=0;i<vertex;i++){
            if(list[i].size()>0){
                System.out.print("Vertex " + i + " connected with : ");
                for(int j=0;j<list[i].size();j++){
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2);
    }
}
