package Java.practice;
//Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative
//or non-integer. If the array does not contain any numbers then you should return 0.

public class sumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8};
        float sum = sumArr(arr);
        System.out.println(sum);
    }
    static float sumArr(int[] arr) {
       int lengthOfArr = arr.length;

       if (lengthOfArr == 0){
           return 0;
       }

        int sum=0;
        for (int index = 0; index <= lengthOfArr-1; index++) {
            sum = sum + arr[index];
        }

        return sum;
    }
}
