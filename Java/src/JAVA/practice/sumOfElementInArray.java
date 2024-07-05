package Java.practice;

public class sumOfElementInArray {
    public static void main(String args[])
    {
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int sum = 0;
        
        for(int i = 0; i<A.length; i++)
        {
//            System.out.println(A[i]);
            sum=sum+A[i];
        }
        System.out.println(sum);
    }
}
