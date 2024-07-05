package Java.practice;

public class add2dArray {
    public static void main(String args[])
    {
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int B[][]={{7,8,9},{6,5,4},{1,2,3}};
        int C[][]=new int[3][3];
        
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        
        
    }
}
