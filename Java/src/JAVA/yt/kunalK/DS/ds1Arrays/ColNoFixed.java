package Java.kkDSAAlgo.DS.ds1Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr2D = {
                {4, 8, 12}, //0 index
                {12, 18}, //1 index
                {14, 45, 28, 22} //2 index
        };

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.println(arr2D[row][col]);
            }
            System.out.println();
        }
    }
}
