
package Java.practice;

public class copyArray {
    public static void main(String args[])
    {
        int A[]={5,8,11,13,15,18,20,22};
        int B[]=new int[10];
        
        for(int i = 0; i<A.length; i++)
        {
            B[i]=A[i];
        }
        A=B;
        for(int x:B){
            System.out.print(x+" ");
        }
    }
}
