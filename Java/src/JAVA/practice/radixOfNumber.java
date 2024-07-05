package Java.practice;
import java.util.*;

public class radixOfNumber {
    
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = in.nextLine();
        
        if (str1.matches("[10]+")){
            System.out.println("The radix of a string is 2(Binary).");
        }else if(str1.matches("[0-8]+")){
            System.out.println("The radix of a string is 8(Octal).");
        }else if(str1.matches("[0-9]")){
            System.out.println("The radix of a string is 10(Decimal).");
        }else if(str1.matches("[0-9A-F]+")){
            System.out.println("The radix of a string is 16(Hexadecimal).");
        }else{
            System.out.println("The string is wrong....");
        }
    }
}
