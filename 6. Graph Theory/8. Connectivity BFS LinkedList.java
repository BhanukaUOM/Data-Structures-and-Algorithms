import java.io.*;
import java.util.*;
import java.util.LinkedList;

class Graph
{
    private int V; 
    private LinkedList<Integer> adj[];
    
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    
    void addEdge(int v,int w)  {   
        adj[v].add(w);   
    }
    
    Boolean isReachable(int s, int d)
    {
        LinkedList<Integer>temp;
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        
        Iterator<Integer> i;
        while (!queue.isEmpty())
        {
            s = queue.poll();
 
            int n;
            i = adj[s].listIterator();
            while (i.hasNext())
            {
                n = i.next();
                if (n==d)
                    return true;
 
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return false;
    }
 
    public static void main(String args[])
    {
        int u,v;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Graph g = new Graph(n);
        
        int m = in.nextInt();
        for(int i=0; i<m; i++){
            u = in.nextInt();
            v = in.nextInt();
            g.addEdge(u, v);
            g.addEdge(v, u);
        }
        int z = in.nextInt();
        for(int i=0; i<z; i++){
            u = in.nextInt();
            v = in.nextInt();
            if(g.isReachable(u, v))
                System.out.println("IS_CONNECTED");
            else
                System.out.println("NOT_CONNECTED");
        }
    }
}
