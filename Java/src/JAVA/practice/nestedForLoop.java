package Java.practice;

import java.util.Scanner;

public class nestedForLoop {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        for(int i = 1; i<=5; i++)
        {
            for(int j = 1; j<=5; j++)
            {
                System.out.print(i+","+j+" ");
            }
            System.out.println();
        }

    }
}
