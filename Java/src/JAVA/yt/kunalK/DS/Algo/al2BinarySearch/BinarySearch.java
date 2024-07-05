package JAVA.yt.kunalK.DS.Algo.al2BinarySearch;
/*
* In Binary Search we divide the array from the middle element in to 2 parts if our target element is smaller
* than mid we search left side and if not we search right side or if the mid is equal to target we found the
* element....
*
* Complexities:-
*   Best Case - O(1)
*   Worst Case - O(log n)
* */
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2, 5, 11, 16, 21, 23, 55};
        int target = 16;
        System.out.println(binarySearch(arr,target));
    }

    //return index
    //return -1 if it doesnot exist..
    static int binarySearch(int[] nums, int target)
    {
        int Start = 0;
        int End = nums.length-1;

        while (Start<=End){
            // int Mid = (Start+End)/2; //Here the problem is that (Start+End) can exceed the range of int in java
            //so the better way is...
            int Mid = Start + (End-Start) / 2;
            /*
            * Start + End - Start / 2
            * 2*Start + End - Start
            * One - One Start Cancle
            * * * (Start + End) / 2
            * */

            if (target < nums[Mid]){
                End = Mid-1;
            }else if (target > nums[Mid]){
                Start = Mid + 1;
            }else {
                return Mid;
            }
        }
        return -1;
    }
}
