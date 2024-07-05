package Java.kkDSAAlgo.Algo.al3BinarySearchIn2DArrays;
/*
* This is a brute force method...
* */
public class firstBruteForce {
    public static void main(String[] args) {
        int[][] arrTwoD = {
                {4, 8, 12}, //0 index
                {12, 18, 22},//1 index
                {14, 45, 28} //2 index
        };
        int target = 14;
        TwoDSearch(arrTwoD, target);
    }

    static void TwoDSearch(int[][] arr, int target) {
        //brute force method....
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr.length; j++) {
                if (arr[i][j]==target){
                    System.out.println(i+", "+j);
                }
            }
        }
    }
}
