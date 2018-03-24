package _02_Cycle; 
  
import java.util.*; 
  
/* 
* @author Bhanuka 
*/ 
  
public class graph_03_Cycle_in_Directed_Graph { 
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
        } 
         
        //System.out.println("Enter start vertex: "); 
        //int s = in.nextInt(); 
         
        DFS(n, edges); 
    } 
    static int count = 0; 
    static void DFS(int n, boolean[][] edges){ 
        int cycle = 0;   //can't use 
        boolean[] visited = new boolean[n]; 
        for(int i=0; i<n; i++) 
            if(visited[i]==false) 
                DFSUtil(n, edges, i, visited, cycle); 
        System.out.println("Has "+cycle+" Cycles"); 
        System.out.println("Has "+count+" Cycles"); 
        System.out.println(Arrays.toString(visited)); 
    } 
     
    static void DFSUtil(int n, boolean[][] edges, int s, boolean[] visited, int cycle){   
        Stack<Integer> stack = new Stack(); 
        stack.push(s); 
        visited[s] = true; 
         
        for(int i=0; i<n; i++){ 
            if(edges[s][i]==true && visited[i]==true){ 
                count++; 
            } 
            if(edges[s][i]==true && visited[i]==false){ 
                DFSUtil(n, edges, i, visited, cycle); 
            } 
        } 
    } 
} 
 
