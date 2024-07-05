package Java.kkDSAAlgo.DS.ds1Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        * 2D Array....
        * [5, 6, 8],
        * [10, 13, 18],
        * [12, 54, 16]
        */

        //syntax of 2D array:-
          //column is not important to initalize...
        int[][] arr = new int[3][];
        //OR
        //3X3 2D Array
        int[][] arr2 = {
                {2, 4, 6},
                {12, 26, 55},
                {45, 86, 25}
        };

        //we can write an array like this also...
            //this is called as jaged array...
        int[][] arr2D = {
                {4, 8, 12}, //0 index
                {12, 18}, //1 index
                {14, 45, 28, 22} //2 index
        };

        //input
            //we have to write 2 for loop:-
            //1 for array index..
            //2 for filling those index with array..
        //In 2D array if we write arr.length the it will give number of rows...
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col<arr[row].length; col++){
                arr2D[row][col] = in.nextInt();
            }

        }

        //output
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col<arr[row].length; col++){
                System.out.print(arr2D[row][col]);
            }
            //this print statement as after printing every row it will go to next line....
            System.out.println();
        }

        //another way to get output
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }

        //3rd way to print 2D array
        for(int[] a:arr2D){
            System.out.println(Arrays.toString(a));
        }
    }
}
