package _01_Basic; 

/* 
* @author Bhanuka 
*/ 
  
import java.util.*; 
  
public class graph_01_BFS { 
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
         
        int[] res = DFS(n, edges, s); 
        for(int i=0; i<n; i++){ 
            System.out.print(res[i] + " "); 
        } 
    } 
     
    static int[] DFS(int n, boolean[][] edges, int s){ 
        int res[] = new int[n]; 
        int count=0; 
         
        boolean visited[] = new boolean[n]; 
        LinkedList<Integer> queue = new LinkedList(); 
         
        queue.add(s); 
        visited[s] = true; 
         
        while(!queue.isEmpty()){ 
            s = queue.poll(); 
            res[count++] = s; 
            for(int i=0; i<n; i++){ 
                if(visited[i] == false && edges[s][i]==true){ 
                    visited[i] = true; 
                    queue.add(i); 
                } 
           } 

        } 
        return res; 
    } 
} 
 
