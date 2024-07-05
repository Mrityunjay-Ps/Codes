package Java.practice;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        
        for(int i = 1; i<=10; i++){
            int multi = i*number;
            System.out.println(number + " * " + i + " = " + multi);
        }
    }
}
