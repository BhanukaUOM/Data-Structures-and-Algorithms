static boolean result;
static boolean is_connect(boolean[][] arr,int n, int u, int w){
    result = false;
    boolean[] visited = new boolean[n];
    visited[u] = true;
    DFS(arr,n, u, w, visited);
    return result;
}

static void DFS(boolean[][] arr,int n, int u, int w,boolean[] visited){
    if (result==false){
        if(u==w)
            result=true;
        else {
            for(int i=0; i<n; i++){
                if(arr[u][i] && !visited[i]){
                    visited[i] = true;
                    DFS(arr,n, i, w, visited);
                }
            }
        }
    }
}
