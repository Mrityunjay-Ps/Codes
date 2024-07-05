package Java.practice;

public class deleteElementFromArray {
    public static void main(String args[])
    {
        int A[] = new int[10];
        A[0]=5; A[1]=8; A[2]=9; A[3]=15; A[4]=16; A[5]=18;
        
        int n = 6;
        
        for(int i = 0; i<n; i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println();
    }
}
