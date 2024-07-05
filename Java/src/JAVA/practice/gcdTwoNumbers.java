package Java.practice;

public class gcdTwoNumbers {

    static void commanDivisior(int a, int b) {
        System.out.println("The gcd of "+a+b+" is: ");
        while(a!=b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }




    public static void main(String[] args) {
        int m = 25, n=15;
        commanDivisior(m,n);
    }
}
