package JAVA.learn.Generics;

public class GenMeth {

//    static <E> void show(E[] list) {
//        for (E x:list) {
//            System.out.println(x);
//        }
//    }
    static <E> void show(E... list) {
        for (E x:list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        show("Hello", "Hi", "Saw", "safe");
        show(10,45,23,34,45,434);
    }
}
