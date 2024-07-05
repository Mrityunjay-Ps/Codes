package Java.kkDSAAlgo.Algo.al6CyclicSort;

import java.util.Arrays;

public class CSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        CyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void CyclicSort(int [] arr) {
        int i = 0;
        while (i<arr.length) {
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]) {
                Swapc(arr,i,correct);
            }else
                i++;
        }
    }

    static void Swapc(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


}
