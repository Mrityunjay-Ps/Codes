package Java.practice;

import java.util.Scanner;

public class rightRotationOfArray {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int A[] = {3,9,7,8,12,6,15,5,4,10,16};
       
        for (int x:A){
            System.out.print(x+" ");
        }
        System.out.println();
        int temp = A[A.length-1];
        for(int i = A.length-2; i>=0; i--)
        {
            A[i+1]=A[i];           
        }
        A[0]=temp;
//        
        for(int x:A){
            System.out.print(x+" ");
        }  
        System.out.println();
    }
}