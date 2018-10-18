import java.util.*;
import java.io.*;
public class Permutation_And_Combination
{
    public static void main (String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //Test Cases
        while (t-- > 0) {

            int n = sc.nextInt();  //Number
            int even = n / 2;      //Number of Even Numbers from 1 to N inclusive
            int odd = n - even;    //Number of Odd Numbers from 1 to N inclusive

            long extra = (long)((odd * (odd - 1)) * even) / 2;    //Finding All possible combinations for odd numbers
            long extra1 = (long)(even * (even - 1) * (even - 2)) / 6;      //Finding All possible combinations for even numbers
            System.out.println(extra + extra1);}

    }
}
