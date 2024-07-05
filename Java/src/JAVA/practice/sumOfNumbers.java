package Java.practice;
import java.util.Scanner;

public class sumOfNumbers{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int i = in.nextInt();
        int sum = 0;
        for(int j=0; j<=i; j++)
        {
            sum = sum+j;
        }
        System.out.println(sum);
        
        
    }
}
