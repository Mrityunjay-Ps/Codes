package Java.learn;

class test4{
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }
}
public class staticBlock1 {

    public static void main(String[] args) {
        System.out.println("main");
        test4 t4 = new test4();
    }
}
