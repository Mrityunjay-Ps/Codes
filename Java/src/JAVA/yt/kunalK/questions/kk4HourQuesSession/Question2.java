package Java.kkDSAAlgo.questions.kk4HourQuesSession;
/*
 * Floor of a number....
 * we have given an array of n element which are sorted
 *
 * */
public class Question2 {
    public static void main(String[] args) {
        int [] arr = {2, 5, 11, 16, 21, 23, 55};
        int target = 18;
        int Floor = floorOfNumber(arr,target);

        if (Floor==target)
            System.out.println(Floor);
        else
            System.out.println(Floor+" as it the greatest number which is smaller than "+target);
    }

    static int floorOfNumber(int[] arr, int tar)
    {
        int start = 0;
        int end = arr.length-1;

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
