package Java.kkDSAAlgo.questions.kk4HourQuesSession;
/*
* Sealing of a number....
* we have given an array of n element which are sorted
*
* */
public class Question1 {
    public static void main(String[] args) {
        int [] arr = {2, 5, 11, 16, 21, 23, 55};
        int target = 18;
        int Sealing = sealingOfNumber(arr,target);
        if (Sealing==target)
            System.out.println(Sealing);
        else
            System.out.println(Sealing+" as it the smallest number which is greater than "+target);
    }

    static int sealingOfNumber(int[] arr, int tar)
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
        return arr[start];

    }
}