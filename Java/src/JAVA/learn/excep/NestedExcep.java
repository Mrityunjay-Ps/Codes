package Java.practice.excep;

class NestedExcep {
    public static void main(String[] args) {
        try{
            int[] B = {10,2,6,3,22};
            int r;

                try{
                    r = B[0]/B[1];
                    System.out.println("Answer is: "+r);
                }
                catch (ArithmeticException e){
                    System.out.println("Enter non-zero value...");
                }
            System.out.println(B[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
