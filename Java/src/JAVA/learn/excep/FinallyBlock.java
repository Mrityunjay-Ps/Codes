package Java.practice.excep;

class Finally {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final Message");
        }
    }
}
