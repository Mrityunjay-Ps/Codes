package Java.kkDSAAlgo.DS.ds1Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(56);
        list.add(856);
        list.add(56);
        list.add(856);
        list.add(56);
        list.add(856);
        list.add(56);
        list.add(856);
        list.add(56);
        list.add(856);
        list.add(56);
        list.add(856);
        list.add(56);
        list.add(856);
        list.add(56);
        list.add(856);
        list.add(56);
        list.add(856);
        list.add(5);
        list.add(856);
        list.add(56);
        list.add(856);
        list.add(56);
        list.add(856);

//        System.out.println(list);

//        System.out.println(list.contains(5));
//        System.out.println(list.set(1,587));
//        System.out.println(list.remove(2));

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get index at any index..
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}
