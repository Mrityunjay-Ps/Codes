package Java.practice;

import java.util.Scanner;

public class displayApSeries {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter stating number: ");
        int startNum = in.nextInt();//a
        System.out.print("Enter the differnce of number: ");
        int numDiff  = in.nextInt();//d
        System.out.print("Enter till number you want: ");
        int tillTerm = in.nextInt();//n
        
        int Term = startNum;//a
        for(int i = 0; i<tillTerm; i++)
        {
            System.out.println(Term);
            Term=Term+numDiff;
        }
        
        
        
    }
}
