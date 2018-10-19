import java.util.Scanner;
import java.lang.Math;

public class hypotenuse {
   public static void main(String[] args) {
      Scanner legs = new Scanner(System.in);
      System.out.println("This program finds the hypotenuse of a right triangle.");
      System.out.print("Please enter the first leg of the triangle: ");
      double first = Double.parseDouble(legs.nextLine());
      System.out.print("Please enter the second leg of the triangle: ");
      double second = Double.parseDouble(legs.nextLine());
      double h = Math.sqrt(first * first + second * second);
      System.out.println("The hypotenuse is " + h);
   } 
}