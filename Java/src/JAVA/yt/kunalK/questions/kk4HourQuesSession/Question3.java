package Java.kkDSAAlgo.questions.kk4HourQuesSession;
/*
* Find the position of a number in a sorted infinte array...
* so here we are assuming that we have a infinte array but as it is not possible so will assume that array is
* infinite and we will not use array.length method...
*
* */
public class Question3 {
    public static void main(String[] args) {

    }

    static int BinarySearch(int[] arr, int tar, int start, int end)
    {
        while (start<=end){
            //find middle element
            int mid = start + (end-start) / 2;

            if (tar < arr[mid]){
                end = mid - 1;
            } else if (tar > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return arr[end];

    }
}
