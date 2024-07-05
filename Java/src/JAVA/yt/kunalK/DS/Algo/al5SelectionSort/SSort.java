package Java.kkDSAAlgo.Algo.al5SelectionSort;
/*
* In Selection sort we select an index and find the min element for that index and then swap
*
* Complexities:-
*   Best Case - O(n*n)
*   Worst Case - O(n*n)
* */
import java.lang.reflect.Array;
import java.util.Arrays;

public class SSort {
    public static void main(String[] args) {

        int[] arr = {16, 7, 12, 22, 4, 87};
        int len = arr.length;
        Selection(arr,len);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr, int length)
    {
        for (int i = 0; i < length-1; i++) {
            int iMin = i;

            for (int j=i+1; j < length; j++) {
                if(arr[j] < arr[iMin])
                    iMin = j;
            }
            int temp = arr[i];
            arr[i] = arr[iMin];
            arr[iMin] = temp;
        }
    }
}
