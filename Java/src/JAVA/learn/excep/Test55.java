package Java.practice.excep;

import java.util.Scanner;

class Excp55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any two number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c;

        try{
            c=a/b;
            System.out.println("Answer: "+c);
        }catch (ArithmeticException e){
            System.out.println("Enter non-zero value");
            System.out.println("Try again");
        }

    }
}
