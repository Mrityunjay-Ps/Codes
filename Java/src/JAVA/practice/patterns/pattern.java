package JAVA.practice.patterns;

public class pattern {
    public static void main(String[] args) {
        pattern5(4);
    }

    /*
     * * * *
     * * * *
     * * * *
     * * * *
     */
    static void pattern1(int n){
        //check the no. of row and run the outer loop that many times.
        for (int rows = 0; rows < n; rows++) {
            //check
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     */
    static void pattern2(int n){
        //check the no. of row and run the outer loop that many times.
        for (int rows = 0; rows <= n; rows++) {
            //check
            for (int col = 0; col < rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * *
     * * *
     * *
     *
     */
    static void pattern3(int n){
        //check the no. of row and run the outer loop that many times.
        for (int rows = 0; rows <= n; rows++) {
            //check
            for (int col = n; col >= rows; col--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    * 1
    * 12
    * 123
    * 1234
    * 12345
    * */
    static void pattern4(int n){
        //check the no. of row and run the outer loop that many times.
        for (int rows = 0; rows <= n; rows++) {
            //check
            for (int col = 0; col <= rows; col++) {
                System.out.print((col+1)+" ");
            }
            System.out.println();
        }
    }

    /*
    *
    *
    * *
    * * *
    * * * *
    * * *
    * *
    *
    * */

    static void pattern5(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRows = row>n?2*n-row:row;
            for (int col = 0; col < totalColInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
