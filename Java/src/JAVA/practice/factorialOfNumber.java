package JAVA.practice;
import java.util.Scanner;

public class factorialOfNumber{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int i = in.nextInt();
        int fac = 1;
        for(int j=1; j<=i; j++)
        {
            fac = fac*j;
        }
        System.out.println(fac);
        
        
    }
}
