import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void bfs(int n, LinkedList[] edges, int s) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[n];
        
        visited[s] = true;
        queue.add(s);
        
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            System.out.println(tmp);
            Iterator<Integer> i = edges[tmp].listIterator();
            while (i.hasNext())
            {
                int elem = i.next();
                if (visited[elem] != true){
                    visited[elem] = true;
                    queue.add(elem);
                }
            }
        }   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();

        LinkedList<Integer>[] edges = new LinkedList[n];
        for(int i=0; i<n; i++)
            edges[i] = new LinkedList<>();

        for(int i=0; i<m; i++){
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            edges[x].add(y);
            edges[y].add(x);
        }

        int s = in.nextInt() - 1;
        bfs(n, edges, s);
        
        in.close();
    }
}
