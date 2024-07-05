package JAVA.learn.excep;

class ER {

    public static void main(String[] args) {
        fun1();
    }

    static void fun1() {
        fun2();
    }

    static void fun2() {
        try {
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
