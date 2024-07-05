package JAVA.practice;

import java.util.Scanner;


public class amstrongNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int m = num;
        int amgstr = 0;
        while(num>0)
        {
            int rem = num%10;
                num = num/10;
            amgstr = amgstr+(rem*rem*rem);
        }
        if(amgstr==m)
        {
            System.out.println("Is a amgstrong number.");
        }else{
            System.out.println("Is not a amgstrong number.");
        }
    }
}
