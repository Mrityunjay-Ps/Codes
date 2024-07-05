package Java.practice.excep;

class Xox {
    public static void main(String[] args) {
        int[] A = {10,2,5,68,23};
        int r;
        try{
            r = A[0]/A[1];
            System.out.println(r);
            System.out.println(A[10]);
        }catch (ArithmeticException e){
            System.out.println("Enter non zero value..");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Size is less than: "+A.length);
        }
        System.out.println("Bye");
    }
}
