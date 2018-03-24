package _01_Basic; 
  
import java.util.*; 
  
/* 
* @author Bhanuka 
*/ 
  
public class graph_02_DFS { 
    public static void main(String[] args){ 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter no. of Nodes: "); 
        int n = in.nextInt(); 
        System.out.println("Enter no. of Edges: "); 
        int e = in.nextInt(); 
         
        System.out.println("Enter Edges: "); 
        boolean[][] edges = new boolean[n][n]; 
        for(int i=0; i<e; i++){ 
            int x = in.nextInt(); 
            int y = in.nextInt(); 
            edges[x][y] = true; 
            edges[y][x] = true; 
        } 
         
        System.out.println("Enter start vertex: "); 
        int s = in.nextInt(); 
         
        DFS(n, edges, s); 
    } 
     
    static void DFS(int n, boolean[][] edges, int s){ 
        boolean[] visited = new boolean[n]; 
        DFSUtil(n, edges, s, visited); 
         
      /*for check every vertex in disconnected graph] 
        for(int i=0; i<n; i++) 
            if(visited[i] == false) 
                DFSUtil(n, edges, i, visited); 
      */ 
    } 
     
    static void DFSUtil(int n, boolean[][] edges, int s, boolean[] visited){   
        Stack<Integer> stack = new Stack(); 
        stack.push(s); 
        visited[s] = true; 
        System.out.print(s+" "); 
         
        for(int i=0; i<n; i++){ 
            if(edges[s][i]==true && visited[i]==false){ 
                DFSUtil(n, edges, i, visited); 
            } 
        } 
    } 
} 
