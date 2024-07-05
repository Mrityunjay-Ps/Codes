package Java.kkDSAAlgo.DS.ds1Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner in = new Scanner(System.in);

//        System.out.println("Enter an element:- ");
        //to add element in array..
//        arr[0]=1;
//        arr[1]=10;
//        arr[2]=22;
//        arr[3]=28;
//        arr[4]=50;
        //it stores like this [1, 10, 22, 28, 50]....

        //There is more easy way to store the data (using for loop)....
//        for (int i=0; i< arr.length; i++)
//        {
//            arr[i]=in.nextInt();
//        }

        //To print an array...
//        for (int i=0; i< arr.length; i++)
//        {
//            System.out.println(arr[i]);
//        }

        //as we use for loop to display but we can go for enhance for loop(for each loop)...
//        for (int j : arr) {
//            System.out.println(j);//here j represent element of the array...
//        }

        //we can print like this and this is the best one...
//        System.out.println(Arrays.toString(arr));

        //array of objects...
        String []str = new String[5];
        for(int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }

        System.out.println(Arrays.toString(str));



    }
}
