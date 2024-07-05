package Java.practice;

public class recursionMethod {

    static void fun(int n){
        if (n>0) {
            System.out.println(n);
            fun(n-1);
        }
    }

    public static void main(String[] args) {
        fun(4);
    }
}
