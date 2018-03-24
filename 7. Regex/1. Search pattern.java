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
         
        System.out.println(m.find());       //match anywhare 
        System.out.println(m.matches());    //match whole area 
        System.out.println(m.group());      //found results         
    } 
} 
