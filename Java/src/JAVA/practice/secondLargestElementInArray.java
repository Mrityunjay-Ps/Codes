package Java.practice;

import java.util.Scanner;

public class secondLargestElementInArray {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int A[] = {3,9,7,8,12,6,15,5,4,10,16};
        int firstLargeNum=0, secondLargeNum=0;
        
        firstLargeNum=secondLargeNum=A[0];
        
        for(int i = 0; i<A.length; i++)
        {
            if(A[i]>firstLargeNum)
            {
                secondLargeNum=firstLargeNum;
                firstLargeNum=A[i];
            }
            else if(A[i]>secondLargeNum){
                secondLargeNum=A[i];
            }
        }
        System.out.println("Second Largest number is "+secondLargeNum);
    }
}
