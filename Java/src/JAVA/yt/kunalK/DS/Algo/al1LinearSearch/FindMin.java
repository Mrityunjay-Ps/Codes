package Java.kkDSAAlgo.Algo.al1LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1, 3, 25, -8, -1};

        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if (arr.length==0){
            return Integer.MAX_VALUE;
        }

        int minValue = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index]<minValue){
                minValue=arr[index];
            }
        }

        return minValue;
    }
}
