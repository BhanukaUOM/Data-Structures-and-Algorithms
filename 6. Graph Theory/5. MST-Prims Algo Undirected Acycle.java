package _04_Minimum_Spanning_Tree; 
  
import java.util.*; 
  
/*
* @author Bhanuka 
*/ 
public class _05_prims_algo { 
    public static void main(String[] args){ 
        Scanner in = new Scanner(System.in); 
         
        int n = in.nextInt(); 
        int m = in.nextInt(); 
        int[][] edges = new int[n][n]; 
        for(int i=0;i<n;i++) 
            for(int j=0;j<n;j++) 
                edges[i][j] = 999999; 
                 
        for(int i=0; i<m; i++){ 
            int x = in.nextInt(); 
            int y = in.nextInt(); 
            int z = in.nextInt(); 
            edges[x][y] = z; 
            edges[y][x] = z; 
        } 
         
        PMST(n, edges); 
    } 
     
    static void PMST(int n, int edges[][]){ 
        boolean[] visited = new boolean[n]; 
        visited[0] = true; 
        int min=0, sum=0, col=0; 
        for (int k=0; k<n; k++){             
            min = 9999999; 
            for(int j=0;j<n;j++){ 
                if(visited[j]==true){ 
                    for(int i=0; i<n; i++){ 
                        if(visited[i]==false){ 
                            if(min>edges[j][i]){ 
                                min = edges[j][i]; 
                                col = i; 
                            } 
                        } 
                    } 
                } 
            } 
            visited[col] = true; 
            if(min<99999) 
                sum += min; 
        } 
        System.out.println(sum); 
    } 
} 
 
