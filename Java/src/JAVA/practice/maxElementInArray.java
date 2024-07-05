package Java.practice;

import java.util.Scanner;

public class maxElementInArray {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int A[] = {3,9,7,8,12,6,15,5,4,10,16};
        int largeNumber=0;
        for(int i = 0; i<A.length; i++)
        {
            if(A[i]>largeNumber)
            {
                largeNumber=A[i];
            }
        }
        System.out.println(largeNumber);
    }
}
