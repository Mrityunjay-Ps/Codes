package Java.practice;

public class reverseCopyOfArray {
    public static void main(String args[])
    {
        int A[]={5,8,11,13,15,18,20,22};
        int B[]=new int[8];
        
        for(int i=A.length-1,j=0; i>=0; i--,j++)
        {
            B[j]=A[i];
        }
        A=B;
        
        for(int x:B)
        {
            System.out.print(x+",");
        }
        
    }
}
