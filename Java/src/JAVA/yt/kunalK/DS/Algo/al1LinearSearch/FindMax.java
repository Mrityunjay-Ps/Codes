package Java.kkDSAAlgo.Algo.al1LinearSearch;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1, 3, 25, -8, -1};

        System.out.println(maximum(arr));
    }

    static int maximum(int[] arr){
        if (arr.length==0)
            return Integer.MAX_VALUE;

        int setMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>setMax){
                setMax=arr[i];
            }
        }
        return setMax;
    }
}
