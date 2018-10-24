import java.util.*;
public class Fibo{
   public static void main(String[] args){

   int f1 = 0;
   int f2 = 1;
   int f3 = 0;
   
   Scanner sc = new Scanner(System.in);
   System.out.println("How many fibonacci numbers do you want?");
   int input = sc.nextInt();
   
   System.out.print("0, ");//hacky way to get the zero first 
   for(int i = 0; i < input; i++){
      f3 = f1 + f2;
      System.out.print(f3 + ", ");
      f1 = f2;
      f2 = f3;
      
   }
   

   }
}