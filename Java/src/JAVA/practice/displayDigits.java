package Java.practice;
import java.util.Scanner;

public class displayDigits {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int countDigit = 0;
        
        while(num!=0)
        {
            int rem = num%10;
                num = num/10;
//                System.out.println(rem);
                countDigit++;
        }
        System.out.println(countDigit);
        
    }
}
