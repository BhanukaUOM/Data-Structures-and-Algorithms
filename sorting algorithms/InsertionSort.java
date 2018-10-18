import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;


public class InsertionSort {
    void insertion_Sort(int A[], int n){
    for(int i = 0;i<n;i++){
    int temp = A[i];
    int j =i;
   
    while(j>0 && temp<A[j-1]){
    A[j] = A[j-1];
    j = j-1;
    }
    A[j] = temp;
    }
    }
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    for(int i = 0;i<N;i++){
    A[i] = Integer.parseInt(br.readLine());
    }
InsertionSort b = new InsertionSort();
    b.insertion_Sort(A, N);
    System.out.print(Arrays.toString(A));
    }
}