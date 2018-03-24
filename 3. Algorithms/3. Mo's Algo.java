//Sum of given range 
 
import java.util.Scanner; 
  
/* 
* @author Bhanuka 
*/ 
public class Mos_algo { 
    public static void main(String[] args){ 
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
        int[] arr = new int[n]; 
        for(int i=0; i<n; i++) 
            arr[i] = in.nextInt(); 
         
        int t = in.nextInt();         
        int sum = 0, start=-999, end=-999; 
        while(t>0){ 
            t--; 
            int s = in.nextInt()-1; 
            int e = in.nextInt()-1; 
            if(s>e){ 
                int swapTmp = s; 
                s = e; 
                e = swapTmp; 
            } 
             
            if(start==-999 && end==-999){ 
                start = end = s; 
                sum += arr[start]; 
            } 
            while(start<s){ 
                sum -= arr[start++]; 
            } 
            while(start>s){ 
                sum += arr[--start]; 
            } 
            while(end<e){ 
                sum += arr[++end]; 
            } 
            while(end>e){ 
                sum -= arr[end--]; 
            } 
            System.out.println(sum); 
        } 
    } 
} 
 
