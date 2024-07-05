package Java.practice.excep;

class Test2 {
    public static void main(String[] args) {
        try {
            int[] A = {10, 0, 5, 8, 3};
            int r;
            r = A[0] / A[1];
            System.out.println(r);
            System.out.println(A[2]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
