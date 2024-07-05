package Java.kkDSAAlgo.Algo.al1LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr2 = {
                {2, 4, 6},
                {12, 26, 55},
                {45, 86, 25}
        };

        int target = 55;
        int[] ans = Search2D(arr2, target);
        System.out.println(Arrays.toString(ans));
    }

    //return index of the element
    static int[] Search2D(int[][] arr, int tar){

        for (int row = 0; row<arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==tar)
                    return new int[]{row, col};
            }
        }

        return new int[]{-1, -1};
    }
}
