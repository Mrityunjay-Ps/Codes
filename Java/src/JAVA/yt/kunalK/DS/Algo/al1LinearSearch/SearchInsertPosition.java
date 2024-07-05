package Java.kkDSAAlgo.Algo.al1LinearSearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 10};
        int target = 5;
        position(nums, target);
    }

    static int position(int[] arr, int target) {
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target)
            {
                return i;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (target<arr[j]&&arr[j]>target) {
                index=index+(j+1);
            }
        }
        return index;
    }
}
