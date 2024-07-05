package stringMethods;
import java.lang.*;

public class regularExp {
    
    public static void main(String args[]){
        
        //Find if a number is binary or not...
//        String binary = "1001101";
//        
//        String str = binary.valueOf(binary);
//        System.out.println(str.matches("[01]*"));
        
        
        //Find is a number is hexa-decimal or not...
//        String hexdecimal = "55B";
//        
//        System.out.println(hexdecimal.matches("[0-9A-F]+"));

        //Find is the date in date format...
        
//        String d = "01/12/2000";
//        System.out.println(d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

        //Remove special char from a string...
        
        String str = "a$b#cde/*dg!hs";
        
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

    }
}
