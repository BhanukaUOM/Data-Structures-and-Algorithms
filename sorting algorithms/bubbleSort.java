import java.util.Arrays;   
import java.util.Scanner;

public class bubbleSort {
    void bubble_Sort(int A[],int n){
    int temp;
    for(int k = 0;k<n-1;k++){
    for(int i = 0;i<n-k-1;i++){
    if(A[i]<A[i+1]){
    temp = A[i];
    A[i] = A[i+1];
    A[i+1] = temp;
          }
        }
      }
   }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for(int i = 0;i<N;i++){
    A[i] = sc.nextInt();
    }
    bubbleSort b = new bubbleSort();
    b.bubble_Sort(A,N);
    System.out.println(Arrays.toString(A));
    }
}