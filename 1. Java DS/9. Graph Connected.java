import java.io.*; 
import java.util.*; 
  
class graph{ 
    private int v; 
    private LinkedList<Integer>[] adj; 
    boolean available; 
     
    graph(int v){ 
        this.v = v; 
        adj = new LinkedList[v]; 
        for(int i=0; i<v; i++){ 
            adj[i] = new LinkedList(); 
        } 
    } 
     
    void addEdge(int u, int w){ 
        adj[u].add(w); 
        adj[w].add(u); 
    } 
     
    boolean is_connect(int u, int w){ 
        available = false; 
        boolean[] visited = new boolean[v]; 
        visited[u] = true; 
         return DFSU(u, w, visited); 
    } 
     
    boolean DFSU(int u, int w, boolean[] visited){ 
        if(u==w){ 
            available = true; 
        } 
         
        while(!adj[u].isEmpty()){ 
            int z = adj[u].poll(); 
            if(visited[z] == false){ 
                visited[z] = true; 
                DFSU(z, w, visited); 
            } 
        } 
        return available; 
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
     
        System.out.println(g.is_connect(0,1)); 
    }  
} 
