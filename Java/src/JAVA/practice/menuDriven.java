package Java.practice;

import java.util.Scanner;


public class menuDriven {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any 2 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.nextLine();
        System.out.println("Choose one of the arithmatic operation(ADD, SUB, MULTIPLY, DIVIDE): ");
        String arith = in.nextLine();
        
        switch(arith)
        {
            case "ADD":
                int add = num1+num2;
                System.out.println("Sum of two is " + add);
                break;
            case "SUB":
                int sub = num1-num2;
                System.out.println("Sum of two is " + sub);
                break;
            case "Multiply":
                int mul = num1*num2;
                System.out.println("Sum of two is " + mul);
                break;
            case "Divide":
                int divide = num1/num2;
                System.out.println("Sum of two is " + divide);
                break;
            default:
                System.out.println("Invalid operator...");
        }
        
    }
}
