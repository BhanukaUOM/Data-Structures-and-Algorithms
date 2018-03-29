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

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean[][] arr = new boolean[n][n];

    int t = in.nextInt();
    for(int i=0; i<t; i++){
        int u = in.nextInt();
        int w = in.nextInt();
        arr[u][w] = true;
        arr[w][u] = true;
    }

    t = in.nextInt();
    for(int i=0; i<t; i++){
        int u = in.nextInt();
        int w = in.nextInt();
        if(is_connect(arr,n,u,w))
            System.out.println("IS_CONNECTED");
        else
            System.out.println("NOT_CONNECTED");
    }
}
