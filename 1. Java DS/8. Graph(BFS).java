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
     
    void DFS(int s){ 
        boolean visited[] = new boolean[v]; 
        visited[s] = true; 
        DFSU(visited, s); 
    } 
     
    void DFSU(boolean[] visited, int s){ 
        System.out.println(s); 
        while(!adj[s].isEmpty()){ 
            int i = adj[s].poll(); 
            if(visited[i] == false){ 
                visited[i] = true; 
                DFSU(visited, i); 
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
         
        g.DFS(0); 
    } 
} 
