package JAVA.practice;

import java.util.Scanner;


public class displayFibonaciSeries {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number till you want the fibonaci series: ");
        int fibTerm = in.nextInt();
        int fibZeroTerm = 0;
        int fibFirstTerm = 1;
        int fibSeries;
        System.out.print(fibZeroTerm+", "+fibFirstTerm);
        for(int i = 0; i<fibTerm-2; i++)
        {
            fibSeries = fibZeroTerm+fibFirstTerm;
            fibZeroTerm = fibFirstTerm;
            fibFirstTerm = fibSeries;
            System.out.print(", "+fibSeries);
            
        }
        System.out.println();
    }
}
