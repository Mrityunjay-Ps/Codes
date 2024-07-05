package Java.practice;
import java.util.*;

public class oddOReven {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int number1 = in.nextInt(); //taking input
        
        //condition...
        if(number1%2==0){
            System.out.println("Number is even.");
        }else{
            System.out.println("Number is odd.");
        }
    }
}
