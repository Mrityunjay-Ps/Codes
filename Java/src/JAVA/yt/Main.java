package JAVA.yt;

import java.util.*;
import java.util.stream.Stream;

public class Main {


    public final static int a = 10;
    public static void main(String[] args) {


//        System.out.println(factorial(12));

        pattern2(3);

//        List<Integer> list = new ArrayList(List.of(4,5,8,8,9));
//
//        list.stream()
//                .filter(n->n%2==1)
//                .sorted()
//                .map(n->n*2)
//                .forEach(System.out::println);



    }

    public static int factorial(int num){
        int fact = 1;

        if (num == 0){
            return 0;
        }

        if (num == 1){
            return fact;
        }

        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }

        return fact;

    }

    public static void pattern(int num){
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

        }
    }

    public static void pattern2(int num){
        for (int i = 0; i <= num ; i++) {
            for (int j = 0; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
