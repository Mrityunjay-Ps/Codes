package JAVA.learn.Generics;

public class DemoGen<T> {
    T[] data =(T[]) new Object[3];

    public static void main(String[] args) {
        DemoGen<String> gd = new DemoGen();

        gd.data[0] = "Jay";
        gd.data[1] = "Singh";
        gd.data[3] = "10";
    }
}
