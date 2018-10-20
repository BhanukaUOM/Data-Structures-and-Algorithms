import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

   static void insertion_Sort(int a[]){
	int temp, j;
        for(int i = 0; i < a.length; i++){
            temp = a[i];
	    j = i;
            while(j > 0 && temp < a[j-1]){
		a[j] = a[j-1];
		j = j-1;
	    }
	    a[j] = temp;
        }
    }
    
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
	int array [], n;

	System.out.println("How many sloats: ");
	n = in.nextInt();
	array = new int[n];
        for(int i = 0; i < n; i++){
	    System.out.print(i + 1 + ": ");
	    array[i] = in.nextInt();
        }
        insertion_Sort(array);
        System.out.print(Arrays.toString(array));
    }
}
