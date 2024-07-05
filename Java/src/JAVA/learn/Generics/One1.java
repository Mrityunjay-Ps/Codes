package Java.learn.Generics;

public class
One1 <T>{
    T data[] = (T[]) new Object[3];

    public static void main(String[] args) {
        One1 <Integer> in = new One1();

        in.data[0] = 10;
        in.data[1] = 201;
//        in.data[0] = "Hello";
        int num1 = in.data[0];
        /*
        * --we cannot assign string in integer type generic
        * --Only one type of data can be stored in generic
        * --By mistake we stored any other type of data ide will give us error(not at runtime)
        * --we don't have to typecast it when we assign an object to an any other type (int num1 = in.data[0])
        *   as we were doing when we were using Object Class
        * */



    }
}
