package Java.practice;
import java.util.*;
public class searchingElementInArray {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        System.out.println("Enter any number to seach in array: ");
        int searchElement = in.nextInt();
        
        for (int i = 0; i<A.length; i++)
        {
            if(searchElement==A[i])
            {
                System.out.println("Element present in the array");
                System.exit(0);
                
            }
        }
        System.out.println("Element is not present in the array");
    }
}
