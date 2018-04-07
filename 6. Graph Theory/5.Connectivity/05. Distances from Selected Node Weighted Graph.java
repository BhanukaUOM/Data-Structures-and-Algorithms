import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int minresultance(int result[], boolean visited[], int V)
        {
            int min = 99999999;
            int min_index=-1;

            for (int v = 0; v < V; v++){
                if (visited[v] == false && result[v] <= min)
                {
                    min = result[v];
                    min_index = v;
                }
            }
            return min_index;
        }
    
    static int[] bfs(int n, int[][] edges, int s) {
        int[] result = new int[n];
        for (int i=0; i<n; i++)
            result[i] = 99999999;
        result[s] = 0;
        
        boolean[] visited = new boolean[n];
        
        int tmp = s;
        
        while(tmp != -1){    
            visited[tmp] = true;
            for(int i=0; i<n; i++){
                if(edges[tmp][i]>0 && result[i] > result[tmp] + edges[tmp][i]){
                    result[i] = result[tmp] + edges[tmp][i];
                }
            }
            tmp = minresultance(result, visited, n);
        }
        
        return result;        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
          int n = in.nextInt();
          int m = in.nextInt();

          int[][] edges = new int[n][n];

          for(int i=0; i<m; i++){
              int x = in.nextInt() - 1;
              int y = in.nextInt() - 1;
              int w = in.nextInt();
              if (edges[x][y]==0 || edges[x][y]>w){
                  edges[x][y] = w;
                  edges[y][x] = w;
              }
          }

          int s = in.nextInt() - 1;
          int[] result = bfs(n, edges, s);
          for (int i = 0; i < result.length; i++) {
              if (result[i] == 99999999)
                  System.out.print("-1 ");
              else if (result[i] != 0)
                  System.out.print(result[i] + " ");
          }
          System.out.println("");
            
        in.close();
    }
}
