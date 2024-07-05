package Java.kkDSAAlgo.Algo.al2BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int [] arr = {2, 5, 11, 16, 21, 23, 55};
        int[] arr = {55, 23, 21, 16, 11, 5, 2};
        int target = 2;
        System.out.println(orderAgnosticBS(arr,target));
    }

    //return index
    //return -1 if no element found...
    static int orderAgnosticBS(int[] arr, int target)
    {
        //set start and end
        int Start = 0;
        int End = arr.length-1;

        while (Start<=End){
            int Mid = Start + (End-Start) / 2;

            if (arr[Mid]==target){
                return Mid;
            }

            if (arr[Start]<arr[Mid]){
                System.out.println("Accending: ");
                if (target < arr[Mid]){
                    End = Mid-1;
                }else {
                    Start = Mid + 1;
                }
            }else {
                System.out.println("Decending: ");
                if (target > arr[Mid]){
                    End = Mid-1;
                }else {
                    Start = Mid + 1;
                }
            }
        }
        return -1;
    }

}