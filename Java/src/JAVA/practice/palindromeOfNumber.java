package Java.practice;
import java.util.Scanner;

public class palindromeOfNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int reverse=0;
        int cpNum = num;
        while(num!=0)
        {
            int rem = num%10;
                reverse = ((reverse*10)+rem);
                num = num/10;
                
        }
        if(reverse == cpNum)
        {
            System.out.println(reverse+" is palindrome.");
        }else{
            System.out.println(reverse+" is not palindrome.");
        }
    }
}
