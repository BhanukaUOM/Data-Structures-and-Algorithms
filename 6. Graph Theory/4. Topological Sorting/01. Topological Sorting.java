package _03_Topological_Sorting; 
  
import java.util.*; 
  
/* 
* @author Bhanuka 
*/ 
public class _04_Directed_Acycle_Graph { 
    public static void main(String[] args){ 
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
         
        int m = in.nextInt(); 
        boolean[][] edges = new boolean[n][n]; 
         
        for(int i=0; i<m; i++){ 
            int x = in.nextInt(); 
            int y = in.nextInt(); 
            edges[x][y] = true; 
        } 
         
        DFS(n, edges); 
    } 
     
    static void DFS(int n, boolean[][] edges){ 
        boolean[] visited = new boolean[n]; 
        Stack<Integer> stack = new Stack(); 
        for(int i=0; i<n; i++) 
            if(visited[i]==false) 
                DFSUtil(n, edges, visited, i, stack); 
         
        while(!stack.isEmpty()){ 
            System.out.print(stack.pop() + " "); 
        } 
    }
     
    static void DFSUtil(int n, boolean[][] edges, boolean[] visited, int s, Stack stack){ 
        visited[s]=true; 
        System.out.println(s); 
        for(int i=0; i<n; i++){ 
            if(edges[s][i] == true && visited[i]==false){ 
                DFSUtil(n, edges, visited, i, stack); 
            } 
        } 
        stack.push(s); 
    } 
} 
 
