package JAVA.practice;

public class increaseSizeOfArray {
    public static void main(String args[])
    {
        int A[]={5,8,11,13,15,18,20,22};
        int B[]= new int[2*A.length];
        
        for(int i=0; i<A.length; i++)
        {
            B[i]=A[i];
        }
        A=B;
        B=null;
        for(int x:A)
        {
            System.out.print(x+" ");
        }
    }
}
