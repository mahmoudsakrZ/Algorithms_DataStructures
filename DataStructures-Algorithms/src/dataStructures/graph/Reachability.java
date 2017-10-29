package dataStructures.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reachability {
    /*
        this algorithm is for create an undirected unweighted graph
        by adding number of vertices && number of edges
        then add connected edges
        vertices naming start with 1 to v

     */
    // Adjacency List for creating the graph
    static List<Integer> [] arr;
    static int a,b,v;
    // this flag for testing if the two nodes have a path or not
    static int flag=0;
    // initialize a adjacency list for the graph
    public static void adjList(int v){
        arr=(List<Integer>[]) new List[v];
        for (int i=0;i<v;i++){
            arr[i]=new ArrayList<>();
        }
    }

    //add edges between the vertices of the graph   x -> y
    public static void addEdge(int x,int y){
        arr[x-1].add(y-1);
        arr[y-1].add(x-1);

    }
    /*public static void printGraph(int v){
        int count =1;
        for (int i=0;i<v;i++){
            System.out.println("----------- Vertex "+count+"------------");
            for (int j=0;j<arr[i].size();j++){
                System.out.println(arr[i].get(j)+1);
            }
            count++;
        }
    }*/


    // this method for find the a path
    public static void DFS(int a, int b){
        boolean visited []=new boolean[v];
        DFSExplore(a,b,visited);
        System.out.println(flag);

    }

    public static void DFSExplore(int v,int b, boolean visited[]){
        int sec=b;
        visited[v]=true;
        for (int i=0;i<arr[v].size();i++){
            int n=arr[v].get(i);
            if(n==b){
                flag=1;
                break;
            }
            if(!visited[n]){
                DFSExplore(n,sec,visited);
            }
        }


    }

    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         v=s.nextInt();
         int m=s.nextInt();
        adjList(v);
        for (int i=0;i<m;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            addEdge(x,y);
        }
            a = s.nextInt();
            b = s.nextInt();
            //printGraph(v);
            DFS(a - 1, b-1 );

    }


}
