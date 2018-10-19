import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class SelectionSort {
    void swap(int x, int y){
    int temp = x;
    x = y;
    y = temp;
    }
    void selection_Sort(int A[], int n){
    int minimum;
    for(int i = 0;i<n-1;i++){
    minimum = i;
    for(int j = i+1;j<n;j++){
    if(A[j]<A[minimum]){
    minimum = j;
    }
    }
    swap(A[minimum],A[i]);
    }
    }
    public static void main(String[] args) throws Exception{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int N = Integer.parseInt(br.readLine());
     int[] A = new int[N];
     for(int i = 0;i<N;i++){
     A[i] = Integer.parseInt(br.readLine());
     }
     SelectionSort b = new SelectionSort();
     b.selection_Sort(A, N);
    System.out.print(Arrays.toString(A));
    }
}