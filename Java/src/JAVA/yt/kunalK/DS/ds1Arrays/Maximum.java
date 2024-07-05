package Java.kkDSAAlgo.DS.ds1Arrays;

import java.util.Arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 25, 8, 11};
//        System.out.println(findMax(arr));
//        System.out.println(findMaxInRange(arr,1,4));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    //consider the array is not empty...
    static int findMax(int[] arr){
        int setMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>setMax){
                setMax=arr[i];
            }
        }
        return setMax;
    }

    static void reverseArray(int[] arr){
        //This is two pointer method..as we use start and end as pointers..
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static int findMaxInRange(int[] arr, int startRange, int endRange){
        int setMax = startRange;
        //consider the array is not empty...
        for (int i=startRange; i<=endRange; i++){
            if (arr[i]>setMax){
                setMax=arr[i];
            }
        }
        return setMax;
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
