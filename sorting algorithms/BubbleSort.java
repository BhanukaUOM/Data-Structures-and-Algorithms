import java.util.Arrays;   
import java.util.Scanner;

public class BubbleSort {

    static void bubble_Sort(int [] array){
        int temp;
        for(int k = 0; k< (array.length) - 1; k++){
            for(int i = 0; i < (array.length) - k - 1; i++){
                if(array[i] < array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                  }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, array[];

        System.out.println("How many numbers: ");
        n = sc.nextInt();
        
        array = new int[n];
        
        for(int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        bubble_Sort(array);
        System.out.println(Arrays.toString(array));
    }
}

