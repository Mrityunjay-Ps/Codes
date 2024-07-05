package Java.practice;

import java.util.Scanner;

public class primeNumber {

    static void primeNum(int num) {
        if (num<=1){
            System.out.println("not a prime");
        }
        if (num%num==0) {
            System.out.println(num + " is a prime number.");
        }else {
            System.out.println(num + " is not a prime number.");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = in.nextInt();
        primeNum(number);
    }
}
