package Java.practice;

import java.util.Scanner;

public class numberToWords {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int reverse=0;
        String strRev = "";
        while(num!=0)
        {
            int rem = num%10;
                num = num/10;
                strRev = strRev + rem;
        }
//        System.out.println(strRev);
        
        char c;
        for(int i = strRev.length()-1; i>=0; i--){
            c = strRev.charAt(i);
            
            switch(c)
            {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid Digit..");
                    break;
            }
        }
        
        
        
        
    }
}
