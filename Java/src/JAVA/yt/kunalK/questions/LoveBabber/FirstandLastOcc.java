package Java.kkDSAAlgo.questions.LoveBabber;
/*
* Question: Find the 1st and last occurance of a number
*
* */
public class FirstandLastOcc {
    public static void main(String[] args) {
        int[] nums = {2, 4, 8, 9, 9, 9, 9, 10, 12, 16};
        int size = nums.length;
        int target = 3;
        System.out.println("First occurance of 3 is at index "+firstOcc(nums,size,target));
        System.out.println("Last occurance of 3 is at index "+lastOcc(nums,size,target));
    }

    /*
    * for the first occurance if key == mid then store the value and set end with mid-1 as it is possible that
    * there must be same number as mid before mid...
    * */
    static int firstOcc(int[] arr, int arrSize, int key) {
        int start = 0;
        int end = arrSize - 1;
        int ans = -1;

        while (start<=end)
        {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }
            else if(key < arr[mid]) {
                end = mid - 1;
            }

            mid = start + (end - start) / 2;

        }
        return ans;
    }

    /*
    * for last occurance if key == mid then store the value and set start = mid+1 as it is possible that
     * there must be same number as mid after mid
    *
    * */
    static int lastOcc(int[] arr, int arrSize, int key) {
        int start = 0;
        int end = arrSize - 1;
        int ans = -1;
        int mid = start + (end - start) / 2;

        while (start<=end)
        {
            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }
            else if(key < arr[mid]) {
                end = mid - 1;
            }

            mid = start + (end - start) / 2;

        }
        return ans;
    }
}
