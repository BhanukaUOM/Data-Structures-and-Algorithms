import java.io.*; 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
import java.util.Scanner; 
  
public class Solution { 
  
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        String str = in.nextLine();
         
        Pattern r = Pattern.compile("aba"); 
        Matcher m = r.matcher(str); 
 
        int count = 0; 
        while(m.find()){        //count how many 
            count++; 
        } 
        System.out.println(count); 
         
    } 
} 
