package Java.kkDSAAlgo.DS.ds1Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        //MultiDimensional ArrayList...
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        //initalization...
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //add element...
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        //print
        System.out.println(list);
    }
}
