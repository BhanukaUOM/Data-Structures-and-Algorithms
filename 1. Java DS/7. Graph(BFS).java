import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*; 
  
class graph{ 
    private int v; 
    private LinkedList<Integer>[] adj; 
     
    graph(int v){ 
        this.v = v; 
        adj = new LinkedList[v]; 
        for(int i=0; i<v; i++) 
            adj[i] = new LinkedList(); 
    } 
     
    void addEdge(int x, int y){ 
        adj[x].add(y); 
        adj[y].add(x); 
    } 
     
    void BFS(int s){ 
        LinkedList<Integer> q = new LinkedList<>(); 
        boolean[] visited = new boolean[v]; 
        q.add(s); 
        visited[s] = true; 
         
        while(!q.isEmpty()){ 
            s = q.poll(); 
            System.out.println(s); 
             
            while(!adj[s].isEmpty()){ 
                int l = adj[s].poll(); 
                if(visited[l] == false){ 
                    visited[l] = true; 
                    q.add(l); 
                } 
            } 
        } 
    } 
     
} 
  
public class Solution { 
  
     
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        graph g = new graph(5); 
         
        g.addEdge(0, 1); 
        g.addEdge(0, 4); 
        g.addEdge(3, 1); 
        g.addEdge(4, 2); 
         
        g.BFS(0); 
    } 
} 
