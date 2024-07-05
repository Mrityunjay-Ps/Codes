package JAVA.yt.kunalK.DS.Algo.al1LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
//      Question 1:- Find weather number exist in the array or not....

        int[] nums  = {1, 5, 14, 88, 69, 87};
        int target = 142;
        System.out.println(linSearch(nums, target));
    }

    //Linear Search: return index if found
    //return -1 if array is empty
    static int linSearch(int[] arr, int target)
    {
        if (arr.length==0)
            return -1;

        //run for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index

            int element = arr[index];
            if (element==target){
                return index;
            }
        }
        //it runs when the above condition is false...
        return -1;
    }

    //search target and return element....
    static int linSearch2(int[] arr, int target)
    {
        if (arr.length==0)
            return -1;

        //run for loop
        for (int element : arr) {
            //check for element at every index
            if (element == target) {
                return element;
            }
        }
        //it runs when the above condition is false...
        return Integer.MAX_VALUE;
    }

    //return true or false
    static boolean linSearch3(int[] arr, int target)
    {
        if (arr.length==0)
            return false;

        //run for loop
        for (int element : arr) {
            //check for element at every index
            if (element == target) {
                return true;
            }
        }
        //it runs when the above condition is false...
        return false;
    }
}
