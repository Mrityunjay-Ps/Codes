package Java.kkDSAAlgo.Algo.al4BubbleSort;
/*
* In this Bubble Sort we compare two adjcent element and if 1st is larger than 2nd element,
* we swap that element...
*
* Complexities:-
*   Best Case - O(n)
*   Worst Case - O(n*n)
* */
import java.util.Arrays;

public class BS {
    public static void main(String[] args) {
        int[] unSorted = {1,2,3,4,5};
        BullbleSort(unSorted);
        System.out.println(Arrays.toString(unSorted));
    }

    static void BullbleSort(int[] arr) {
        boolean swaped = false;
        //run the steps n-1 time
        for (int i = 0; i < arr.length; i++) {
            //for each step max item will be sorted
            for (int j = 1; j < arr.length - i; j++) {
                //swap element if it is smaller than the previous element
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if (!swaped){
                break;
            }
        }
    }
}
