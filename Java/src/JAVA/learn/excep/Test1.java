package Java.practice.excep;

public class Test1 {
    public static void main(String[] args) {
        int a, b, c;
        try {
            a = 10;
            b = 2;
            c = a/b;
            System.out.println("Result "+c);
        }catch (ArithmeticException e){
            System.out.println("Division by 0 error ");
        }
    }
}
