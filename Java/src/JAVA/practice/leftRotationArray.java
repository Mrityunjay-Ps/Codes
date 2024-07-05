package Java.practice;

import java.util.Scanner;

public class leftRotationArray {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int A[] = {3,9,7,8,12,6,15,5,4,10,16};
        int temp = A[0];
        
        for(int i = 1; i<A.length; i++)
        {
            A[i-1]=A[i];           
        }
        A[A.length-1]=temp;
        
        for(int x:A){
            System.out.print(x+",");
        }   
    }
}
